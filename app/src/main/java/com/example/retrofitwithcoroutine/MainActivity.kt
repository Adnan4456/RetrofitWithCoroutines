package com.example.retrofitwithcoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Now link this object with QuotesAPI interface.In MainActivity
        val quotesAPI = RetrofitHelper.getInstance().create(QuotesAPI::class.java)
            //Now we can access function defined in Interface using coroutine
        GlobalScope.launch {
            val result = quotesAPI.getQuotes(1)
            if (result != null){
                Log.d("MainActivity",result.body().toString())
            }
            else{
                Log.d("MainActivity","Result is null")
            }
        }
    }
}