package com.example.igtiandroid_unit1

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view: View) {
        Log.i("sua tag", "Aprendendo a criar mensagens no LOG")
        val editText = findViewById<EditText>(R.id.etMensagem)
        val mensagem = editText.text.toString()
        val intent = Intent(this, exibir_mensagem::class.java).apply {
            putExtra(EXTRA_MESSAGE, mensagem)
        }
        startActivity(intent)
    }
}