package com.istekno.nusantaraindah

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.istekno.nusantaraindah.destinationjatim.DestinationMain

class DetailsPageMain() : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_page)
        supportActionBar?.hide()

        val destination = intent.getParcelableExtra<Destination>(DestinationMain.INTENT_PARCELABLE)

        val imgDetail : ImageView = findViewById(R.id.img_detail_page)
        val detailName : TextView = findViewById(R.id.name_destination_detail_page)
        val detailLoc : TextView = findViewById(R.id.loc_destination_detail_page)
        val detailDesc : TextView = findViewById(R.id.desc_detail_page)
        val btn_goMap : Button = findViewById(R.id.gomap_detail_page)

        if (destination != null) {
            imgDetail.setImageResource(destination.photo)
            detailName.text = destination.name
            detailLoc.text = destination.location
            detailDesc.text = destination.description

            btn_goMap.setOnClickListener{
                val mUriIntent = Uri.parse("geo:0,0?q=${detailName.text.toString() + " " + detailLoc.text.toString()}")
                val mMapIntent = Intent(Intent.ACTION_VIEW, mUriIntent)
                mMapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mMapIntent)
            }
        }
    }

}