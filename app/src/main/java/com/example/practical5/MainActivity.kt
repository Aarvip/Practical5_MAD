package com.example.practical5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.practical5.ui.theme.AppNavigation
import com.example.practical5.screen.Login
import com.example.practical5.screen.RegisterPage
import com.example.practical5.ui.theme.AppNavigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
            }
    }
}