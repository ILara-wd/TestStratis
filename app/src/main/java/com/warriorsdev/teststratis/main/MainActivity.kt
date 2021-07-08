package com.warriorsdev.teststratis.main

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.warriorsdev.teststratis.R
import com.warriorsdev.teststratis.remote.data.DataTimeZone

class MainActivity : AppCompatActivity(), ImplMainView {

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        findViewById<Button>(R.id.btnChange).setOnClickListener{
            changeColor()
        }
    }

    private fun changeColor() {
        val number = findViewById<EditText>(R.id.etNumber).text.toString()
        presenter.validateRGB(stringRGB = number)
        presenter.getService()
    }

    override fun errorMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun showHexadecimal(hexadecimal: String) {
        val tvColor = findViewById<TextView>(R.id.tvColor)
        try{
            tvColor.text = hexadecimal
            tvColor.setBackgroundColor(Color.parseColor(hexadecimal))
        }catch (e : IllegalArgumentException){
            tvColor.text = ""
            tvColor.setBackgroundColor(Color.parseColor("#FFFFFF"))
            Toast.makeText(this, getString(R.string.text_exception), Toast.LENGTH_LONG).show()
        }
    }

    override fun showRGB(rgbString: String) {
        findViewById<EditText>(R.id.etNumber).setText(rgbString)

    }

    override fun dataTimeZone(dataTimeZone: DataTimeZone) {
        findViewById<TextView>(R.id.tvTimeZone).text = dataTimeZone.datetime
    }

}