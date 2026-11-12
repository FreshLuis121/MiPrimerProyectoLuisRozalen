package com.example.sprint1luis


import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val cbAndroid = findViewById<CheckBox>(R.id.cbAndroid)
        val cbReact = findViewById<CheckBox>(R.id.cbReact)
        val cbFlutter = findViewById<CheckBox>(R.id.cbFlutter)


        val listenerCheckBox = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this@MainActivity, "Marcado: ${buttonView.text}", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        cbAndroid?.setOnCheckedChangeListener(listenerCheckBox)
        cbReact?.setOnCheckedChangeListener(listenerCheckBox)
        cbFlutter?.setOnCheckedChangeListener(listenerCheckBox)




        val rgModalidad = findViewById<RadioGroup>(R.id.rgModalidad)
        rgModalidad?.setOnCheckedChangeListener { _, checkedId ->
            val radioButton = findViewById<RadioButton>(checkedId)
            if (radioButton != null) {
                Toast.makeText(
                    this@MainActivity,
                    "Modalidad seleccionada: ${radioButton.text}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }




        val switchNotificaciones = findViewById<Switch>(R.id.switchNotificaciones)
        switchNotificaciones?.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this@MainActivity, "Notificaciones activadas", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(this@MainActivity, "Notificaciones desactivadas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
