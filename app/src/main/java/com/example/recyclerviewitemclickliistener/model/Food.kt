package com.example.recyclerviewitemclickliistener.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(
    val image: Int,
    val name: String
): Parcelable