package com.example.modulofiscal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                .image(R.drawable.test)
                .backgroundDark(R.color.black)
                .title("Ferramenta Online do Modulo Fiscal")
                .description("Testando")
                .build()
        )
        addSlide(
            SimpleSlide.Builder()
                .backgroundDark(R.color.black)
                .background(R.color.marronFRACO)
                .title("Use gratuitamente")
                .build()
        )
    }
}