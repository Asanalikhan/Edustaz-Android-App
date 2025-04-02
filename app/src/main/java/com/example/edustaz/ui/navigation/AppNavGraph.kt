package com.example.edustaz.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.edustaz.ui.screen.AtestatPage
import com.example.edustaz.ui.screen.CoursePage
import com.example.edustaz.ui.screen.HomePage
import com.example.edustaz.ui.screen.LoginPage
import com.example.edustaz.ui.screen.MaterialsPage
import com.example.edustaz.ui.screen.OlympiadPage
import com.example.edustaz.ui.screen.RegistrationPage
import com.example.edustaz.ui.screen.ResetPasswordPage

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginPage(
                onNavigateToRegister = { navController.navigate("register") },
                onNavigateToReset = { navController.navigate("reset") },
                onNavigateToLogin = { navController.navigate("home") })
        }
        composable("register") {
            RegistrationPage(onNavigateBack = { navController.popBackStack() })
        }
        composable("reset") {
            ResetPasswordPage(onNavigateBack = { navController.popBackStack() })
        }
        composable("home") {
            HomePage(title = "Басты бет", navController = navController)
        }
        composable("atestat") {
            AtestatPage(title = "Атестатияға дайындық", navController = navController)
        }
        composable("course") {
            CoursePage(title = "Курстар", navController = navController)
        }
        composable("materials") {
            MaterialsPage(title = "Материалдар", navController = navController)
        }
        composable("olympiad") {
            OlympiadPage(title = "Олимпиада", navController = navController)
        }
    }
}
