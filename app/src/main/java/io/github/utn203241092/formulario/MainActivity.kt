package io.github.utn203241092.formulario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val button =
            findViewById<Button>(R.id.button)

        button.setOnClickListener { view ->

            val valor1 = Integer.parseInt(num1.text.toString())
            val valor2 = Integer.parseInt(num2.text.toString())
            val resultado = (valor1+valor2)

            Snackbar.make(
                view,
                "La suma de los valores ingresados es:  $resultado.",
                Snackbar.LENGTH_LONG
            ).show()
        }
    }
}