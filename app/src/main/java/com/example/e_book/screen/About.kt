package com.example.e_book.screen


import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.example.e_book.R
import com.example.e_book.`class`.BottomNavItem
import com.example.e_book.`class`.Screen

@Composable
fun About( navController: NavController) {
    Box(Modifier.verticalScroll(rememberScrollState())) {

            Row {
                Image(painter = painterResource(id = R.drawable.prev),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(horizontal = 15.dp)
                        .clickable(onClick = { navController.navigate(BottomNavItem.Setting.screen_route) })
                )
                Text(text = "About",
                    style = MaterialTheme.typography.h5,
                    color = Color.Black,
                    modifier = Modifier.padding(vertical = 8.dp))
        }
        Column() {
            Spacer(modifier = Modifier.padding(26.dp))
            AboutScreen(navController = navController, "Abhay Pratap Singh", R.drawable.user)
            AboutScreen(navController = navController, "Isha Agrawal", R.drawable.user)
            AboutScreen(navController = navController, "Aryan Singh", R.drawable.user)
            AboutScreen(navController = navController, "Alisha Dixit", R.drawable.user)
            AboutScreen(navController = navController, "Divyanshu Singh", R.drawable.user)
            Spacer(modifier = Modifier.padding(30.dp))
        }
    }
}

@Composable
fun AboutScreen(navController:NavController, name:String,photo:Int){
    Box(Modifier.border(1.dp, color = Color.Black).size(width = 392.5.dp, height = 280.dp)) {
        Column(
            Modifier
                .padding(vertical = 20.dp)) {
            Row(Modifier.padding(vertical = 5.dp)) {
                Image(painter = painterResource(id = photo),
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                        .clip(
                            CircleShape
                        ))
                Column(Modifier.padding(8.dp)) {
                    Text(text = name, style = MaterialTheme.typography.h5)
                    Text(text = "CSE Student at", style = MaterialTheme.typography.h6)
                    Text(text = "GLA University ", style = MaterialTheme.typography.h6)
                }
            }
        }
    }
}
@Composable
fun WebView(url:String){
    AndroidView(factory = {
        WebView(it).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            loadUrl(url)
        }
    }, update = {
        it.loadUrl(url)
    })
}