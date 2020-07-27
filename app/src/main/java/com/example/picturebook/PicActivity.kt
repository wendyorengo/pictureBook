package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pic3.*

class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)
        btnLips.setOnClickListener{
            val intent = Intent(baseContext,Pic3Activity::class.java)
            startActivity(intent)

        }
        btnLips2.setOnClickListener{
            val intent = Intent(baseContext,Image2Activity::class.java)
            startActivity(intent)
        }


    }
}