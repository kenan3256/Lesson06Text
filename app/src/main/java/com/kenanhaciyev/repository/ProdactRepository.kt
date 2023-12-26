package com.kenanhaciyev.repository

import androidx.lifecycle.LiveData
import com.kenanhaciyev.lesson06text.DAO.ProdactDAO
import com.kenanhaciyev.lesson06text.entity.Prodact

class ProdactRepository (private val prodactDao : ProdactDAO) {
    suspend fun insert (prodact:Prodact){
        prodactDao.insert(prodact)
    }

    fun getAll():LiveData<List<Prodact>>{
        return prodactDao.getAllProdact()
    }

    suspend fun delete(prodact:Prodact){
       prodactDao.deleteProdact(prodact)
    }

    suspend fun update(prodact: Prodact){
        prodactDao.updateProdact(prodact)
    }


}