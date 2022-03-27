package com.example.retrofitwithcoroutine

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    val BASE_URL = "https://quotable.io/"

    //This function will return object of retrofit
    fun getInstance():Retrofit{
        return  Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        //Now link this object with QuotesAPI interface.In MainActivity
    }
}