package com.rn7417.covid19projekat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.rn7417.covid19projekat.R
import com.rn7417.covid19projekat.model.Pacijent

class HospitalizovaniAdapter (pacijentdiffer :PacijentDiffer): ListAdapter<Pacijent, HospitalizovaniViewHolder>(pacijentdiffer) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalizovaniViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val containerVIew = layoutInflater.inflate(R.layout.layout_hospitalizovani_list_item, parent, false)
        return HospitalizovaniViewHolder(containerVIew)
    }

    override fun onBindViewHolder(holder: HospitalizovaniViewHolder, position: Int) {
        val pacijent = getItem(position)
        holder.bind(pacijent)
    }

}