package com.example.asessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_register = findViewById<Button>(R.id.nextregisterpage) //ini tombol register yang pengen di pencet
        btn_register.setOnClickListener {
            val Intent = Intent(this, RegisterPage::class.java)
            startActivity(Intent)
        }

        val btn_login = findViewById<Button>(R.id.nextloginpage) //ini tombol login yang pengen di pencet
        btn_login.setOnClickListener {
            val Intent = Intent(this, LoginPage::class.java)
            startActivity(Intent)
        }
    }
}