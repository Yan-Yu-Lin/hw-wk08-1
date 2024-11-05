package com.example.lab4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Step 1: Declare an ActivityResultLauncher to handle results from SecActivity.
    private val startForResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult ->
        // Step 12: Check if the result is RESULT_OK, and execute the following if true.
        if (result.resultCode == Activity.RESULT_OK) {
            // Step 13: Retrieve the returned Intent and extract values for drink, sugar level, and ice quantity.
            val intent = result.data
            val drink = intent?.getStringExtra("drink")
            val sugar = intent?.getStringExtra("sugar")
            val ice = intent?.getStringExtra("ice")
            // Step 14: Update the TextView (tvMeal) with the selected drink details.
            val tvMeal = findViewById<TextView>(R.id.tvMeal)
            tvMeal.text = "Drink: $drink\n\nSugar Level: $sugar\n\nIce: $ice"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handle window insets to avoid UI elements overlapping system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, systemBarsInsets.bottom)
            insets
        }

        // Step 2: Define the button variable and retrieve the button using findViewById
        val btnChoice = findViewById<Button>(R.id.btnChoice)

        // Step 3: Set an OnClickListener for btnChoice
        btnChoice.setOnClickListener {
            // Step 4: Create an Intent to switch from MainActivity to SecActivity
            val intent = Intent(this, SecActivity::class.java)

            // Step 5: Launch the Intent using startForResult to wait for a result from SecActivity
            startForResult.launch(intent)
        }
    }
}
