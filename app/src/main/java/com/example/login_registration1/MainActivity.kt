package com.example.login_registration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var texttologin:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texttologin=findViewById(R.id.Txt_gotologin)

        texttologin.setOnClickListener{
            val intent= Intent(this,loginactivity::class.java )
            startActivity(intent)

        }


    }
}