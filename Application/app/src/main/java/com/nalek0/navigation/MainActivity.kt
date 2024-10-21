package com.nalek0.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Application()
        }
    }
}

@Serializable
object RootObject

@Composable
fun Application() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = RootWindow {
        navController.navigate(
            route = RootObject
        )
    }) {
        composable<RootObject> {
            RootWindow(onNavigate = {
                navController.navigate(
                    route = RootObject
                )
            })
        }
    }
}
