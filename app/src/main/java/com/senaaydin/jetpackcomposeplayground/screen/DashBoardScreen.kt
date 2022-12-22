package com.senaaydin.jetpackcomposeplayground.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.senaaydin.jetpackcomposeplayground.R
import com.senaaydin.jetpackcomposeplayground.components.buttons.CustomElevatedButton
import com.senaaydin.jetpackcomposeplayground.layout.CustomScaffold
import com.senaaydin.jetpackcomposeplayground.layout.CustomTopBar

@Composable
fun DashBoardScreen(
    navigateToButtons: () -> Unit,
    navigateToExpandableCardScreen: () -> Unit,
    navigateToCardScreen: () -> Unit,
    navigateToSearchBarScreen: () -> Unit,
    navigateToPinCodeScreen: () -> Unit,
    navigateToFlipCard: () -> Unit,
    navigateToTextFields: () -> Unit,
    navigateToDropDown: () -> Unit,
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
                navigateToExpandableCardScreen = {
                    navigateToExpandableCardScreen.invoke()
                },
                navigateToCardScreen = {
                    navigateToCardScreen.invoke()
                },
                navigateToSearchBarScreen = {
                    navigateToSearchBarScreen.invoke()
                },
                navigateToPinCodeScreen = {
                    navigateToPinCodeScreen.invoke()
                },
                navigateToFlipCard = {
                    navigateToFlipCard.invoke()
                },
                navigateToTextFields = {
                    navigateToTextFields.invoke()
                },
                navigateToDropDown = {
                    navigateToDropDown.invoke()
                }
            )
        },
        backgroundColor = MaterialTheme.colors.background
    )
}



@Composable
private fun Content(
    navigateToButtons: () -> Unit,
    navigateToExpandableCardScreen: () -> Unit,
    navigateToCardScreen: () -> Unit,
    navigateToSearchBarScreen: () -> Unit,
    navigateToPinCodeScreen: () -> Unit,
    navigateToFlipCard: () -> Unit,
    navigateToTextFields: () -> Unit,
    navigateToDropDown: () -> Unit
) {
    val listState = rememberLazyListState()
    LazyColumn(state = listState, modifier = Modifier.fillMaxSize() ) {

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        CustomElevatedButton(
            onClick = navigateToButtons,
            text = "Buttons",
            elevation = ButtonDefaults.elevation(2.dp),
            textColor = Color.White,
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        )
        Text(
            stringResource(id = R.string.otp),
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .clickable(onClick = navigateToPinCodeScreen)
                .fillMaxWidth()
                .padding(10.dp)
        )
        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToPinCodeScreen,
            text = "Otp",
            elevation = ButtonDefaults.elevation(2.dp),
            textColor = Color.White,
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToCardScreen,
            text = "Basic Cards",
            elevation = ButtonDefaults.elevation(2.dp),
            textColor = Color.White,
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToFlipCard,
            text = "Flip Card",
            elevation = ButtonDefaults.elevation(2.dp),
            textColor = Color.White,
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToSearchBarScreen,
            text = "SearchBar",
            elevation = ButtonDefaults.elevation(2.dp),
            textColor = Color.White,
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToPinCodeScreen,
            text = "Pin Code",
            elevation = ButtonDefaults.elevation(2.dp),
            textColor = Color.White,
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToDropDown,
            text = "Drop Down",
            elevation = ButtonDefaults.elevation(2.dp),
            textColor = Color.White,
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        )

        CustomElevatedButton(
            modifier = Modifier.padding(top = 10.dp),
            onClick = navigateToTextFields,
            text = "Text Fields",
            elevation = ButtonDefaults.elevation(2.dp),
            textColor = Color.White,
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        )
    }
}
