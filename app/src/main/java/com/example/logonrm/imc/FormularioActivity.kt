package com.example.logonrm.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btLimpar.setOnClickListener {
            inputPeso.editText?.setText("")
            inputAltura.editText?.setText("")
            inputAltura.editText?.requestFocus()
        }

        btCalcular.setOnClickListener {
            val telaResultado = Intent(this,
                    ResultadoActivity::class.java)

            telaResultado.putExtra("PESO", inputPeso.editText?.text.toString())
            startActivity(telaResultado)

        }
    }
}
