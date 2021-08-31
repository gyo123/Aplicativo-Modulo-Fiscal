package com.example.modulofiscal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.modulofiscal.Formbemvindo.Agradecimentos
import com.example.modulofiscal.databinding.ActivityLei116Binding
import com.example.modulofiscal.databinding.ActivityTabelaissBinding

class lei116 : AppCompatActivity() {
    private lateinit var binding: ActivityLei116Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLei116Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        val toolbar = binding.toolbarAgrad
        toolbar.title = "Pêra"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setBackgroundColor(getColor(R.color.marronFORTE))
        toolbar.setTitleMargin(300, 0, 300, 0)
        toolbar.setNavigationIcon(getDrawable(R.drawable.icon_back_to))
        toolbar.setOnClickListener {
            val intent = Intent(this, Agradecimentos::class.java)
            startActivity(intent)
            finish()
        }
    }
}