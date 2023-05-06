package com.zaketn.helloworldlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun handleButtonClick(view: View) {
        val inputMain: EditText = findViewById<EditText>(R.id.inputMain)
        val textToShow: TextView = findViewById<TextView>(R.id.textOutput)

        textToShow.text = inputMain.text
        textToShow.visibility = View.VISIBLE
    }
}
