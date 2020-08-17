package com.istekno.nusantaraindah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class DestinationGridAdapter(private val gridDestination: ArrayList<Destination>) : RecyclerView.Adapter<DestinationGridAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Destination)
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView) {
        var destiImg: ImageView = itemView.findViewById(R.id.img_profil_grid)
        val btnFavorite: ImageView = itemView.findViewById(R.id.btn_favorite_grid)
        val btnCircle: ImageView = itemView.findViewById(R.id.btn_favorite_circle)
        var destiName: TextView = itemView.findViewById(R.id.name_destination_grid)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.recycler_view_grid, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return gridDestination.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val place = gridDestination[position]

        Glide.with(holder.itemView.context)
            .load(place.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.destiImg)

//        Glide.with(holder.itemView.context)
//            .load(place.favorite)
//            .apply(RequestOptions().override(55, 55))
//            .into(holder.btnFavorite)
//
//        Glide.with(holder.itemView.context)
//            .load(place.circle)
//            .apply(RequestOptions().override(55, 55))
//            .into(holder.btnCircle)

        holder.destiName.text = place.name

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(gridDestination[holder.adapterPosition]) }
    }


}