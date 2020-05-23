package com.kotlinLab.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * The LoginForm program implements an application that
 * simply displays Login SuccessFul to the standard output.
 *
 * @author  Dimantha H.V.N
 * @version 1.0
 * @since   2020-05-23
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnClick = findViewById<Button>(R.id.btnWelcome)
        btnClick.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent);
        }
    }

}
