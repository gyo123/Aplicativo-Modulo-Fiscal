package com.example.modulofiscal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modulofiscal.Formbemvindo.Agradecimentos
import com.example.modulofiscal.databinding.ActivityCalculadoraBinding
import com.example.modulofiscal.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val toolbar = binding.toolbarAgrad
        toolbar.title = "Melão"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setBackgroundColor(getColor(R.color.marronFORTE))
        toolbar.setTitleMargin(300, 0, 300, 0)
        toolbar.setNavigationIcon(getDrawable(R.drawable.icon_back_to))
        toolbar.setOnClickListener {
            val intent = Intent(this, Agradecimentos::class.java)
            startActivity(intent)
            finish()
        }


        var btn0 = binding.btn0
        var btn00 = binding.btn00
        var btn1 = binding.btn1
        var btn2 = binding.btn2
        var btn3 = binding.btn3
        var btn4 = binding.btn4
        var btn5 = binding.btn5
        var btn6 = binding.btn6
        var btn7 = binding.btn7
        var btn8 = binding.btn8
        var btn9 = binding.btn9
        var btnClear = binding.btnClear
        var btnDivide = binding.btnDivide
        var btnEqual = binding.btnEqual
        var btnDot = binding.btnDot
        var btnLeftB = binding.btnLeftB
        var btnMinus = binding.btnMinus
        var btnMultiply = binding.btnMultiply
        var btnRightB = binding.btnRightB
        var btnPlus = binding.btnPlus

                //Number listeners
                btn00.setOnClickListener { appendOnClick(true, "00") }
                btn0.setOnClickListener { appendOnClick(true, "0") }
                btn1.setOnClickListener { appendOnClick(true, "1") }
                btn2.setOnClickListener { appendOnClick(true, "2") }
                btn3.setOnClickListener { appendOnClick(true, "3") }
                btn4.setOnClickListener { appendOnClick(true, "4") }
                btn5.setOnClickListener { appendOnClick(true, "5") }
                btn6.setOnClickListener { appendOnClick(true, "6") }
                btn7.setOnClickListener { appendOnClick(true, "7") }
                btn8.setOnClickListener { appendOnClick(true, "8") }
                btn9.setOnClickListener { appendOnClick(true, "9") }
                btnDot.setOnClickListener { appendOnClick(true, ".") }


                //Operator Listeners
                btnPlus.setOnClickListener { appendOnClick(false, "+") }
                btnMinus.setOnClickListener { appendOnClick(false, "-") }
                btnMultiply.setOnClickListener { appendOnClick(false, "*") }
                btnDivide.setOnClickListener { appendOnClick(false, "/") }
                btnLeftB.setOnClickListener { appendOnClick(false, "%") }
                btnRightB.setOnClickListener { appendOnClick(false, ")") }


                btnClear.setOnClickListener {
            clear()
        }

                btnEqual.setOnClickListener {
            calculate()
        }


    }


    //now create methods


    private fun appendOnClick(clear: Boolean, string: String) {
        var tvOutput = binding.tvOutput
        var tvInput = binding.tvInput

        if (clear) {
            tvOutput.text = ""
            tvInput.append(string)
        } else {
            tvInput.append(tvOutput.text)
            tvInput.append(string)
            tvOutput.text = ""
        }
    }

    private fun clear() {
        var tvOutput = binding.tvOutput
        var tvInput = binding.tvInput
        tvInput.text = ""
        tvOutput.text = ""

    }

    private fun calculate() {

        try {
            var tvOutput = binding.tvOutput
            var tvInput = binding.tvInput

            val input = ExpressionBuilder(tvInput.text.toString()).build()
            val output = input.evaluate()
            val longOutput = output.toLong()
            if (output == longOutput.toDouble()){
                tvOutput.text = longOutput.toString()
            }else{
                tvOutput.text = output.toString()
            }

        }catch (e:Exception){
            Toast.makeText(this@MainActivity,e.message,Toast.LENGTH_LONG).show()
        }


    }
}