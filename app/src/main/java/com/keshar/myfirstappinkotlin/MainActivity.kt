package com.keshar.myfirstappinkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitBtn.setOnClickListener {
            val message: String = yourMessageEdt.text.toString().trim()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }

}
