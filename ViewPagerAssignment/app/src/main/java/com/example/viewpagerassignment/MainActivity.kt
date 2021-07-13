package com.example.viewpagerassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerassignment.utils.ViewPagerAdapter
import com.example.viewpagerassignment.utils.ZoomOutPageTransformer
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     lateinit var viewPager:ViewPager2
    lateinit var dotsIndicator:DotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initViewPager()
    }

    private fun initViews(){
        viewPager=findViewById(R.id.viewPager)
         dotsIndicator = findViewById(R.id.dots_indicator)
    }

    private fun initViewPager(){
        val adapter= ViewPagerAdapter(this)

        viewPager.setPageTransformer(ZoomOutPageTransformer())
        viewPager.adapter=adapter
        dotsIndicator.setViewPager2(viewPager)
    }
}


