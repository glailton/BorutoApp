package io.github.glailton.borutoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import io.github.glailton.borutoapp.domain.use_cases.UseCases
import io.github.glailton.borutoapp.navigation.Screen
import io.github.glailton.borutoapp.navigation.SetupNavGraph
import io.github.glailton.borutoapp.ui.theme.BorutoAppTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    @Inject
    lateinit var useCases: UseCases

    private var completed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            BorutoAppTheme {
                navController = rememberNavController()
                SetupNavGraph(
                    navController = navController,
                    startDestination = if (completed) Screen.Home.route else Screen.Welcome.route
                )
            }
        }

        lifecycleScope.launch(Dispatchers.IO) {
            useCases.readOnBoardingUseCase().collect {
                completed = it
            }
        }
    }
}