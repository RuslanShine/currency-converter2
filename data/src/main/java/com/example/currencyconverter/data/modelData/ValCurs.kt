package com.example.convertmy.data


import com.google.gson.annotations.SerializedName


data class ValCurs(
    @SerializedName("Valute")
    val valute: Valute
)