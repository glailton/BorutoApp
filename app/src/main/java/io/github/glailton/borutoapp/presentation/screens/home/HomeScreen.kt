package io.github.glailton.borutoapp.presentation.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import io.github.glailton.borutoapp.presentation.common.ListContent
import io.github.glailton.borutoapp.presentation.components.RatingWidget
import io.github.glailton.borutoapp.ui.theme.LARGE_PADDING

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalCoilApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val allHeroes = homeViewModel.getAllHeroes.collectAsLazyPagingItems()
    Scaffold(
        topBar = {
            HomeTopBar(onSearchClicked = {} )
        },
        content = {
            ListContent(heroes = allHeroes, navController = navController)
        }
    )
}