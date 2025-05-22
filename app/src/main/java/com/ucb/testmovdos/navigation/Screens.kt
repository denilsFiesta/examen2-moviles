package com.ucb.testmovdos.navigation

sealed class Screens(
    val route: String
) {
    object Home : Screens("home_screen")
    object HomeB: Screens("home_b_screen")
    object Send: Screens("send_sim")
}