package com.sean.retrofit.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class CateHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var avatar: ImageView = itemView.avatar
    var tvName: TextView = itemView.tvName

}
