package com.example.fragmenttask3_k

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CarAdapter(context: Context, private val cars: ArrayList<Car>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    var activity: ItemClicked

    interface ItemClicked {
        fun onItemClicked(index: Int)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivMake: ImageView
        var tvModel: TextView
        var tvOwner: TextView

        init {
            ivMake = itemView.findViewById(R.id.ivMake)
            tvModel = itemView.findViewById(R.id.tvModel)
            tvOwner = itemView.findViewById(R.id.tvOwner)
            itemView.setOnClickListener { view -> activity.onItemClicked(cars.indexOf(view.tag as Car)) }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.row_layout, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemView.tag = cars[i]
        viewHolder.tvOwner.text = cars[i].getOwnerName()
        viewHolder.tvModel.text = cars[i].getModel()
        if (cars[i].getMake().equals("Volkswagen")) {
            viewHolder.ivMake.setImageResource(R.drawable.volkswagen)
        } else if (cars[i].getModel().equals("Nissan")) {
            viewHolder.ivMake.setImageResource(R.drawable.nissan)
        } else {
            viewHolder.ivMake.setImageResource(R.drawable.mercedes)
        }
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    init {
        activity = context as ItemClicked
    }
}