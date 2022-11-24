package com.example.e_book

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.e_book.`class`.BottomNavItem
import com.example.e_book.`class`.Screen
import com.example.e_book.`class`.Screens
import com.example.e_book.`class`.firebaseDataFile
import com.example.e_book.data.dataProvider
import com.example.e_book.data.dataProviderToCard

import com.example.e_book.screen.*
import com.example.e_book.ui.theme.EBookTheme
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson

class MainActivity : ComponentActivity() {
    private var pressedTime: Long = 0
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EBookTheme {
                Surface {
                    SastaSpotity()
                }
            }
        }}
        @Deprecated("Deprecated in Java")
        @RequiresApi(Build.VERSION_CODES.M)
        override fun onBackPressed() {
            // on below line we are checking if the press time is greater than 2 sec
            if (pressedTime + 2000 > System.currentTimeMillis()) {
                // if time is greater than 2 sec we are closing the application.
                finish()
            } else {
                // in else condition displaying a toast message.
                Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
            }
            // on below line initializing our press time variable
            pressedTime = System.currentTimeMillis();
        }
    }

    @RequiresApi(Build.VERSION_CODES.P)
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Composable
    fun SastaSpotity(){
        val navController= rememberNavController()
        EBookTheme() {

                Navigation(navController=navController)

        }
    }

    @Composable
    fun Navigation(navController:NavHostController) {
        NavHost(navController = navController,
            startDestination = Screens.Splash.route) {

            composable("splash_screen") {
                SplashScreen(navController = navController)
            }
            composable(BottomNavItem.Home.screen_route) {
                Home(navController)
            }

            composable(BottomNavItem.Favorite.screen_route) {
                Favorite(navController)
            }
            composable(BottomNavItem.Download.screen_route) {
                Download(navController)
            }

            composable(BottomNavItem.Setting.screen_route) {
                Setting(navController)
            }
            composable(Screen.Profile.toString()) {
                ProfileScreen(navController = navController)
            }
            composable(Screen.About.toString()) {
                About(navController = navController)

            }
            composable(Screen.SignIn.toString()) {
                SignIn(navController = navController)

            }
            composable(Screen.SignUp.toString()) {
                SignUp(navController)

            }
            composable("bookList/{book}", arguments = listOf(navArgument("book"){
                type= NavType.StringType
            })) { backStackEntry ->
                backStackEntry.arguments?.getString("book")?.let { json ->
                    val book = Gson().fromJson(json, dataProvider::class.java)
                    MoreBookScreen(typeofBook = book, navController = navController)
                }
            }
            composable("Player/{PlayBook}", arguments = listOf(navArgument("PlayBook"){
                type=NavType.StringType
            })){
                    navBackStackEntry ->navBackStackEntry.arguments?.getString("PlayBook")?.let{
                    json ->val pdf =Gson().fromJson(json, dataProviderToCard::class.java)
                PdfVieweroffline(navController = navController, book =pdf )

            }
            }
            composable("bookPdfList/{BookPdfView}", arguments = listOf(navArgument("BookPdfView"){
                type=NavType.StringType
            })){
                    navBackStackEntry ->navBackStackEntry.arguments?.getString("BookPdfView")?.let{
                    json ->val pdf =Gson().fromJson(json, dataProviderToCard::class.java)
                PdfVieweroffline( navController=navController,book=pdf )
            }
            }
            composable("bookfavPdfList/{FAVBookPdfView}", arguments = listOf(navArgument("FAVBookPdfView"){
                type=NavType.StringType
            })){
                    navBackStackEntry ->navBackStackEntry.arguments?.getString("FAVBookPdfView")?.let{
                    json ->val favpdf =Gson().fromJson(json, dataProviderToCard::class.java)
                PdfViewerofflineFav( navController=navController,book=favpdf )
            }
            }
            composable("bookPdfdownList/{downbook}", arguments = listOf(navArgument("downbook"){
                type=NavType.StringType
            })){
                    navBackStackEntry ->navBackStackEntry.arguments?.getString("downbook")?.let{
                    json ->val favpdf =Gson().fromJson(json, dataProviderToCard::class.java)
                PdfViewerofflineDown( navController=navController,book=favpdf )
            }
            }
        }
    }

@Composable
 fun BottomNavigation(
    navController: NavController
){ val items= listOf(
    BottomNavItem.Home,
    BottomNavItem.Favorite,
    BottomNavItem.Download,
    BottomNavItem.Setting
)

    BottomNavigation(
        backgroundColor = Color(color = R.color.BackgroundColor)) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute=navBackStackEntry?.destination?.route
        items.forEach{
                item -> BottomNavigationItem(
            icon ={ Icon(painterResource(id = item.icon), contentDescription = item.title)},
            label={Text(text = item.title, fontSize = 10.sp)},
            selectedContentColor = Color.Red,
            unselectedContentColor = Color.White,
            alwaysShowLabel = true,
            selected = currentRoute==item.screen_route,
            onClick = {
                navController.navigate(item.screen_route){
                    navController.graph.startDestinationRoute?.let { screen_route ->popUpTo(screen_route){
                        saveState=true
                    } }
                    launchSingleTop=true
                    restoreState=true
                }
            }
        )
        }
    }

}

