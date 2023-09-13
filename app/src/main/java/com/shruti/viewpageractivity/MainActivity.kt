package com.shruti.viewpageractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shruti.viewpageractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewPagerAdapter: ViewPagerAdapter
    var item = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        item.add(R.layout.view_pager_layout1)
        item.add(R.layout.view_pager_layout2)
        item.add(R.layout.view_pager_layout3)
        viewPagerAdapter = ViewPagerAdapter(item)
        binding.viewPager.adapter = viewPagerAdapter
    }
}