package com.istekno.nusantaraindah.destinationjatim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.istekno.nusantaraindah.Destination
import com.istekno.nusantaraindah.R
import java.util.ArrayList

class DestinationListAdapter(private val listDestination: ArrayList<Destination>) : RecyclerView.Adapter<DestinationListAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Destination)
    }

//    ////////////////////////////////////////////////////////////////////////////////////////////////
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView) {
        var destiImg: ImageView = itemView.findViewById(R.id.img_profil_list)
        var destiName: TextView = itemView.findViewById(R.id.name_destination)
        var destCity: TextView = itemView.findViewById(R.id.loc_destination)
        val btnFavorite: ImageView = itemView.findViewById(R.id.btn_favorite_list)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.recycler_view_list, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDestination.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val place = listDestination[position]

        Glide.with(holder.itemView.context)
            .load(place.photo)
            .apply(RequestOptions().override(150, 150))
            .into(holder.destiImg)

//        Glide.with(holder.itemView.context)
//            .load(place.favorite)
//            .apply(RequestOptions().override(55, 55))
//            .into(holder.btnFavorite)

        holder.destiName.text = place.name
        holder.destCity.text = place.location
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listDestination[holder.adapterPosition]) }
    }


}