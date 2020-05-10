package com.rn7417.covid19projekat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rn7417.covid19projekat.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }
    private fun init() {
        initViewPager()
        initNavigation()
    }

    private fun initViewPager() {
        viewPager.adapter = PagerAdapter(supportFragmentManager)
    }

    private fun initNavigation() {
        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.bottomStanje ->  {
                    viewPager.setCurrentItem(PagerAdapter.FRAGMENT_1, false)
                }
                R.id.bottomUnos ->  {
                    viewPager.setCurrentItem(PagerAdapter.FRAGMENT_2, false)
                }
                R.id.bottomListe ->  {
                    viewPager.setCurrentItem(PagerAdapter.FRAGMENT_3, false)
                }
                R.id.bottomProfil ->  {
                    viewPager.setCurrentItem(PagerAdapter.FRAGMENT_4, false)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

}
