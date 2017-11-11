package com.example.muhammed.myapplication5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.io.Serializable

class MainActivity : AppCompatActivity() {


    lateinit var btn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)

        btn.setOnClickListener{

            val employee = Employees("Muhammed","Essa","IRAQ")

            startActivity(
              Intent(this,Main2Activity::class.java)
                      .putExtra("employee",employee))
        }
    }
}


//class Employees(var fisrtname : String , var lastname : String , var address : String):Serializable