package com.ucb.testmovdos.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ucb.testmovdos.home.HomeBUI
import com.ucb.testmovdos.home.HomeUI
import com.ucb.testmovdos.sendsim.SendSIMUI

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ){
        composable(Screens.Home.route) {
            HomeUI(
                onGoToSend = {navController.navigate(Screens.Send.route)},
                onGoToRight = {navController.navigate(Screens.HomeB.route)}
            )
        }

        composable(Screens.HomeB.route) {
            HomeBUI (
                onGoToSend = {navController.navigate(Screens.Send.route)},
                onGoToLeft = {navController.navigate(Screens.Home.route)},
            )
        }

        composable(Screens.Send.route) {
            SendSIMUI()
        }
    }
}