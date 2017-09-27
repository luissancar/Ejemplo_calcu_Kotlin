package com.example.luisjosesanchezcarrasco.ejemplo_calcu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.luisjosesanchezcarrasco.ejemplo_calcu.R.id.display
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombreAplicacion = resources.getString(R.string.app_name)
        display.text=nombreAplicacion.toString()
    }

    fun numero(v : View)
    {
        val numer=findViewById<Button>(v.id)
        val textnum=numer.text.toString()
       // display.text="${display.text.toString()} ${textnum}"




    }
    fun doublePa(v : View)  {
        var b:Double=0.0


        var a=display.text.toString().toDouble()
        if (a!=b) {
            a=b

    }

    }
}
