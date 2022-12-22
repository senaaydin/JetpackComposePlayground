package com.senaaydin.jetpackcomposeplayground.screen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.senaaydin.jetpackcomposeplayground.components.textfields.PasswordTextField
import com.senaaydin.jetpackcomposeplayground.components.textfields.CustomTextField

@Composable
fun TextFieldScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomTextField()
        PasswordTextField()
    }
}
