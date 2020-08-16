package com.istekno.nusantaraindah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class ChooseProvince : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_province)
        supportActionBar?.title = "Pilih Provinsi"

//        val btnBack: ImageButton = findViewById(R.id.btn_back)
//        btnBack.setOnClickListener(this)

        val btnJatim: CardView = findViewById(R.id.choose_jatim)
        btnJatim.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
//            R.id.btn_back -> {
//                val mainActivity = Intent(this@ChooseProvince, MainActivity::class.java)
//                startActivity(mainActivity)
//            }

            R.id.choose_jatim -> {
                val chooseJatim = Intent(this@ChooseProvince, DestinationMain::class.java)
                startActivity(chooseJatim)
            }
        }
    }
}