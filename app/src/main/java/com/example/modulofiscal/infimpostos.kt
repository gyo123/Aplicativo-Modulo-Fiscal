package com.example.modulofiscal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.modulofiscal.databinding.ActivityInfimpostosBinding
import com.example.modulofiscal.databinding.ActivityTabelaissBinding

class infimpostos : AppCompatActivity() {

private lateinit var binding: ActivityInfimpostosBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityInfimpostosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val myweb = findViewById<WebView>(R.id.webview)
        myweb.webViewClient = WebViewClient()
        myweb.loadUrl("https://drive.google.com/file/d/1BJZ_ANJt2AcYCA5iOZH4mh9DYpgB1SbH/view?usp=sharing")
        val websettings = myweb.settings
        websettings.javaScriptEnabled = true

    }
}