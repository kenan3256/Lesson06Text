package com.kenanhaciyev.lesson06text

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kenanhaciyev.lesson06text.entity.Prodact

class MyViewModel:ViewModel() {
    var prodactName = MutableLiveData<String>()
    var prodactCode = MutableLiveData<String>()
    var prodactDescriptio = MutableLiveData<String>()

    val productList = mutableListOf<Prodact>()


    }

