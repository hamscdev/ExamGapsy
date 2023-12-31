package com.hamscdev.examgapsy.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hamscdev.examgapsy.R
import com.hamscdev.examgapsy.data.model.ItemX


class adapterList(val context: Context, val list: List<ItemX>): RecyclerView.Adapter<adapterList.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterList.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_search,parent,false))
    }

    override fun onBindViewHolder(holder: adapterList.ViewHolder, position: Int) {
        holder.render(list[position], context)
    }

    override fun getItemCount(): Int  = list.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val title = itemView.findViewById<TextView>(R.id.title)
        val price = itemView.findViewById<TextView>(R.id.price)
        val image = itemView.findViewById<ImageView>(R.id.imageView)

        fun render(item: ItemX, context: Context){

                title.setText(item.name)
                price.setText("$ "+item.price.toString())
                Glide.with(context).load(item.image).into(image)



        }

    }

}