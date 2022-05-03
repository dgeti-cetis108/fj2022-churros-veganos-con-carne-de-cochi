package com.cetis108.churrosveganosconcarnedecochi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        agregarAccionAlBotonWeb()
    }

    private fun agregarAccionAlBotonWeb() {
        // obtener el enlace al boton para enviar uri a web
        val botonWeb = findViewById<ImageButton>(R.id.imageButtonWeb)
        // asignar la acción al botonWeb para que llame al navegador
        botonWeb.setOnClickListener {
            // obtener el valor de la caja de texto de web
            val textoWeb = findViewById<EditText>(R.id.editTextWeb).text
            // validar que no este vacía la caja de texto
            if (textoWeb.isEmpty())
                // enviar mensaje de error, para que ingrese algo
                Toast.makeText(
                    this,
                    "No te hagas 🐷, escribe algo",
                    Toast.LENGTH_SHORT).show()
            else {
                // definir el intent implícito
                val intentWeb = Intent()
                // definir la acción para el intent
                intentWeb.action = Intent.ACTION_VIEW
                // convertir texto web a uri y pasarlo al data del intent
                intentWeb.data = Uri.parse("https://$textoWeb")
                // iniciar el intent - llamar al intent
                startActivity(intentWeb)
            }
        }

    }
}