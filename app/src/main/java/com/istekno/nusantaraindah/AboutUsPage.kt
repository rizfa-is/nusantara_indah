package com.istekno.nusantaraindah

import android.content.ClipData
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.about_us.*

class AboutUsPage : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_us)
        supportActionBar?.hide()
//        supportActionBar?.title = "My Profil"

        val btnEmailB = findViewById<ImageView>(R.id.btn_email_b)
        btnEmailB.setOnClickListener(this)
        val btnEmailText = findViewById<TextView>(R.id.email_text)
        btnEmailText.setOnClickListener(this)

        val btnIGB = findViewById<ImageView>(R.id.btn_ig_b)
        btnIGB.setOnClickListener(this)
        val btnIGText = findViewById<TextView>(R.id.ig_text)
        btnIGText.setOnClickListener(this)

        val btnWaB = findViewById<ImageView>(R.id.btn_whatsapp_b)
        btnWaB.setOnClickListener(this)
        val btnWaText = findViewById<TextView>(R.id.wa_text)
        btnWaText.setOnClickListener(this)

        val btnGithub = findViewById<ImageView>(R.id.btn_github_b)
        btnGithub.setOnClickListener(this)
        val btnGithubText = findViewById<TextView>(R.id.github_text)
        btnGithubText.setOnClickListener(this)

//        Navigation Bottom
        val bottomNavigation : ChipNavigationBar = findViewById(R.id.bottom_nav_test)
        bottomNavigation.setItemSelected(R.id.profil_nav)
        bottomNavigation.setOnItemSelectedListener{
            when(it) {
                R.id.home_nav -> {
                    val intent = Intent(this,MainActivity::class.java)
                    startActivity(intent)
                }

                R.id.content_nav -> {
                    val intent = Intent(this,ChooseProvince::class.java)
                    startActivity(intent)
                }
            }
        }
//        Navigation Bottom
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_email_b, R.id.email_text -> {
                val intent = Intent(Intent.ACTION_SEND)
                intent.data = Uri.parse("Email")
                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("rosyidrosadi15@gmail.com"))
                intent.putExtra(Intent.EXTRA_SUBJECT,"User Nusantara Indah")
                intent.putExtra(Intent.EXTRA_TEXT,"Hi Rosyid. \nSaya User Nusantara Indah")
                intent.type = "message/rfc822"
                startActivity(intent)
            }

            R.id.btn_whatsapp_b, R.id.wa_text -> {
                val webWhatsapp : Intent = Uri.parse("https://api.whatsapp.com/send?phone=+6285735321687&text=Hai Rosyid!%0ASaya User Nusantara Indah.")
                    .let { webpage -> Intent(Intent.ACTION_VIEW, webpage)
                    }
                startActivity(webWhatsapp)
            }

            R.id.btn_ig_b, R.id.ig_text -> {
                val webIG : Intent = Uri.parse("https://www.instagram.com/rosyid_arsha/")
                    .let { webpage -> Intent(Intent.ACTION_VIEW, webpage)
                    }
                startActivity(webIG)
            }

            R.id.btn_github_b, R.id.github_text -> {
                val webGithub : Intent = Uri.parse("https://github.com/rizfa-is")
                    .let { webpage -> Intent(Intent.ACTION_VIEW, webpage)
                    }
                startActivity(webGithub)
            }
        }
    }
}


