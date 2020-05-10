package com.rn7417.covid19projekat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.activity_login.*

class EditProfileActivity : AppCompatActivity(R.layout.activity_edit_profile) {

    companion object {
        var MESSAGE = ""
        val DURATION = Toast.LENGTH_SHORT
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }
    private fun init(){
        fillData()
        editData()
        odustani()
    }
    private fun fillData(){
        val settings = getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE)
        lastnameeditTv.setText(settings.getString("lastname", "ERROR"))
        firstnameeditTv.setText(settings.getString("firstname", "ERROR"))
        bolnicaeditTv.setText(settings.getString("bolnica", "ERROR"))
    }
    private fun editData(){
        izmeniBtn.setOnClickListener{

                if(firstnameTv.text.isNotEmpty()){
                    if(lastnameTv.text.isNotEmpty()){
                        if(bolnicaTv.text.isNotEmpty()){
                            val settings = getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE)
                            val editor = settings.edit()
                            //editor.clear()
                            editor.putBoolean("isLogged", true)
                            editor.putString("firstname", firstnameeditTv.text.toString())
                            editor.putString("lastname", lastnameeditTv.text.toString())
                            editor.putString("bolnica", bolnicaeditTv.text.toString())
                            editor.commit()

                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        }else{
                            LoginActivity.MESSAGE = "Morate navesti bolnicu"
                            popupToast()
                        }
                    }else{
                        LoginActivity.MESSAGE = "Prezime ne sme biti prazno"
                        popupToast()
                    }
                }else{
                    LoginActivity.MESSAGE = "Ime ne sme biti prazno"
                    popupToast()
                }
        }

    }
    private fun popupToast(){
        val toast = Toast.makeText(applicationContext,
            MESSAGE,
            DURATION
        )
        toast.show()
    }
    private fun odustani(){
        odustaniBtn.setOnClickListener{
            finish()
        }

    }

}


