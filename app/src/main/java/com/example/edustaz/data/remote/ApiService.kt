package com.example.edustaz.data.remote

import com.example.edustaz.data.model.LoginRequest
import com.example.edustaz.data.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("user/signin")
    suspend fun login(
        @Body body: LoginRequest
    ): Response<LoginResponse>

}