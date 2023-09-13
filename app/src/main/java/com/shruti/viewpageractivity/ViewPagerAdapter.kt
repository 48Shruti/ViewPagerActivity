package com.shruti.viewpageractivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(var item : ArrayList<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {
    class ViewHolder(var view : View) :RecyclerView.ViewHolder(view) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(viewType,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun getItemViewType(position: Int): Int {
        return item[position]
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}