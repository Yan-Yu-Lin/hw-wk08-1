package com.example.lab5

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handle window insets to prevent UI elements from overlapping system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, systemBarsInsets.bottom)
            insets
        }

        Log.e("MainActivity", "onCreate")

        // Get the ViewPager2 component
        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager2)

        // Create the ViewPagerAdapter and set it to the ViewPager2
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager, this.lifecycle)
        viewPager2.adapter = pagerAdapter

        // Set the offscreen page limit to pre-load adjacent pages
        viewPager2.offscreenPageLimit = 1
    }

    // Called when the activity is restarting after being stopped
    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity", "onRestart")
    }

    // Called when the activity becomes visible to the user
    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart")
    }

    // Called when the activity is ready to start interacting with the user
    override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume")
    }

    // Called when the activity is partially obscured by another activity
    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause")
    }

    // Called when the activity is no longer visible to the user
    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop")
    }

    // Called before the activity is destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "onDestroy")
    }
}
