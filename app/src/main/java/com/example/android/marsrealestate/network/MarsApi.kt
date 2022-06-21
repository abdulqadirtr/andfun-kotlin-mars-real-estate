package com.example.android.marsrealestate.network

import retrofit2.Call
import retrofit2.http.GET

interface MarsApi {

    @GET("realestate")
    fun getProperties() : Call<String>
}