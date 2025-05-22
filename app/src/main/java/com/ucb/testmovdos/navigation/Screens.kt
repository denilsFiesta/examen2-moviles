package com.ucb.testmovdos.navigation

sealed class Screens(
    val route: String
) {
    object Home : Screens("home_screen")
    object Send: Screens("send_sim")
}