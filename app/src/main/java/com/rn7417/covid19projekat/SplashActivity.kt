package com.rn7417.covid19projekat

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity(R.layout.activity_splash) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dugme.setOnClickListener{
            nesto()
        }
     //   val settings = getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE)

    }
    fun appIsPurchased(): Boolean {
        val settings = getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE)
        return settings.getBoolean("isLogged", false)
    }
    fun nesto(){
        val isLogged = appIsPurchased()
        if (isLogged) {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        } else {
            val intent = Intent(this, LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        finish()
    }
}
