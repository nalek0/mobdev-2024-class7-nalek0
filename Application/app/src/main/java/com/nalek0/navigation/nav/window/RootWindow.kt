package com.nalek0.navigation.nav.window

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.nalek0.navigation.WindowTemplate
import com.nalek0.navigation.nav.data.ProfilePage

@Composable
fun RootWindow(navigateUp: () -> Unit, toProfile: () -> Unit) {
    WindowTemplate(navigateUp) {
        Column {
            Text("Root window")
            Button(onClick = toProfile, shape = RoundedCornerShape(5.dp)) {
                Text(text = "My Profile")
            }
        }
    }
}