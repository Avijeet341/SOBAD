package com.avi.sobad

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private var layout_main: LinearLayout? = null
    private var animation_fadein: Animation? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Utils.blackIconStatusBar(this@LoginActivity, R.color.light_background)

        layout_main = findViewById(R.id.layout_main)
        animation_fadein = AnimationUtils.loadAnimation(this@LoginActivity, R.anim.fade_in)
        Handler().postDelayed(
            {
                layout_main!!.setVisibility(View.VISIBLE)
                layout_main!!.setAnimation(animation_fadein)
            }, 1000
        )
    }
}