package com.keshar.myfirstappinkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private var message: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        getIntentValue()
        showMessageTxt.text = message

    }

    private fun getIntentValue() {
        var data: Bundle? = intent.extras
        message = data?.getString(MainActivity.MESSAGEID) ?: ""
    }
}

