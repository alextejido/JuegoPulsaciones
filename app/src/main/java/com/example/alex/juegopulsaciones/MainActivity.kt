package com.example.alex.juegopulsaciones

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    var contador =0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        suma.setEnabled(false)

        empezar.setOnClickListener {
            object : CountDownTimer(10000, 1000) {

                override fun onTick(millisUntilFinished: Long) {
                    segundos.setText("" + millisUntilFinished / 1000)
                }

                override fun onFinish() {
                    segundos.setText("done!")
                    suma.setEnabled(false)
                    val intent = Intent(this@MainActivity,Main2Activity::class.java)
                    intent.putExtra("Dato" , contador.toString())
                    startActivity(intent)

                }

            }.start()
            empezar.setEnabled(false)
            suma.setEnabled(true)

        }
        suma.setOnClickListener {
            contador = contador + 1

        }

    }

}
