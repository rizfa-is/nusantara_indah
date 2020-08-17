package com.istekno.nusantaraindah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import androidx.core.os.HandlerCompat.postDelayed

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //making this activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnSplashAyo: Button = findViewById(R.id.btn_splash_ayo)
        btnSplashAyo.setOnClickListener(this)

        val btnSplashFavorit: Button = findViewById(R.id.btn_splash_favorit)
        btnSplashFavorit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_splash_ayo -> {
                Toast.makeText(this, "Ayo berpetualang !", Toast.LENGTH_SHORT).show()
                val chooseProv = Intent(this@MainActivity, ChooseProvince::class.java)
                startActivity(chooseProv)
            }

            R.id.btn_splash_favorit -> {
                Toast.makeText(this, "Go to Profil", Toast.LENGTH_SHORT).show()
                val chooseProfil = Intent(this@MainActivity, AboutUsPage::class.java)
                startActivity(chooseProfil)
            }
        }
    }
}

/*
TODO - Add Splash Screen
TODO - Add Favorit Feature using Room Database or SQL
TODO - Add Bottom Navigation : Home, Content, Favorit, My Profil
TODO - Customize back button in details page
TODO - Customize recycler view option menu on action bar
TODO - Customize action bar & status bar
*/