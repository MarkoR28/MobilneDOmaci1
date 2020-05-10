package com.rn7417.covid19projekat

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import timber.log.Timber

class LoginActivity : AppCompatActivity(R.layout.activity_login) {

    companion object {
        var MESSAGE = ""
        val DURATION = Toast.LENGTH_SHORT
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        unesitepinBtn.setOnClickListener{
            pin4Et.visibility = View.VISIBLE
            pin3Et.visibility = View.VISIBLE
            pin2Et.visibility = View.VISIBLE
            pin1Et.visibility = View.VISIBLE
        }

        prijavaBtn.setOnClickListener{

            if(pin1Et.text.toString() == "1" && pin2Et.text.toString() == "2" && pin3Et.text.toString() == "3" && pin4Et.text.toString() == "4") {
                if(firstnameTv.text.isNotEmpty()){
                    if(lastnameTv.text.isNotEmpty()){
                        if(bolnicaTv.text.isNotEmpty()){
                            val settings = getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE)
                            val editor = settings.edit()
                            editor.clear()
                            editor.putBoolean("isLogged", true)
                            editor.putString("firstname", firstnameTv.text.toString())
                            editor.putString("lastname", lastnameTv.text.toString())
                            editor.putString("bolnica", bolnicaTv.text.toString())
                            editor.commit()

                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        }else{
                            MESSAGE = "Morate navesti bolnicu"
                            popupToast()
                        }
                    }else{
                        MESSAGE = "Prezime ne sme biti prazno"
                        popupToast()
                    }
                }else{
                    MESSAGE = "Ime ne sme biti prazno"
                    popupToast()
                }

            }else
            {
                MESSAGE = "Neispravan pin"
                popupToast()
            }
        }
    }
    private fun popupToast(){
        val toast = Toast.makeText(applicationContext, MESSAGE, DURATION)
        toast.show()
    }
}
