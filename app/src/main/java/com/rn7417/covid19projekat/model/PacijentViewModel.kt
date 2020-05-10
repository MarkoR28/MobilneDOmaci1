package com.rn7417.covid19projekat.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PacijentViewModel : ViewModel(){

    private val pacijentList : MutableList<Pacijent> = mutableListOf()
    private val pacijenti : MutableLiveData<List<Pacijent>> = MutableLiveData()

    init {
        for(i in 0..5){
            val pacijent = Pacijent(
                i,
                "https://cdn.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png",
                "Pacijent$i",
            "Prezime$i",
                "Ceka$i",
                "jedan"
            )
            pacijentList.add(pacijent)
        }
        for(i in 6..11){
            val pacijent = Pacijent(
                i,
                "https://cdn.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png",
                "Pacijent$i",
                "Prezime$i",
                "Za hospitalizaciju$i",
                "dva"
            )
            pacijentList.add(pacijent)
        }
        for(i in 12..20){
            val pacijent = Pacijent(
                i,
                "https://cdn.business2community.com/wp-content/uploads/2017/08/blank-profile-picture-973460_640.png",
                "Pacijent$i",
                "Prezime$i",
                "Otpisani$i",
                "tri"
            )
            pacijentList.add(pacijent)
        }
        pacijenti.value = pacijentList
    }
    fun getPacijenti() : LiveData<List<Pacijent>>{

        return pacijenti
    }
    fun filterPacijenti(filter:String){
        val filteredList = pacijentList.filter {
            it.name.toLowerCase().contains(filter.toLowerCase())
        }
        pacijenti.value = filteredList
    }


}