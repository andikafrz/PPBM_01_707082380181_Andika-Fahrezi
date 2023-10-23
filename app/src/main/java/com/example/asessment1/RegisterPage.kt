package com.example.asessment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox

class RegisterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        findViewById<CheckBox>(R.id.checkbox_term)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Term is checked: $isChecked")
            }
    }
}