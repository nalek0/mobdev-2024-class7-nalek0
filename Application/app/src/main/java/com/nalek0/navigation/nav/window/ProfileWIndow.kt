package com.nalek0.navigation.nav.window

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.nalek0.navigation.WindowTemplate

@Composable
fun ProfileWindow(navigateUp: () -> Unit) {
    WindowTemplate(navigateUp) {
        Text("Profile Window")
    }
}
