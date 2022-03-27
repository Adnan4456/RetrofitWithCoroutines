package com.example.retrofitwithcoroutine

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesAPI {
    //we will use coroutines here
    @GET("quotes")
    suspend fun getQuotes(@Query ("page")page:Int ): Response<QuoteList>

    //BASE_URL + "/quotes?page=1"
     //complete URL will be like this.
}