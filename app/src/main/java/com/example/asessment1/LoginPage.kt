package com.example.asessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val btn_masuk = findViewById<Button>(R.id.login_btn) //ini tombol login yang pengen di pencet
        btn_masuk.setOnClickListener {
            val Intent = Intent(this, DashboardPage::class.java)
            startActivity(Intent)
        }
    }
}