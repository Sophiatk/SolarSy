package com.example.finaluri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class earthviewpager : AppCompatActivity() {
    lateinit var viewpager : ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.earthviewpager)

        viewpager=findViewById(R.id.pagerearth)

        val fragments : ArrayList<Fragment> = arrayListOf(
            earth1(),
            earth2()
        )

        val  adapter =ViewPagerAdapter(fragments, this)
        viewpager.adapter=adapter

    }

}

