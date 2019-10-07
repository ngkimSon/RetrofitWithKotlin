package com.sean.retrofit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sean.retrofit.R
import com.sean.retrofit.model.Android
import com.sean.retrofit.model.Category
import kotlinx.android.synthetic.main.item.view.*

class DataAdapter(private val dataList: ArrayList<Category>, private val listener: Listener) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    interface Listener {
        //        fun onItemClick(android: Android)
        fun onItemClick(category: Category)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position], listener, position)
    }

    override fun getItemCount(): Int = dataList.count()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(category: Category, listener: Listener, position: Int) {
            itemView.tvName.text = category.getName()
            itemView.tvVersion.text = category.getLink()
            itemView.tvAPI.text = category.getId().toString()
            itemView.setOnClickListener { listener.onItemClick(category) }
        }
    }
}
