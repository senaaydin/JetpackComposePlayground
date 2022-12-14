package com.senaaydin.jetpackcomposeplayground.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.senaaydin.jetpackcomposeplayground.components.OutlinedButton
import com.senaaydin.jetpackcomposeplayground.components.buttons.CustomElevatedButton
import com.senaaydin.jetpackcomposeplayground.layout.BackArrowIcon
import com.senaaydin.jetpackcomposeplayground.layout.CustomScaffold
import com.senaaydin.jetpackcomposeplayground.layout.CustomTopBar

@Composable
fun ButtonsScreen(navigateToBack: () -> Unit) {
    val scaffoldState = rememberScaffoldState()

    CustomScaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState,
        topBar = {
            CustomTopBar(
                text = "Buttons",
                elevation = 10.dp,
                navigationIcon = {
                    BackArrowIcon(navigateToBack)
                },
                actions = {
                    IconButton(onClick = {}) {}
                },
            )
        },
        content = {
            Content()
        },
        backgroundColor = MaterialTheme.colors.background
    )
}

@Composable
private fun Content() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomElevatedButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {},
            text = "Enabled",
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xffE5EADC)
            ),
            leadingIcon = Icons.Default.Add,
            iconTintColor = Color(0xff648A4F),
            textColor = Color(0xff648A4F),
        )

//        GradientButton(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 8.dp, vertical = 8.dp)
//        ) {}

        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally),
        )
    }
}
