package com.rn7417.covid19projekat.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.rn7417.covid19projekat.model.Pacijent
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.layout_pacijent_list_item.*

class PacijentViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer{

    fun bind(pacijent: Pacijent){
        /*nameTv.text = pacijent.name
        lastnameTv.text = pacijent.lastname*/

    }
}