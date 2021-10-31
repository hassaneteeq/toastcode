package com.example.toast_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(
            getApplicationContext(),
            "Toast Code \n Successfully Tested",
            Toast.LENGTH_LONG).show();


    }
}




