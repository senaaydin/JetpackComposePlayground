package com.senaaydin.jetpackcomposeplayground.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.senaaydin.jetpackcomposeplayground.components.buttons.CustomElevatedButton
import com.senaaydin.jetpackcomposeplayground.layout.CustomScaffold
import com.senaaydin.jetpackcomposeplayground.layout.CustomTopBar

@Composable
fun DashBoardScreen(
    navigateToButtons: () -> Unit,
    navigateToLoadings: () -> Unit,
    navigateToOtpScreen: () -> Unit,
    navigateToExpandableCardScreen: () -> Unit,
    navigateToBasicCardScreen: () -> Unit,
    navigateToProgressDialogScreen: () -> Unit,
    navigateToSearchBarScreen: () -> Unit,
    navigateToHalfCircleProgress: () -> Unit,
) {
    val scaffoldState = rememberScaffoldState()

    CustomScaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState,
        topBar = {
            CustomTopBar(
                text = "DashBoard",
                elevation = 10.dp,
            )
        },
        content = {
            Content(
                navigateToButtons = {
                    navigateToButtons.invoke()
                },
                navigateToOtpScreen = {
                    navigateToOtpScreen.invoke()
                },
                navigateToLoadings = {
                    navigateToLoadings.invoke()
                },
                navigateToExpandableCardScreen = {
                    navigateToExpandableCardScreen.invoke()
                },
                navigateToBasicCardScreen = {
                    navigateToBasicCardScreen.invoke()
                },
                navigateToProgressDialogScreen = {
                    navigateToProgressDialogScreen.invoke()
                },
                navigateToSearchBarScreen = {
                    navigateToSearchBarScreen.invoke()
                },
                navigateToHalfCircleProgress = {
                    navigateToHalfCircleProgress.invoke()
                }
            )
        },
        backgroundColor = MaterialTheme.colors.background
    )
}

@Composable
private fun Content(
    navigateToButtons: () -> Unit,
    navigateToOtpScreen: () -> Unit,
    navigateToLoadings: () -> Unit,
    navigateToExpandableCardScreen: () -> Unit,
    navigateToBasicCardScreen: () -> Unit,
    navigateToProgressDialogScreen: () -> Unit,
    navigateToSearchBarScreen: () -> Unit,
    navigateToHalfCircleProgress: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomElevatedButton(onClick = navigateToButtons, text = "Buttons", textColor = Color.White)
        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToOtpScreen,
            text = "Otp",
            textColor = Color.White
        )
        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToLoadings,
            text = "Loadings",
            textColor = Color.White
        )
        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToExpandableCardScreen,
            text = "Expandable Card",
            textColor = Color.White
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToBasicCardScreen,
            text = "Basic Cards",
            textColor = Color.White
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToProgressDialogScreen,
            text = "Progress Dialog",
            textColor = Color.White
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToSearchBarScreen,
            text = "SearchBar",
            textColor = Color.White
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToHalfCircleProgress,
            text = "Half Circle Progress",
            textColor = Color.White
        )
    }
}
