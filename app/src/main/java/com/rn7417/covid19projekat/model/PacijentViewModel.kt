package com.rn7417.covid19projekat.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PacijentViewModel : ViewModel(){

    private val pacijentList : MutableList<Pacijent> = mutableListOf()
    private val pacijenti : MutableLiveData<List<Pacijent>> = MutableLiveData()

    init {
        for(i in 0..20){
            val pacijent = Pacijent(
                i,
                "",
                "Pacijent$i",
            "Prezime$i",
                "Nije zdrav$i"
            )
            pacijentList.add(pacijent)
        }
        pacijenti.value = pacijentList
    }
    fun getPacijenti() : LiveData<List<Pacijent>>{

        return pacijenti
    }

}