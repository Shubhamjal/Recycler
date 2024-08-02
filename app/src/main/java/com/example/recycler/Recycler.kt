package com.example.recycler

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler.databinding.ActivityRecyclerBinding

class Recycler : AppCompatActivity() {

    lateinit var binding: ActivityRecyclerBinding

    var list= arrayListOf("c","c++","java")
    var studentlist= arrayListOf<Student>()
    lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding=ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        studentlist.add(Student( 1, "Test", "C"))
        studentlist.add(Student( 2, "Bjarne", "C++"))
        studentlist.add(Student( 3, "James", "Java"))

        recyclerAdapter=RecyclerAdapter(studentlist,this)

        binding.recycler.layoutManager=LinearLayoutManager(
           this,LinearLayoutManager.VERTICAL,false)
        binding.recycler.adapter=recyclerAdapter

    }

    fun update(position: Int) {

    }

    fun delete(position: Int) {

    }


}



