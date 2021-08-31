package com.example.modulofiscal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.modulofiscal.Formbemvindo.Agradecimentos
import com.example.modulofiscal.databinding.ActivityCalculadoraBinding
import net.objecthunter.exp4j.ExpressionBuilder

class calculadora : AppCompatActivity() {

    private lateinit var binding: ActivityCalculadoraBinding

 
    var tvOne = binding.tvOne
    var tvTwo = binding.tvTwo
    var tvThree = binding.tvThree
    var tvFour = binding.tvFour
    var tvFive = binding.tvFive
    var tvSix = binding.tvSix
    var tvSeven = binding.tvSeven
    var tvEight = binding.tvEight
    var tvNine = binding.tvNine
    var tvZero = binding.tvZero
    var tvDot = binding.tvDot

    //
    var tvPlus = binding.tvPlus
    var tvMinus = binding.tvMinus
    var tvMul = binding.tvMul
    var tvDivide = binding.tvDivide
    var tvOpen = binding.tvOpen
    var tvClose = binding.tvClose

    //
    var tvClear = binding.tvClear
    var tvExpression = binding.tvExpression
    var tvResult = binding.tvResult

    //
    var tvBack = binding.tvBack
    var tvEquals = binding.tvEquals
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculadoraBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbar = binding.toolbarAgrad
        toolbar.title = "Uva"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setBackgroundColor(getColor(R.color.marronFORTE))
        toolbar.setTitleMargin(300, 0, 300, 0)
        toolbar.navigationIcon = getDrawable(R.drawable.icon_back_to)
        toolbar.setOnClickListener {
            val intent = Intent(this, Agradecimentos::class.java)
            startActivity(intent)
            finish()
        }


        tvOne.setOnClickListener { appendOnExpresstion("1", true) }
        tvTwo.setOnClickListener { appendOnExpresstion("2", true) }
        tvThree.setOnClickListener { appendOnExpresstion("3", true) }
        tvFour.setOnClickListener { appendOnExpresstion("4", true) }
        tvFive.setOnClickListener { appendOnExpresstion("5", true) }
        tvSix.setOnClickListener { appendOnExpresstion("6", true) }
        tvSeven.setOnClickListener { appendOnExpresstion("7", true) }
        tvEight.setOnClickListener { appendOnExpresstion("8", true) }
        tvNine.setOnClickListener { appendOnExpresstion("9", true) }
        tvZero.setOnClickListener { appendOnExpresstion("0", true) }
        tvDot.setOnClickListener { appendOnExpresstion(".", true) }



        //Operators
        tvPlus.setOnClickListener { appendOnExpresstion("+", false) }
        tvMinus.setOnClickListener { appendOnExpresstion("-", false) }
        tvMul.setOnClickListener { appendOnExpresstion("*", false) }
        tvDivide.setOnClickListener { appendOnExpresstion("/", false) }
        tvOpen.setOnClickListener { appendOnExpresstion("(", false) }
        tvClose.setOnClickListener { appendOnExpresstion(")", false) }



        tvClear.setOnClickListener {
            tvExpression.text = ""
            tvResult.text = ""
        }


        tvBack.setOnClickListener {
            val string = tvExpression.text.toString()
            if(string.isNotEmpty()){
                tvExpression.text = string.substring(0,string.length-1)
            }
            tvResult.text = ""
        }


        tvEquals.setOnClickListener {
            try {

                val expression = ExpressionBuilder(tvExpression.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toLong()
                if(result == longResult.toDouble())
                    tvResult.text = longResult.toString()
                else
                    tvResult.text = result.toString()

            }catch (e:Exception){
                Log.d("Exception"," message : " + e.message )
            }
        }

    }

    fun appendOnExpresstion(string: String, canClear: Boolean) {

        if(tvResult.text.isNotEmpty()){
            tvExpression.text = ""
        }

        if (canClear) {
            tvResult.text = ""
            tvExpression.append(string)
        } else {
            tvExpression.append(tvResult.text)
            tvExpression.append(string)
            tvResult.text = ""
        }
    }

}