package com.example.logonrm.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.example.logonrm.imc.extension.format
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val peso = intent?.getStringExtra("PESO")!!.toDouble()
        val altura = intent?.getStringExtra("ALTURA")!!.toDouble()

        val imc = peso?.div(altura!!.times(altura))

        tvIMC.text = imc?.format(2)

        if (imc < 18.5) {
            alterarTextoStatusIMC ("Abaixo do peso magro maldito")
            alterarImagemStatusIMC( R.drawable.abaixo)
        }else if (imc <= 24.9) {
            alterarTextoStatusIMC ("Peso ideal, ta suave")
            alterarImagemStatusIMC( R.drawable.abaixo)
        }
    else if (imc <= 29.9) {
        alterarTextoStatusIMC ("Quase gordo")
        alterarImagemStatusIMC( R.drawable.abaixo)
    }
    else if (imc <= 34.9) {
    alterarTextoStatusIMC ("GORDO DE MERDA")
    alterarImagemStatusIMC( R.drawable.abaixo)
}
    else if (imc <= 39.9) {
    alterarTextoStatusIMC ("GORDO DE MERDA GRAU 2")
    alterarImagemStatusIMC( R.drawable.abaixo)
}
    else if (imc > 40) {
    alterarTextoStatusIMC ("GORDO DE MERDA GRAU 2, VAI EXPLODIR")
    alterarImagemStatusIMC( R.drawable.abaixo)
}
    }

    private fun alterarImagemStatusIMC(idImagem: Int) {
        ivStatusImc.setImageDrawable(ContextCompat.getDrawable(this,
                idImagem))
    }

    private fun alterarTextoStatusIMC(texto: String) {
        tvStatusImc.text = texto
    }
}
