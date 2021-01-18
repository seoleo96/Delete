package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "Bla Bla Bla"
            startActivity<MainActivity2>(this)
        }
    }
    private inline fun <reified T> startActivity(context: Context) {
        startActivity(Intent(context, T::class.java))
    }


}