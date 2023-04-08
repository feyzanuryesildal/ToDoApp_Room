package com.example.page_change

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  button : Button // btn_save Button oldugunu atadık
    lateinit var  editTextTextPersonName : TextView // name TextView oldugunu atadık
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Name",editTextTextPersonName.text.toString())
            startActivity(intent)
            finish()
        }
    }
}