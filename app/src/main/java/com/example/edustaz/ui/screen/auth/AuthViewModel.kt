package com.example.edustaz.ui.screen.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.edustaz.data.model.LoginRequest
import com.example.edustaz.data.model.SignupRequest


class AuthViewModel : ViewModel() {

    fun signup(signupRequest: SignupRequest) {
        Log.d("Signup:", signupRequest.email)
    }

    fun login(loginRequest: LoginRequest) {
        Log.d("Login:", loginRequest.username)
    }
}