package com.example.plantasexoticas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import android.content.DialogInterface
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var nameUserEdit: EditText? = null
    private var passUserEdit: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        nameUserEdit = findViewById(R.id.nameUserEdit)
        passUserEdit = findViewById(R.id.passUserEdit)
    }
    fun loginUser(botonUserEdit:View) {
        if (nameUserEdit!!.text.toString() == "edis@gmail.com"){
            if (passUserEdit!!.text.toString() == "12345") {
                val intento = Intent(this, Noticias::class.java)
                startActivity(intento)
                Toast.makeText(applicationContext,getString(R.string.txt_welcome),Toast.LENGTH_LONG).show()

            }
        }else{
            Toast.makeText(applicationContext,getResources().getString(R.string.txt_men2),Toast.LENGTH_SHORT).show()

        }
    }

}