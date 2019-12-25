package com.example.myapplication

import android.app.Activity
import android.widget.Toast

fun Activity.showToast(message: String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
}