package com.example.lab6

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handling window insets to avoid UI elements overlapping with system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, systemBarsInsets.bottom)
            insets
        }

        // Define component variables and get them using findViewById
        val toastButton = findViewById<Button>(R.id.btnToast)
        val snackbarButton = findViewById<Button>(R.id.btnSnackBar)
        val alertDialogButton1 = findViewById<Button>(R.id.btnDialog1)
        val alertDialogButton2 = findViewById<Button>(R.id.btnDialog2)
        val alertDialogButton3 = findViewById<Button>(R.id.btnDialog3)

        // Create an array of strings to be used in the alert dialog lists
        val optionsArray = arrayOf("Option 1", "Option 2", "Option 3", "Option 4", "Option 5")

        // Set click listeners for buttons

        // Toast Button: Display a simple Toast message
        toastButton.setOnClickListener {
            showToast("Default Toast Message")
        }

        // Snackbar Button: Show a Snackbar with an action button
        snackbarButton.setOnClickListener {
            Snackbar.make(it, "Button-Click Snackbar", Snackbar.LENGTH_SHORT)
                .setAction("Respond") {
                    showToast("Action clicked!")
                }.show()
        }

        // AlertDialog Button 1: Show an AlertDialog with multiple buttons
        alertDialogButton1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Button-Based AlertDialog")
                .setMessage("This is an AlertDialog with buttons")
                .setNeutralButton("Left Button") { dialog, _ ->
                    showToast("Left Button Clicked")
                }
                .setNegativeButton("Middle Button") { dialog, _ ->
                    showToast("Middle Button Clicked")
                }
                .setPositiveButton("Right Button") { dialog, _ ->
                    showToast("Right Button Clicked")
                }.show()
        }

        // AlertDialog Button 2: Show a list-based AlertDialog
        alertDialogButton2.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("List-Based AlertDialog")
                .setItems(optionsArray) { dialog, which ->
                    // Show the selected option in a Toast message
                    showToast("You selected: ${optionsArray[which]}")
                }.show()
        }

        // AlertDialog Button 3: Show a single-choice AlertDialog
        alertDialogButton3.setOnClickListener {
            // Variable to store the selected option from the dialog
            var selectedOptionIndex = 0
            AlertDialog.Builder(this)
                .setTitle("Single Choice AlertDialog")
                // Define the list of choices and set the default selected item to the first one
                .setSingleChoiceItems(optionsArray, 0) { _, which ->
                    // Update the selected option index when an option is clicked
                    selectedOptionIndex = which
                }
                .setPositiveButton("Confirm") { _, _ ->
                    // Show the selected option when the user confirms
                    showToast("You selected: ${optionsArray[selectedOptionIndex]}")
                }.show()
        }
    }

    // Helper method to display Toast messages
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
