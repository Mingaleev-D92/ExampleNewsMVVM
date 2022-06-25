package com.example.examplenewsmvvm.api

import com.example.examplenewsmvvm.pojo.NewsResponce
import com.example.examplenewsmvvm.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Mingaleev D. 25.06.2022
 **/
interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode: String = "ru",
        @Query("page") pageNumber:Int = 1,
        @Query("apiKey") apiKey:String = API_KEY
    ):Response<NewsResponce>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") searchQuery: String,
        @Query("page") pageNumber:Int = 1,
        @Query("apiKey") apiKey:String = API_KEY
    ):Response<NewsResponce>
}