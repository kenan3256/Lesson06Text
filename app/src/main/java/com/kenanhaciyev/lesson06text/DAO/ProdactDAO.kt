package com.kenanhaciyev.lesson06text.DAO

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.kenanhaciyev.lesson06text.entity.Prodact
interface ProdactDAO {

    @Insert
    suspend fun insert(prodact:Prodact)

    @Query("Select * From prodact")
    fun getAllProdact() : LiveData<List <Prodact>>


    @Delete
    suspend fun deleteProdact(prodact:Prodact)

    @Update
    suspend fun updateProdact(prodact: Prodact)

}