package com.example.examplenewsmvvm.pojo


import com.google.gson.annotations.SerializedName

data class NewsResponce(

    val articles: List<Article>,

    val status: String,

    val totalResults: Int
)