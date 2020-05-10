package com.rn7417.covid19projekat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.rn7417.covid19projekat.R
import com.rn7417.covid19projekat.model.Pacijent

class OtpisaniAdapter (pacijentdiffer :PacijentDiffer): ListAdapter<Pacijent, OtpisaniViewHolder>(pacijentdiffer) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OtpisaniViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val containerVIew = layoutInflater.inflate(R.layout.layout_otpisani_list_item, parent, false)
        return OtpisaniViewHolder(containerVIew)
    }

    override fun onBindViewHolder(holder: OtpisaniViewHolder, position: Int) {
        val pacijent = getItem(position)
        holder.bind(pacijent)
    }

}