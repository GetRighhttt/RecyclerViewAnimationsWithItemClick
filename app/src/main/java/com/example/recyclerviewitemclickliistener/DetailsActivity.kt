package com.example.recyclerviewitemclickliistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.recyclerviewitemclickliistener.model.Food

class DetailsActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val food = intent.getParcelableExtra<Food>("food")
        if (food != null) {
            val textView = findViewById<TextView>(R.id.tv_details)
            val imageView = findViewById<ImageView>(R.id.iv_details)
            textView.text = food.name
            imageView.setImageResource(food.image)
        }
    }
}