package com.tolulope.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class FadeScaleAnimation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fade_scale_animation)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val btnScale = findViewById<Button>(R.id.btn_scale)
        val btnFade = findViewById<Button>(R.id.btn_fade)

        btnScale.setOnClickListener(){
            var animation = AnimationUtils.loadAnimation(this@FadeScaleAnimation, R.anim.scale)
            imageView.startAnimation(animation)
        }
        btnFade.setOnClickListener(){
            var animation = AnimationUtils.loadAnimation(this@FadeScaleAnimation, R.anim.fade)
            imageView.startAnimation(animation)
        }

    }
}