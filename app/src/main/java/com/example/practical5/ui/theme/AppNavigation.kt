package com.example.practical5.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practical5.screen.Login
import com.example.practical5.screen.RegisterPage
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        // Login screen
        composable("login") {
            Login(onSignUpClick = { navController.navigate("register") })
        }
        // Register screen
        composable("register") {
            RegisterPage(onLoginClick = { navController.navigate("login") })
        }
    }
}