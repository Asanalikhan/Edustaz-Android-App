package com.example.edustaz.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.edustaz.ui.navigation.AppNavGraph
import com.example.edustaz.ui.screen.LoginPage
import com.example.edustaz.ui.screen.RegistrationPage
import com.example.edustaz.ui.screen.ResetPasswordPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            AppNavGraph(navController = navController)
        }
    }
}
