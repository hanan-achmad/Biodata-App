package com.d121211091.biodata_app.data.response

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Details : Screen(route = "details_screen")
}