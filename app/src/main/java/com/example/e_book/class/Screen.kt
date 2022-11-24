package com.example.e_book.`class`

import com.example.e_book.R

sealed class Screens(val route: String) {
    object Splash : Screens("splash_screen")
}
sealed class Screen() {

    object Profile:Screen()
    object About:Screen()
    object SignIn:Screen()
    object SignUp:Screen()


}
sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String){

    object Home : BottomNavItem("Home", R.drawable.home,"home")
    object Favorite: BottomNavItem("Favorite",R.drawable.favorite,"Favorite")
    object Download: BottomNavItem("Download",R.drawable.download,"Download")
    object Setting: BottomNavItem("Setting",R.drawable.settings,"Setting")
}