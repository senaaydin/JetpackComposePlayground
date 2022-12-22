package com.senaaydin.jetpackcomposeplayground.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.senaaydin.jetpackcomposeplayground.components.`package`.DropDownScreen
import com.senaaydin.jetpackcomposeplayground.components.card.FlipCardScreen
import com.senaaydin.jetpackcomposeplayground.components.pincodeview.PinCodeScreen
import com.senaaydin.jetpackcomposeplayground.components.textfields.SearchBar
import com.senaaydin.jetpackcomposeplayground.layout.CustomScaffold
import com.senaaydin.jetpackcomposeplayground.screen.*

@OptIn(
    ExperimentalAnimationApi::class,
    ExperimentalMaterialApi::class,
    ExperimentalComposeUiApi::class
)
@Composable
fun NavGraph(startDestination: String = NavScreen.DashBoard.route) {
    val navController = rememberAnimatedNavController()

    CustomScaffold(
        backgroundColor = MaterialTheme.colors.background,
    ) { innerPadding ->
        AnimatedNavHost(
            navController = navController,
            startDestination = startDestination,
            Modifier.padding(innerPadding)
        ) {

            composable(NavScreen.DashBoard.route) {
                DashBoardScreen(navigateToButtons = {
                    navController.navigate(NavScreen.Buttons.route)
                }, navigateToCardScreen = {
                    navController.navigate(NavScreen.Cards.route)
                }, navigateToSearchBarScreen = {
                    navController.navigate(NavScreen.SearchBar.route)
                },  navigateToPinCodeScreen = {
                    navController.navigate(NavScreen.PinCodeScreen.route)
                }, navigateToDropDown = {
                    navController.navigate(NavScreen.DropDown.route)
                }, navigateToFlipCard = {
                        navController.navigate(NavScreen.FlipCard.route)
                    }, navigateToTextFields = {
                        navController.navigate(NavScreen.TextFields.route)
                }, navigateToExpandableCardScreen = {
                        navController.navigate(NavScreen.ExpandableCard.route)
                    },
                )
            }

            composable(NavScreen.Buttons.route) {
                ButtonsScreen(navigateToBack = {
                    navController.popBackStack()
                })
            }
            composable(NavScreen.PinCodeScreen.route) {
                PinCodeScreen(navigateToBack = {
                    navController.popBackStack()
                })
            }
            composable(NavScreen.DropDown.route) {
                DropDownScreen()
            }
            composable(NavScreen.FlipCard.route) {
                FlipCardScreen()
            }
            composable(NavScreen.TextFields.route) {
                TextFieldScreen()
            }
            composable(NavScreen.Cards.route) {
                CardsScreen()
            }
            composable(NavScreen.SearchBar.route) {
                SearchScreen (navigateToBack = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}
