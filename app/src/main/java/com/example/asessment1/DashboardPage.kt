package com.example.asessment1

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout

class DashboardPage : AppCompatActivity() {

    lateinit var front_anim: AnimatorSet
    lateinit var back_anim: AnimatorSet
    var isFront =true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_page)

        var scale = applicationContext.resources.displayMetrics.density

        val front = findViewById<LinearLayout>(R.id.card_front) as LinearLayout
        val back =findViewById<LinearLayout>(R.id.card_back) as LinearLayout
        val flip = findViewById<Button>(R.id.flip_btn) as Button

        front.cameraDistance = 8000 * scale
        back.cameraDistance = 8000 * scale


        // Now we will set the front animation
        var front_animation = AnimatorInflater.loadAnimator(
            applicationContext,
            R.animator.front_animator
        ) as AnimatorSet
        var back_animation = AnimatorInflater.loadAnimator(
            applicationContext,
            R.animator.back_animator
        ) as AnimatorSet

        // Now we will set the event listener
        flip.setOnClickListener{
            if(isFront)
            {
                front_animation.setTarget(front);
                back_animation.setTarget(back);
                front_animation.start()
                back_animation.start()
                isFront = false

            }
            else
            {
                front_animation.setTarget(back)
                back_animation.setTarget(front)
                back_animation.start()
                front_animation.start()
                isFront =true

            }
        }

        val btn_masuk = findViewById<ImageButton>(R.id.imagebutton_person) //ini tombol login yang pengen di pencet
        btn_masuk.setOnClickListener {
            val Intent = Intent(this, DeveloperPage::class.java)
            startActivity(Intent)
        }
    }
}