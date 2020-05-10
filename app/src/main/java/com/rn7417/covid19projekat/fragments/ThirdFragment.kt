package com.rn7417.covid19projekat.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.rn7417.covid19projekat.R
import com.rn7417.covid19projekat.adapter.TabsAdapter
import kotlinx.android.synthetic.main.activity_third_fragment.*

class ThirdFragment : Fragment(R.layout.activity_third_fragment)
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }
    private  fun init(){
        initTabs()
    }
    private fun initTabs(){
        viewPager.adapter = TabsAdapter(childFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
    }
}
