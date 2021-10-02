package com.example.kotlinscopefunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var number: Int? = null

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** LET */

        //without let
        if (number != null) {
            val number2 = number!! + 1
        }

        //with let
        val op = number?.let {
            val number2 = it + 1
            number2
        } ?: 3


    }
}