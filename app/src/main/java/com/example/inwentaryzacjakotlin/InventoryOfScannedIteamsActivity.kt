package com.example.inwentaryzacjakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InventoryOfScannedIteamsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory_of_scanned_iteams)

        val scanButton = findViewById<Button>(R.id.buttonScan)

        scanButton.setOnClickListener {
            val intent = Intent(this, Scan::class.java)
            startActivity(intent)
        }


    }


}