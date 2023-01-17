package com.example.finaluri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class marsviewpage : AppCompatActivity() {
    lateinit var viewpager : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.marsviewpage)

        viewpager=findViewById(R.id.pagemars)

        val fragments : ArrayList<Fragment> = arrayListOf(
            mars1(),
            mars2()
        )

        val  adapter =ViewPagerAdapter(fragments, this)
        viewpager.adapter=adapter

    }

}