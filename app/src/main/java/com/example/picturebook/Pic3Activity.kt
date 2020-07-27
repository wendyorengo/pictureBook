package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image2.*

class Pic3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic3)
        btnShaveTwo.setOnClickListener{
            val intent = Intent(baseContext,Pic3Activity::class.java)
            startActivity(intent)

        }
    }
}