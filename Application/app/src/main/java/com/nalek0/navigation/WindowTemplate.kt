package com.nalek0.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.nalek0.navigation.ui.theme.NavigationTheme

@Composable
fun WindowTemplate(content: @Composable () -> Unit) {
    NavigationTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { TopBar() },
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                content()
            }
        }
    }
}

@Composable
private fun TopBar() {
    val navController = rememberNavController()

    NavigationTheme {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.tertiary)
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = navController::navigateUp,
                modifier = Modifier.wrapContentSize(),
                shape = RoundedCornerShape(5.dp),
            ) {
                Text("<<<")
            }
            Text(text = stringResource(id = R.string.app_name), fontSize = 18.sp)
        }
    }
}
