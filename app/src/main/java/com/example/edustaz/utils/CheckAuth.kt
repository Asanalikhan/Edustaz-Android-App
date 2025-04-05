package com.example.edustaz.utils

import com.example.edustaz.data.model.SignupRequest

class CheckAuth {

    private fun checkEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun checkPassword(password: String): Boolean {
        return password.length >= 6
    }

    private fun checkName(name: String): Boolean {
        return name.isNotEmpty()
    }

    fun checkSignup(signupRequest: SignupRequest): Boolean {
        return checkEmail(signupRequest.email)
                && checkName(signupRequest.firstName)
                && checkName(signupRequest.lastName)
                && checkName(signupRequest.fatherName)
        /**                && checkPassword(signupRequest.password)         */
    }

    fun checkLogin(email: String, password: String): Boolean {
        return checkEmail(email) && checkPassword(password)
    }
}