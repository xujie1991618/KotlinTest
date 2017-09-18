package com.crayfish.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    val str:String = "hello"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        val text = findViewById(R.id.textView);
//        text.setOnClickListener { toast() }
        textView.setText("hello")
    }
}
