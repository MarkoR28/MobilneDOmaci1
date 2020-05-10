package com.rn7417.covid19projekat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.rn7417.covid19projekat.R
import com.rn7417.covid19projekat.model.Pacijent

class PacijentAdapter(pacijentdiffer :PacijentDiffer): ListAdapter<Pacijent, PacijentViewHolder>(pacijentdiffer) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PacijentViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val containerVIew = layoutInflater.inflate(R.layout.layout_pacijent_list_item, parent, false)
        return PacijentViewHolder(containerVIew)
    }

    override fun onBindViewHolder(holder: PacijentViewHolder, position: Int) {
        val pacijent = getItem(position)
        holder.bind(pacijent)
    }

}