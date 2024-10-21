package com.nalek0.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nalek0.navigation.nav.data.ProfilePage
import com.nalek0.navigation.nav.data.RootPage
import com.nalek0.navigation.nav.window.ProfileWindow
import com.nalek0.navigation.nav.window.RootWindow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Application()
        }
    }
}

@Composable
fun Application() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = RootPage) {
        composable<RootPage> {
            RootWindow(navController::navigateUp, toProfile = { navController.navigate(route = ProfilePage) })
        }
        composable<ProfilePage> {
            ProfileWindow(navController::navigateUp)
        }
    }
}
