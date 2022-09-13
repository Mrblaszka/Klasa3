    package com.example.klasa3_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = findViewById<TextView>(R.id.tekst1)
        findViewById<Button>(R.id.button3).setBackgroundColor(Color.YELLOW);
    }
}