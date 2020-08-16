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

class DestinationCardAdapter(private val cardDestination: ArrayList<Destination>) : RecyclerView.Adapter<DestinationCardAdapter.CardViewHolder>() {

    //    ClickCallBack 1
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Destination)
    }

//    ClickCallBack 2
    private lateinit var onItemClickCallback2: OnItemClickCallback2

    fun setOnItemClickCallback2(onItemClickCallback2: OnItemClickCallback2) {
        this.onItemClickCallback2 = onItemClickCallback2
    }

    interface OnItemClickCallback2 {
        fun onItemClicked2(data: Destination)
    }


    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var destiImg: ImageView = itemView.findViewById(R.id.img_profil_card)
        var destiName: TextView = itemView.findViewById(R.id.name_destination_card)
        var destDesc: TextView = itemView.findViewById(R.id.desc_destination_card)
        val btn_detail = itemView.findViewById<TextView>(R.id.btn_detail_card)
        val btn_goMap = itemView.findViewById<TextView>(R.id.btn_goto_map_card)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): CardViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.recycler_view_card, viewGroup, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cardDestination.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val place = cardDestination[position]

        Glide.with(holder.itemView.context)
            .load(place.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.destiImg)

        holder.destiName.text = place.name
        holder.destDesc.text = place.description
//        holder.btn_detail.setOnClickListener {
//            Toast.makeText(holder.itemView.context, "Detail " + cardDestination[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
//        }
//        holder.btn_goMap.setOnClickListener {
//            Toast.makeText(holder.itemView.context, "Go to " + cardDestination[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
//        }

        holder.btn_detail.setOnClickListener { onItemClickCallback.onItemClicked(cardDestination[holder.adapterPosition]) }
        holder.btn_goMap.setOnClickListener { onItemClickCallback2.onItemClicked2(cardDestination[holder.adapterPosition]) }
//        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(cardDestination[holder.adapterPosition]) }
    }
}