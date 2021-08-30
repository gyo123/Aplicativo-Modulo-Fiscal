package com.example.modulofiscal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modulofiscal.Formbemvindo.Agradecimentos
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide

class Slides : IntroActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_slides)


        isButtonBackVisible = false
        isButtonNextVisible = false
        supportActionBar?.hide()

        addSlide(
            SimpleSlide.Builder()
                .background(R.color.marronFORTE)
                .image(R.drawable.imlogo)
                .backgroundDark(R.color.black)
                .title("Ferramenta Online do Módulo Fiscal")
                .description("Calcule de maneira rápida os impostos ISS, ICMS, COFINS e PIS!!")
                .build()
        )
        addSlide(
            SimpleSlide.Builder()
                .background(R.color.marronFORTE)
                .image(R.drawable.thanks)
                .backgroundDark(R.color.black)
                .title("AGRADECIMENTOS")
                .description("Gostaria de agradecer a Prof. Paula Carvalho por compartilhar seu conhecimento, não só comigo, mas com todos os alunos matriculados no Curso de Técnicas Administrativas." +
                        "   Feito por @Gyoo_123")
                .build()
        )


    }
    override fun onDestroy() {
        super.onDestroy()

        var intent = Intent(this, Agradecimentos::class.java)
        startActivity(intent)
        finish()
    }
}