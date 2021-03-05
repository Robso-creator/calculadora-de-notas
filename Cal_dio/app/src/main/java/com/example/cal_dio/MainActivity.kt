package com.example.cal_dio

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultados

        calcular.setOnClickListener{

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val faltas = Integer.parseInt(faltas.text.toString())
            val media = ((nota1+nota2)/2)

            if(media >=6 && faltas <=10){
                resultado.setText("Aluno foi aprovado!\n Média: $media \n Faltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("Aluno foi reprovado!\n Média: $media \n Faltas: $faltas")
                resultado.setTextColor(Color.RED)

            }

        }

    }
}