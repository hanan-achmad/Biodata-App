package com.d121211091.biodata_app.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.d121211091.biodata_app.ui.HomeScreenPreview
import com.d121211091.biodata_app.ui.UserDetailsPreview
import com.d121211091.biodata_app.data.response.Screen
import com.d121211091.biodata_app.ui.viewmodel.UserViewModel

@Composable
fun SetupNavGraph(
    navController: NavHostController, viewModel: UserViewModel, context: Context
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreenPreview(navController = navController, viewModel = viewModel)
        }

        composable(route = Screen.Details.route) {
            UserDetailsPreview(
                navController = navController,
                viewModel = viewModel,
                context = context
            )
        }
    }
}