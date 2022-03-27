package com.example.fragmenttask3_k

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


abstract class ListFrag : Fragment() {
    var recyclerView: RecyclerView? = null
    var myAdapter: RecyclerView.Adapter<*>? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    internal abstract var view: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = inflater.inflate(R.layout.fragment_list, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView = requireView().findViewById(R.id.list)
        recyclerView!!.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this.activity)
        recyclerView!!.setLayoutManager(layoutManager)
        myAdapter = this.activity?.let { ApplicationClass.cars?.let { it1 -> CarAdapter(it, it1) } }
        recyclerView!!.setAdapter(myAdapter)
    }
}