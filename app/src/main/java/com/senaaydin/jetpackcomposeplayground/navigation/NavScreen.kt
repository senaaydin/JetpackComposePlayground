package com.senaaydin.jetpackcomposeplayground.navigation

sealed class NavScreen(val route: String) {
    object DashBoard : NavScreen("dashboard")
    object Buttons : NavScreen("buttons")
    object FlipCard : NavScreen("flipCard")
    object Cards : NavScreen("cards")
    object ExpandableCard : NavScreen("expandableCard")
    object SearchBar : NavScreen("searchBar")
    object PinCodeScreen : NavScreen("pinCodeScreen")
    object DropDown : NavScreen("dropDown")
    object TextFields : NavScreen("textfields")
}