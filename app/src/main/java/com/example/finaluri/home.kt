package com.example.finaluri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.content.Intent

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val mercurybutton = findViewById<ImageView>(R.id.mercury)

        mercurybutton.setOnClickListener {
            val intent = Intent(this, mercutyviewpage::class.java)
            startActivity(intent)
        }

        val venusbutton = findViewById<ImageView>(R.id.venus)
        venusbutton.setOnClickListener {
            val intent1 = Intent(this, venusviewpage::class.java)
            startActivity(intent1)
        }

        val earthbutton = findViewById<ImageView>(R.id.earth)
        earthbutton.setOnClickListener {
            val intent2 = Intent(this, earthviewpager::class.java)
            startActivity(intent2)
        }
        val marsbutton = findViewById<ImageView>(R.id.mars)
        marsbutton.setOnClickListener {
            val intent3 = Intent(this, marsviewpage::class.java)
            startActivity(intent3)
        }
        val jupiterbutton = findViewById<ImageView>(R.id.jupiter)
        jupiterbutton.setOnClickListener {
            val intent4 = Intent(this, jupiterviewpager::class.java)
            startActivity(intent4)
        }
        val saturnbutton = findViewById<ImageView>(R.id.saturn)
        saturnbutton.setOnClickListener {
            val intent5 = Intent(this, saturnviewpage::class.java)
            startActivity(intent5)
        }
        val uranusbutton = findViewById<ImageView>(R.id.uranus)
        uranusbutton.setOnClickListener {
            val intent6 = Intent(this, uranusviewpage::class.java)
            startActivity(intent6)
        }
        val neptunebutton = findViewById<ImageView>(R.id.neptune)
        neptunebutton.setOnClickListener {
            val intent7 = Intent(this, neptuneviewpage::class.java)
            startActivity(intent7)
        }

    }
}