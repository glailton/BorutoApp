package io.github.glailton.borutoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import coil.annotation.ExperimentalCoilApi
import io.github.glailton.borutoapp.presentation.screens.home.HomeScreen
import io.github.glailton.borutoapp.presentation.screens.search.SearchScreen
import io.github.glailton.borutoapp.presentation.screens.splash.SplashScreen
import io.github.glailton.borutoapp.presentation.screens.welcome.WelcomeScreen
import io.github.glailton.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY

@OptIn(ExperimentalCoilApi::class)
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Splash.route){
        composable(route = Screen.Splash.route) {
            SplashScreen(navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {

        }
        composable(route = Screen.Search.route) {
            SearchScreen(navController)
        }
    }
}