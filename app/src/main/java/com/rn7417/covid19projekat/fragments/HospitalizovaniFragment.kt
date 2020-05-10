package com.rn7417.covid19projekat.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.rn7417.covid19projekat.R
import com.rn7417.covid19projekat.adapter.HospitalizovaniAdapter
import com.rn7417.covid19projekat.adapter.PacijentAdapter
import com.rn7417.covid19projekat.adapter.PacijentDiffer
import com.rn7417.covid19projekat.adapter.PacijentViewHolder
import com.rn7417.covid19projekat.model.PacijentViewModel
import kotlinx.android.synthetic.main.activity_hospitalizovani_fragment.*

class HospitalizovaniFragment : Fragment(R.layout.activity_hospitalizovani_fragment) {

    private val pacijentViewModel: PacijentViewModel by viewModels()
    private lateinit var pacijentAdapter: HospitalizovaniAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init(){
        initRecycler()
        initListener()
        initObservers()

    }
    private fun initListener(){
        hinputEt.doAfterTextChanged {
            pacijentViewModel.filterPacijenti(it.toString())
        }
    }
    private fun initRecycler(){
        hlistRv.layoutManager = LinearLayoutManager(this.activity)
        pacijentAdapter = HospitalizovaniAdapter(PacijentDiffer())
        hlistRv.adapter = pacijentAdapter
    }
    private fun initObservers(){
        /*pacijentViewModel.getPacijenti().observe(viewLifecycleOwner, Observer {
            pacijentAdapter.submitList(it)
        })*/
        pacijentViewModel.getPacijenti().observe(viewLifecycleOwner, Observer {
            pacijentAdapter.submitList(it.filter {
                it.status.equals("dva")
            })
        })
    }
    
}