package com.vatsal.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekbar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener {
            val rand = java.util.Random().nextInt(seekbar.progress)
            resultsTextView.text = rand.toString()
        }
    }
}