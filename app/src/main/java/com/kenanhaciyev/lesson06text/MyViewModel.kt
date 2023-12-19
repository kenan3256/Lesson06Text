package com.kenanhaciyev.lesson06text

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    var prodactName = MutableLiveData<String>()
    var prodactCode = MutableLiveData<String>()
    var prodactDescriptio = MutableLiveData<String>()

    val productList = mutableListOf<Prodact>()

    fun addList(){
        productList.add(Prodact(prodactName.value.toString(),prodactCode.value.toString(),prodactDescriptio.value.toString()))
        productList.forEach{it-> println(it)}
    }

}