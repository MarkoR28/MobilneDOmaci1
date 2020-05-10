package com.rn7417.covid19projekat.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.rn7417.covid19projekat.model.Pacijent
import com.squareup.picasso.Picasso
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.layout_pacijent_list_item.view.*

class PacijentViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer{

    fun bind(pacijent: Pacijent){
        Picasso.get()
            .load(pacijent.picture)
            .into(containerView.pacijentPictureIv)
        containerView.recyclernameTv.text = pacijent.name
        containerView.recyclerlastnameTv.text = pacijent.lastname
    }
}