package com.example.proyecto_2trim_topmotors.Actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto_2trim_topmotors.databinding.ActivityMainBinding
import com.example.proyecto_2trim_topmotors.databinding.FragmentLoginBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}