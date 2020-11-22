package com.example.apamproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        val button = findViewById<Button>(R.id.masuk_button)
        button.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(Intent())
        }
    }
}