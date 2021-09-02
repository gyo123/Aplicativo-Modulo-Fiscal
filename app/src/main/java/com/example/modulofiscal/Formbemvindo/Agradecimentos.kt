package com.example.modulofiscal.Formbemvindo

import android.content.Intent
import android.graphics.pdf.PdfRenderer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toolbar
import com.example.modulofiscal.*
import com.example.modulofiscal.databinding.ActivityAgradecimentosBinding
import com.example.modulofiscal.databinding.ActivityMainBinding
import com.example.modulofiscal.databinding.ActivityTabelaissBinding

class Agradecimentos : AppCompatActivity() {
    private lateinit var binding: ActivityAgradecimentosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgradecimentosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val toolbar = binding.toolbarAgrad
        toolbar.title = "Macarrão"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setBackgroundColor(getColor(R.color.marronFORTE))
        toolbar.setTitleMargin(350, 0, 350, 0)





        Tabelaiss()
        Infimpostos()
        Calculadora1()
        dicasLucro()
        SimplesNacional()

    }
    private fun Tabelaiss() {
        binding.btconsultar.setOnClickListener {
            val intent = Intent(this, tabelaiss::class.java)
            startActivity(intent)

        }
    }
    private fun Infimpostos() {
        binding.btimposto.setOnClickListener {
            val intent = Intent(this, infimpostos::class.java)
            startActivity(intent)

        }
    }
    private fun Calculadora1() {
        binding.calculadora.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
    private fun dicasLucro() {
        binding.bttabelapresumido.setOnClickListener {
            var intent = Intent(this, DicasLucroPresumido::class.java)
            startActivity(intent)
        }
    }
    private fun SimplesNacional() {
        binding.bttabelasimplesnacional.setOnClickListener {
            var intent = Intent(this, simplesnacional::class.java)
            startActivity(intent)
        }
    }

}