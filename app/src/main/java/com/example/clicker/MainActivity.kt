package com.example.clicker

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.clicker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var clickCount: Int = 0
    private var coins: Int = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.text1.text = "Clicks:$clickCount"

//        textView.setOnClickListener {
        binding.text1.setOnClickListener {
            Log.e("MY_TAG", "My message")
        }

//        val button: Button = findViewById(R.id.increment_button)
//        button.setOnClickListener {
        binding.button1.setOnClickListener {
            clickCount++
            if (clickCount % 100 == 1){coins++}
            binding.text2.text = "Coins:$coins"
            binding.text1.text = "Clicks:$clickCount"

        }



    }
}

