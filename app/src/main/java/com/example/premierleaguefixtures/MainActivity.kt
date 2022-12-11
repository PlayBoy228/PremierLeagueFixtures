package com.example.premierleaguefixtures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.place_holder, FirstFragment.newInstance()).commit();
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.place_holder, SecondFragment.newInstance()).commit()

        }
    }
}