package com.example.asus.resepjamutradisional

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resep_jamu_tradisional.*

class resep_jamu_tradisional : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resep_jamu_tradisional)

        val jamu_beraskencur = Intent(this, resep_jamuberaskencur::class.java)
        val jamu_daunpepaya = Intent(this, resep_jamudaunpepaya::class.java)
        val jamu_kunyitasam = Intent(this, resep_jamukunyitasam::class.java)
        val jamu_bersihdarah = Intent(this, resep_jamubersihdarah::class.java)
        val jamu_cabaipuyung = Intent(this, resep_jamucabaipuyung::class.java)
        val jamu_temu_lawak = Intent(this, resep_jamutemulawak::class.java)
        val jamu_penyubur = Intent(this, resep_jamupenyuburkandungan::class.java)

        beras_kencur.setOnClickListener { view ->
            startActivity(jamu_beraskencur)
        }

        jamu_daun_pepaya.setOnClickListener { view ->
            startActivity(jamu_daunpepaya)
        }

        kunyit_asam.setOnClickListener { view ->
            startActivity(jamu_kunyitasam)
        }

        jamu_bersih_darah.setOnClickListener { view ->
            startActivity(jamu_bersihdarah)
        }

        jamu_cabai_puyung.setOnClickListener { view ->
            startActivity(jamu_cabaipuyung)
        }

        temulawak.setOnClickListener { view ->
            startActivity(jamu_temu_lawak)
        }

        penyubur_kandungan.setOnClickListener { view ->
            startActivity(jamu_penyubur)
        }






}
}
