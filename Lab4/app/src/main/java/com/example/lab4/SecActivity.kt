package com.example.lab4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sec)

        // Handle window insets to prevent UI elements from overlapping system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, systemBarsInsets.bottom)
            insets
        }

        // Step 6: Define UI components and retrieve them using findViewById
        val edDrink = findViewById<TextView>(R.id.edDrink)
        val rgSugar = findViewById<RadioGroup>(R.id.rgSugar)
        val rgIce = findViewById<RadioGroup>(R.id.rgIce)
        val btnSend = findViewById<Button>(R.id.btnSend)

        // Step 7: Set an onClickListener for the send button (btnSend)
        btnSend.setOnClickListener {
            // Step 8: Show a Toast message if the drink name is empty
            if (edDrink.text.isEmpty()) {
                Toast.makeText(this, "Please enter a drink name", Toast.LENGTH_SHORT).show()
            } else {
                // Step 9: Create a Bundle and add the drink name, sugar level, and ice level to it
                val bundle = bundleOf(
                    "drink" to edDrink.text.toString(),
                    "sugar" to rgSugar.findViewById<RadioButton>(
                        rgSugar.checkedRadioButtonId
                    ).text.toString(),
                    "ice" to rgIce.findViewById<RadioButton>(
                        rgIce.checkedRadioButtonId
                    ).text.toString()
                )

                // Step 10: Create an Intent and attach the Bundle to it
                val intent = Intent().putExtras(bundle)

                // Step 11: Set the result of this activity and close it
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}
