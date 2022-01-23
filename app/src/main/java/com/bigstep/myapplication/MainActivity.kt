package com.bigstep.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bigstep.mylibrary.TestActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, TestActivity::class.java))
        }
    }
}