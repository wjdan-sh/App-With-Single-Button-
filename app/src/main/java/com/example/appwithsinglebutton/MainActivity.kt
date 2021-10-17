package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var  btn: Button
    lateinit var  tv: TextView
    lateinit var  ed: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn=findViewById(R.id.btn)
        tv=findViewById(R.id.tv)
        ed=findViewById(R.id.ed)

        btn.setOnClickListener{

          var name = ed.text
            tv.text = "Hello " + name

            ed.text.clear()
            ed.clearFocus()
        }


    }
}