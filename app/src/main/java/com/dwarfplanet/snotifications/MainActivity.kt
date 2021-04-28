package com.dwarfplanet.snotifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intent?.getStringExtra("data")?.let {
            findViewById<TextView>(R.id.tv_text).text = it
        }
    }
}