package com.cetis108.churrosveganosconcarnedecochi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ActionBarMenuIconsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar_menu_icons)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.MenuItemMainSaludar -> {
                Toast.makeText(this,"Hola desde el menú",Toast.LENGTH_SHORT).show()
            }
            R.id.MenuItemMainIrA -> {
                // codigo para ir a otro activity y cerrar el actual
                val intent = Intent(this, MainActivity::class.java)
                this.startActivity(intent)
                this.finish()
            }
            R.id.MenuItemMainAcercaDe -> {
                // codigo para mostrar acerca de y poder regresar con la flecha atras
                val intent = Intent(this, TableLayoutCredentialActivity::class.java)
                this.startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}