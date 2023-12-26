package com.kenanhaciyev.lesson06text.entity

import android.os.Parcelable
import androidx.lifecycle.MutableLiveData
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity
@Parcelize
data class Prodact(
    @ColumnInfo(name = "prodact_name") val prodactName :String?,
    @PrimaryKey(autoGenerate = true) val  prodactCode : Int,
    @ColumnInfo(name = "prodact_descriptin", defaultValue = "There is no mistake") val  prodactDescriptio : String?
) :Parcelable


