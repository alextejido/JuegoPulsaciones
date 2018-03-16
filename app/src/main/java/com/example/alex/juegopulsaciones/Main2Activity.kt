package com.example.alex.juegopulsaciones

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val objetointent : Intent =intent
        numpulsaciones.setText(objetointent.getStringExtra("Dato"))
        val bgImage = celula.background as AnimationDrawable
        bgImage.start()


    }
}
