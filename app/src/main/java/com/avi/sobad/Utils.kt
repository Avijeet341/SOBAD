package com.avi.sobad

import android.app.Activity
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat

object Utils {
    fun blackIconStatusBar(activity: Activity, color: Int) {
        activity.window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        activity.window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        activity.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        activity.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        activity.window.statusBarColor = ContextCompat.getColor(activity, color)
    }
}