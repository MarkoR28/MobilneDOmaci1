package com.rn7417.covid19projekat.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.rn7417.covid19projekat.fragments.FirstFragment
import com.rn7417.covid19projekat.fragments.FourthFragment
import com.rn7417.covid19projekat.fragments.SecondFragment
import com.rn7417.covid19projekat.fragments.ThirdFragment

class PagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        private const val ITEM_COUNT = 4
        const val FRAGMENT_1 = 0
        const val FRAGMENT_2 = 1
        const val FRAGMENT_3 = 2
        const val FRAGMENT_4 = 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            FRAGMENT_1 -> FirstFragment()
            FRAGMENT_2 -> SecondFragment()
            FRAGMENT_3 -> ThirdFragment()
            else -> FourthFragment()
        }
    }

    override fun getCount(): Int {
        return ITEM_COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            FRAGMENT_1 -> "1"
            FRAGMENT_2 -> "2"
            FRAGMENT_3 -> "3"
            else -> "4"
        }
    }

}
