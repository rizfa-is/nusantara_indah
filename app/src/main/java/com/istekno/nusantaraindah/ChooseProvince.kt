package com.istekno.nusantaraindah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.istekno.nusantaraindah.destinationjateng.DestinationMainJateng
import com.istekno.nusantaraindah.destinationjatim.DestinationMain

class ChooseProvince : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_province)
        supportActionBar?.title = "Pilih Provinsi"

//        val btnBack: ImageButton = findViewById(R.id.btn_back)
//        btnBack.setOnClickListener(this)

        val btnJatim: CardView = findViewById(R.id.choose_jatim)
        btnJatim.setOnClickListener(this)

        val btnJateng: CardView = findViewById(R.id.choose_jateng)
        btnJateng.setOnClickListener(this)

        //        Navigation Bottom
        val bottomNavigation : ChipNavigationBar = findViewById(R.id.bottom_nav_test)
        bottomNavigation.setItemSelected(R.id.content_nav)
        bottomNavigation.setOnItemSelectedListener{
            when(it) {
                R.id.home_nav -> {
                    val intent = Intent(this,MainActivity::class.java)
                    startActivity(intent)
                }

                R.id.profil_nav -> {
                    val intent = Intent(this,AboutUsPage::class.java)
                    startActivity(intent)
                }
            }
        }
//        Navigation Bottom
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

            R.id.choose_jateng -> {
                val chooseJateng = Intent(this@ChooseProvince, DestinationMainJateng::class.java)
                startActivity(chooseJateng)
            }
        }
    }
}