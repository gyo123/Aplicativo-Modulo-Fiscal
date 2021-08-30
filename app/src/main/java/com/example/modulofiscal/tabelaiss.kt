package com.example.modulofiscal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.modulofiscal.databinding.ActivityTabelaissBinding
import com.github.barteksc.pdfviewer.PDFView

class tabelaiss : AppCompatActivity() {


    private lateinit var binding: ActivityTabelaissBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabelaissBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val myweb = findViewById<WebView>(R.id.webview)
        myweb.webViewClient = WebViewClient()
        myweb.loadUrl("https://drive.google.com/file/d/1SnUtIoH4sZ0mWVS54DDCs7cYC6IbA6IJ/view?usp=sharing")
        val websettings = myweb.settings
        websettings.javaScriptEnabled = true




    }
}