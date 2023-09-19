package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* Step 1: Populate this array */
        //val numberArray = Array Of Numbers
        val numberArray = Array<Int>(100) {it * 1}

        /* Step 2: Create adapter to display items from array in Spinner */
        //spinner.adapter = ArrayAdapter...
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, numberArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Step 3: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...

    }
}