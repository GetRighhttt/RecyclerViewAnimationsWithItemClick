package com.example.recyclerviewitemclickliistener.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewitemclickliistener.R
import com.example.recyclerviewitemclickliistener.model.Food

class FoodAdapter(private val foodList: ArrayList<Food>)
    : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    var onItemClick: ((Food) -> Unit)? = null

    inner class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val textView: TextView = itemView.findViewById(R.id.text_view)
        val cardView: CardView = itemView.findViewById(R.id.card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_list_item, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.imageView.setImageResource(food.image)
        holder.textView.text = food.name

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(food)
        }
        // Horizontal slide animation from left to right implementation
//        holder.cardView.startAnimation(AnimationUtils
//            .loadAnimation(holder.itemView.context,R.anim.anim_1))


        // Vertical slide animation implementation
//        holder.cardView.startAnimation(AnimationUtils
//            .loadAnimation(holder.itemView.context,R.anim.anim_2))

        // Rotating animation implementation
//          holder.cardView.startAnimation(AnimationUtils
//              .loadAnimation(holder.itemView.context,R.anim.anim_3))

       // Visibility animation implementation!
        // Probably the best one
        holder.cardView.startAnimation(AnimationUtils
            .loadAnimation(holder.itemView.context,R.anim.anim_4))
  }

    override fun getItemCount(): Int {
        return foodList.size
    }
}