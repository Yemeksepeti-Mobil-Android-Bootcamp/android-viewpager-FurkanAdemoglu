package com.example.viewpagerassignment.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerassignment.fragments.firstscreen.FirstFragment
import com.example.viewpagerassignment.fragments.secondscreen.SecondFragment
import com.example.viewpagerassignment.fragments.thirdscreen.ThirdFragment


private const val FRAGMENT_COUNT=3
class ViewPagerAdapter(activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->FirstFragment()
            1->SecondFragment()

            else->ThirdFragment()
        }
    }

}