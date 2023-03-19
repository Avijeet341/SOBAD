package com.avi.sobad

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Pair
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var img_logo: ImageView? = null
    private var img_bottom: ImageView? = null
    private var tv_name: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Utils.blackIconStatusBar(this@MainActivity, R.color.light_background)
        img_logo = findViewById(R.id.img_Logo)
        img_bottom = findViewById(R.id.img_bottom)
        tv_name = findViewById(R.id.tv_name)

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            val options = ActivityOptions.makeSceneTransitionAnimation(
                this@MainActivity,
                Pair.create(img_logo, "logo"),
                Pair.create(img_bottom, "img_tree"),
                Pair.create(tv_name, "logo_text"),
            )
            startActivity(intent)
            finish()
        }, 3000)


    }
}