package com.istekno.nusantaraindah

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.about_us.*

class AboutUsPage : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_us)
        supportActionBar?.title = "My Profil"

        val btnEmailA = findViewById<CircleImageView>(R.id.btn_email_a)
        btnEmailA.setOnClickListener(this)
        val btnEmailB = findViewById<ImageView>(R.id.btn_email_b)
        btnEmailB.setOnClickListener(this)

        val btnIGA = findViewById<CircleImageView>(R.id.btn_ig_a)
        btnIGA.setOnClickListener(this)
        val btnIGB = findViewById<ImageView>(R.id.btn_ig_b)
        btnIGB.setOnClickListener(this)

        val btnWaA = findViewById<CircleImageView>(R.id.btn_whatsapp_a)
        btnWaA.setOnClickListener(this)
        val btnWaB = findViewById<ImageView>(R.id.btn_whatsapp_b)
        btnWaB.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_email_a, R.id.btn_email_b -> {
                val intent = Intent(Intent.ACTION_SEND)
                intent.data = Uri.parse("Email")
                intent.type = "message/rfc822"
                intent.putExtra(Intent.EXTRA_EMAIL,"rosyidrosadi15@gmail.com")
                intent.putExtra(Intent.EXTRA_SUBJECT,"User Nusantara Indah")
                intent.putExtra(Intent.EXTRA_TEXT,"Hi Rosyid. \nSaya User Nusantara Indah")
                startActivity(intent)
            }

            R.id.btn_whatsapp_a, R.id.btn_whatsapp_b -> {
                val webWhatsapp : Intent = Uri.parse("https://api.whatsapp.com/send?phone=+6285735321687&text=Hai Rosyid!%0ASaya User Nusantara Indah.")
                    .let { webpage -> Intent(Intent.ACTION_VIEW, webpage)
                    }
                startActivity(webWhatsapp)
            }

            R.id.btn_ig_a, R.id.btn_ig_b -> {
                val webIG : Intent = Uri.parse("https://www.instagram.com/rosyid_arsha/")
                    .let { webpage -> Intent(Intent.ACTION_VIEW, webpage)
                    }
                startActivity(webIG)
            }
        }
    }
}

