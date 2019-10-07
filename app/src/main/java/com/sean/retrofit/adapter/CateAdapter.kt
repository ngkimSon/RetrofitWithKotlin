package com.sean.retrofit.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sean.retrofit.R
import com.sean.retrofit.model.Category

class CateAdapter(var listCate: ArrayList<Category>, var context: Context) :
    RecyclerView.Adapter<CateHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CateHolder {
        return CateHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return listCate.size
    }

    override fun onBindViewHolder(holder: CateHolder, position: Int) {
        var category: Category = listCate.get(position)

        holder.avatar.setImageResource(R.mipmap.ic_launcher)
        holder.tvName.text = category.getName()
    }


}