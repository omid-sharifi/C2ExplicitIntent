package com.example.c2explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.c2explicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.button.setOnClickListener {
            callActivity()
        }

    }

    private fun callActivity() {
        val message = binding.editText.text.toString()

        val intent = Intent(this, MainActivity2::class.java).also {
            it.putExtra("EXTRA_MESSAGE", message)
            startActivity(it)
        }

    }


}