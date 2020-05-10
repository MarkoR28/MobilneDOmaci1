package com.rn7417.covid19projekat.fragments

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.rn7417.covid19projekat.EditProfileActivity
import com.rn7417.covid19projekat.LoginActivity
import com.rn7417.covid19projekat.MainActivity
import com.rn7417.covid19projekat.R
import kotlinx.android.synthetic.main.activity_fourth_fragment.*
import kotlinx.android.synthetic.main.activity_login.*

class FourthFragment : Fragment(R.layout.activity_fourth_fragment)
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }
    private fun init()
    {
        fillTextViews()
        logOut()
        openNew()
    }
    private fun fillTextViews(){
        val settings = this.activity?.getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE)
        profilImeDataTv.setText(settings?.getString("firstname", "ERROR"))
        profilPrezimeDataTv.setText(settings?.getString("lastname", "ERROR"))
        profilBolnicaDataTv.setText(settings?.getString("bolnica", "ERROR"))
    }
    private fun logOut(){
        odjavaBtn.setOnClickListener{
            val settings = this.activity?.getSharedPreferences("sharedPreferences", Context.MODE_PRIVATE)
            val editor = settings?.edit()
            editor?.clear()
            editor?.commit()
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
            this.activity?.finish()
        }
    }
    private fun openNew(){
        izmeniBtn.setOnClickListener{
            val intent = Intent(activity, EditProfileActivity::class.java)
            startActivity(intent)
        }

    }
}
