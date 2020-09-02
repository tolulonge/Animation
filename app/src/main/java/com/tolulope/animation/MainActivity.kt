package com.tolulope.animation

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rel = findViewById<RelativeLayout>(R.id.rel)
        var animation = rel.background as AnimationDrawable?
        animation?.setEnterFadeDuration(3000)
        animation?.setExitFadeDuration(1000)
        animation?.start()

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener(){
            var intent = Intent(this@MainActivity, FadeScaleAnimation::class.java)
            var animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.scale)
            rel.startAnimation(animation)
            startActivity(intent)


        }
    }
}