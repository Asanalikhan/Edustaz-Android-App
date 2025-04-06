package com.example.edustaz.data.remote

import com.example.edustaz.data.model.LoginRequest
import com.example.edustaz.data.model.LoginResponse
import com.example.edustaz.data.model.OlympiadListResponseItem
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST("user/signin")
    suspend fun login(
        @Body body: LoginRequest
    ): Response<LoginResponse>

    @GET("competitions/competitions/")
    suspend fun getOlympiadList(
        @Header("Authorization") token: String
    ): Response<List<OlympiadListResponseItem>>

}