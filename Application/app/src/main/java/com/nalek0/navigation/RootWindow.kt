package com.nalek0.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RootWindow(onNavigate: () -> Unit) {
    WindowTemplate {
        Text("Root window")
    }
}