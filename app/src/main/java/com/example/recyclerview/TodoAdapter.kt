package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    var titles: ArrayList<String>,
    var status: ArrayList<Boolean>,
    var context: Context
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){

    inner class TodoViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        var title: TextView = itemView.findViewById(R.id.tvtitle)
        var isCheckedOrNot : CheckBox =itemView.findViewById(R.id.ischecked)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.title.text=titles.get(position)
        holder.isCheckedOrNot.isChecked =status.get(position)

    }
}