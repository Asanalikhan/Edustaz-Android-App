package com.example.edustaz.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.edustaz.ui.screen.atestat.AtestatPage
import com.example.edustaz.ui.screen.auth.AuthViewModel
import com.example.edustaz.ui.screen.auth.LoginPage
import com.example.edustaz.ui.screen.auth.RegistrationPage
import com.example.edustaz.ui.screen.auth.ResetPasswordPage
import com.example.edustaz.ui.screen.course.CoursePage
import com.example.edustaz.ui.screen.home.HomePage
import com.example.edustaz.ui.screen.materials.MaterialsPage
import com.example.edustaz.ui.screen.olympiad.OlympiadPage

@Composable
fun AppNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            val authViewModel: AuthViewModel = viewModel()
            LoginPage(
                onNavigateToRegister = { navController.navigate("register") },
                onNavigateToReset = { navController.navigate("reset") },
                onNavigateToLogin = { navController.navigate("home") },
                viewModel = authViewModel
            )
        }
        composable("register") {
            val authViewModel: AuthViewModel = viewModel()
            RegistrationPage(
                onNavigateBack = { navController.popBackStack() },
                viewModel = authViewModel
            )
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
