package com.example.inwentaryzacjakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.buttonStart)

        startButton.setOnClickListener {
            val intent = Intent(this@MainActivity, InventoryOfScannedIteamsActivity::class.java)
            startActivity(intent)
        }

    }
}