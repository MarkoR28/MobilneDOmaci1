package com.rn7417.covid19projekat.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.rn7417.covid19projekat.R
import com.rn7417.covid19projekat.adapter.PacijentAdapter
import com.rn7417.covid19projekat.adapter.PacijentDiffer
import com.rn7417.covid19projekat.adapter.PacijentViewHolder
import com.rn7417.covid19projekat.model.PacijentViewModel
import kotlinx.android.synthetic.main.activity_cekaonica_fragment.*

class CekaonicaFragment : Fragment(R.layout.activity_cekaonica_fragment) {

    private val pacijentViewModel: PacijentViewModel by viewModels()
    private lateinit var pacijentAdapter: PacijentAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init(){
        initListeners()
        initRecycler()
    }

    private fun initListeners(){}
    private fun initRecycler(){
        listRv.layoutManager = LinearLayoutManager(this.activity)
        pacijentAdapter = PacijentAdapter(PacijentDiffer())
        listRv.adapter = pacijentAdapter
    }
    private fun initObservers(){
        pacijentViewModel.getPacijenti().observe(this, Observer {
            pacijentAdapter.submitList(it)
        })
    }



}
