package com.example.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caraoucoroa.databinding.ActivityResultadoBinding

class ActivityResultado :  AppCompatActivity() {
    lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var dados = intent.extras
        var numero = dados?.getInt("numero")
        if(numero == 0){
            binding.imageMoeda.setImageResource(R.drawable.moeda_cara)
        }else{
            binding.imageMoeda.setImageResource(R.drawable.moeda_coroa)
        }
        binding.buttonVoltar.setOnClickListener { finish() }




    }
}