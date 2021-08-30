package com.example.modulofiscal.Formbemvindo

import android.content.Intent
import android.graphics.pdf.PdfRenderer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.modulofiscal.R
import com.example.modulofiscal.R.id.webview
import com.example.modulofiscal.databinding.ActivityAgradecimentosBinding
import com.example.modulofiscal.databinding.ActivityMainBinding
import com.example.modulofiscal.databinding.ActivityTabelaissBinding
import com.example.modulofiscal.infimpostos
import com.example.modulofiscal.lei116
import com.example.modulofiscal.tabelaiss

class Agradecimentos : AppCompatActivity() {
    private lateinit var binding: ActivityAgradecimentosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgradecimentosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Lei116()
        Tabelaiss()
        Infimpostos()



    }
    private fun Lei116() {

        binding.btLei116.setOnClickListener {
            val intent = Intent(this, lei116::class.java)
            startActivity(intent)
        }
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

}