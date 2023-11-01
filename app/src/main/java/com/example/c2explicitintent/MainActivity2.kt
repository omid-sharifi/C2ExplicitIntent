package com.example.c2explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.c2explicitintent.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)
        //setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        binding.textView.text = message

    }
}