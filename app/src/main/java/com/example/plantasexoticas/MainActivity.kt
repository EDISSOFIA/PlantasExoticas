package com.example.plantasexoticas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var nameUserEdit: EditText? = null
    private var passUserEdit: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameUserEdit = findViewById(R.id.nameUserEdit)
        passUserEdit = findViewById(R.id.passUserEdit)
    }
    fun loginUser(botonUserEdit:View) {
        if (nameUserEdit!!.text.toString() == "edis@gmail.com"){
            if (passUserEdit!!.text.toString() == "12345") {
                val intento = Intent(this, Noticias::class.java)
                startActivity(intento)
            }
        }
    }

}