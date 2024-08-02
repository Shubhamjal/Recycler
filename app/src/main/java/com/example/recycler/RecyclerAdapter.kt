package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var list:ArrayList<Student>, var clickInterface: Recycler)
    :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    class ViewHolder(var view: View):RecyclerView.ViewHolder(view) {

        var name=view.findViewById<TextView>(R.id.StuName)
        var rollno=view.findViewById<TextView>(R.id.StuRollNo)
        var subject=view.findViewById<TextView>(R.id.StuClass)
        var updatde=view.findViewById<Button>(R.id.Updatebtn)
        var delete=view.findViewById<Button>(R.id.DeleteButton)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        TODO("Not yet implemented")
        val view=LayoutInflater.from(parent.context)
            .inflate((R.layout.base_item_layout),parent,false)
        return ViewHolder(view)

    }



    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return list.size
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        TODO("Not yet implemented")

holder.apply {
    holder.name.setText(list[position].Name)
    holder.rollno.setText(list[position].RollNo.toString())
    holder.subject.setText(list[position].subject)
    holder.updatde.setOnClickListener { clickInterface.update(position) }
    holder.delete.setOnClickListener { clickInterface.delete(position) }
}
    }
    interface onclick{
        fun update(position: Int)
        fun delete(position: Int)
    }

}