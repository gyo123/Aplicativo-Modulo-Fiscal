package com.example.modulofiscal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.modulofiscal.Formbemvindo.Agradecimentos
import com.example.modulofiscal.databinding.ActivityTabelaissBinding
import com.github.barteksc.pdfviewer.PDFView

class tabelaiss : AppCompatActivity() {


    private lateinit var binding: ActivityTabelaissBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabelaissBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()



        val toolbar = binding.toolbarAgrad
        toolbar.title = "Banana"
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