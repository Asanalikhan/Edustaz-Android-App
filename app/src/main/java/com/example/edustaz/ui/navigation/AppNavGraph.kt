package com.example.edustaz.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.edustaz.ui.screen.LoginPage
import com.example.edustaz.ui.screen.RegistrationPage
import com.example.edustaz.ui.screen.ResetPasswordPage

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginPage(onNavigateToRegister = { navController.navigate("register") },
                onNavigateToReset = { navController.navigate("reset") })
        }
        composable("register") {
            RegistrationPage(onNavigateBack = { navController.popBackStack() })
        }
        composable("reset") {
            ResetPasswordPage(onNavigateBack = { navController.popBackStack() })
        }
    }
}
