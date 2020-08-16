package com.istekno.nusantaraindah

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.bottom_navigation.*

class BottomNavigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_navigation)

        navigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.browseContent -> {
                    val chooseProvince = Intent(this,ChooseProvince::class.java)
                    startActivity(chooseProvince)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.favorit_nav -> {
                    val favoritPage = Intent(this,MainActivity::class.java)
                    startActivity(favoritPage)
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.profil_nav -> {
                    val profilPage = Intent(this,AboutUsPage::class.java)
                    startActivity(profilPage)
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}