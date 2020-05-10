package com.rn7417.covid19projekat.adapter

import androidx.recyclerview.widget.DiffUtil
import com.rn7417.covid19projekat.model.Pacijent

class PacijentDiffer : DiffUtil.ItemCallback<Pacijent>(){
    override fun areItemsTheSame(oldItem: Pacijent, newItem: Pacijent): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Pacijent, newItem: Pacijent): Boolean {
        return oldItem.name == newItem.name && oldItem.lastname == newItem.lastname && oldItem.stanje == newItem.stanje
    }

}