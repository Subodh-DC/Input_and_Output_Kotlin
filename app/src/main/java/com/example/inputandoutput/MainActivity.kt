package com.example.inputandoutput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edittext1:EditText
    lateinit var edittext2: EditText
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var textView1: TextView
    lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edittext1=findViewById(R.id.editText1)
        edittext2=findViewById(R.id.editText2)
        btn1=findViewById(R.id.button1)
        btn2=findViewById(R.id.button2)
        btn3=findViewById(R.id.button3)
        btn4=findViewById(R.id.button4)

        btn1.setOnClickListener {
            val a=edittext1.text.toString()
            val aa=a.toInt()
            val b=edittext2.text.toString()
            val bb=b.toInt()
            Toast.makeText(this, "Sum is : "+(aa+bb), Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            val a=edittext1.text.toString()
            val aa=a.toInt()
            val b=edittext2.text.toString()
            val bb=b.toInt()
            Toast.makeText(this, "Subtract is : "+(aa-bb), Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            val a=edittext1.text.toString()
            val aa=a.toInt()
            val b=edittext2.text.toString()
            val bb=b.toInt()
            Toast.makeText(this, "Multiply is : "+(aa*bb), Toast.LENGTH_SHORT).show()
        }

        btn4.setOnClickListener {
            val a=edittext1.text.toString()
            val aa=a.toInt()
            val b=edittext2.text.toString()
            val bb=b.toInt()
            Toast.makeText(this, "Divided is :"+(aa/bb), Toast.LENGTH_SHORT).show()
        }
    }
}