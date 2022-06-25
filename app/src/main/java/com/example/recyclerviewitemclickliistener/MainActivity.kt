package com.example.recyclerviewitemclickliistener

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewitemclickliistener.adapter.FoodAdapter
import com.example.recyclerviewitemclickliistener.model.Food

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_food)
        recyclerView.setHasFixedSize(true)
//        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.italian, "Italian"))
        foodList.add(Food(R.drawable.italian_food_01, "Plate"))
        foodList.add(Food(R.drawable.italianmeatball, "Meatball"))
        foodList.add(Food(R.drawable.italianpasta, "Pasta"))
        foodList.add(Food(R.drawable.italiansausage, "Sausage"))
        foodList.add(Food(R.drawable.italianwrapper, "Fancy"))
        foodList.add(Food(R.drawable.italyyy, "Pineapple"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))



        // set the adapter to the list
        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        // Method to pass information to the details activity with clicking an item in the
        // recyclerview. Need information to be parcelable in the data class
        foodAdapter.onItemClick = {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }


    }
}