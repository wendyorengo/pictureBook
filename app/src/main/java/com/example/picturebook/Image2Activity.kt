package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image2.*

class Image2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)
        btnShaveOne.setOnClickListener{
            val intent = Intent(baseContext,PicActivity::class.java)
            startActivity(intent)

        }
    }
}