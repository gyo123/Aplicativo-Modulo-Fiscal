package com.example.modulofiscal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.modulofiscal.databinding.ActivityLei116Binding
import com.example.modulofiscal.databinding.ActivityTabelaissBinding

class lei116 : AppCompatActivity() {
    private lateinit var binding: ActivityLei116Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLei116Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val myweb = findViewById<WebView>(R.id.webview)
        myweb.webViewClient = WebViewClient()
        myweb.loadUrl("https://drive.google.com/file/d/14dH0Nr5vuTuhvIKXp9jmAP7hc0Nzp69b/view?usp=sharing")
        val websettings = myweb.settings
        websettings.javaScriptEnabled = true
    }
}