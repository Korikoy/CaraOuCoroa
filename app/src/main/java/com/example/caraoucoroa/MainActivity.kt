package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caraoucoroa.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonJogar.setOnClickListener {
            val numero = (0..1).random()
            val intent = Intent(applicationContext,ActivityResultado::class.java)
            intent.putExtra("numero",numero)

            startActivity(intent)
        }





    }




}