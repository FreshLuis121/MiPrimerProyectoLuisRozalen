package com.example.sprint1luis

import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cbAndroid = findViewById<CheckBox>(R.id.cbAndroid)
        val cbReact = findViewById<CheckBox>(R.id.cbReact)
        val cbFlutter = findViewById<CheckBox>(R.id.cbFlutter)

        val listenerCheckbox = CompoundButton.OnCheckedChangeListener { _, _ ->
            val seleccionadas = mutableListOf<String>()
            if (cbAndroid.isChecked) seleccionadas.add("Android")
            if (cbReact.isChecked) seleccionadas.add("React")
            if (cbFlutter.isChecked) seleccionadas.add("Flutter")

            val mensaje = if (seleccionadas.isEmpty()) {
                "Ninguna tecnología seleccionada"
            } else {
                "Tecnologías: ${seleccionadas.joinToString(", ")}"
            }
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        }

        cbAndroid.setOnCheckedChangeListener(listenerCheckbox)
        cbReact.setOnCheckedChangeListener(listenerCheckbox)
        cbFlutter.setOnCheckedChangeListener(listenerCheckbox)
    }
}