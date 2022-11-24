package com.example.e_book.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.e_book.R
import com.example.e_book.`class`.Screen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Setting( navController: NavController) {
    Scaffold(bottomBar = { com.example.e_book.BottomNavigation(navController = navController) }) {
        Box{
            Image(painter = painterResource(id = R.drawable.back2),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(height = 1000.dp, width = 400.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp)
        ) {
            val paddingModifier = Modifier.padding(10.dp);
            Text("SETTINGS",
                modifier = paddingModifier,
                style = MaterialTheme.typography.h4,
                color = Color.White, fontWeight = FontWeight.Bold)

            Card(
                border = BorderStroke(2.dp, Color.Red),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .size(70.dp).clickable { navController.navigate(Screen.Profile.toString()) }) {
                Row(modifier = Modifier.padding(horizontal = 4.dp, vertical = 11.dp)) {
                    Icon(painter = painterResource(id = R.drawable.person1),
                        contentDescription = null,
                        modifier = Modifier.padding(vertical = 6.dp))
                    Text(text = "Profile", modifier = paddingModifier)
                }
            }


            Card(
                border = BorderStroke(2.dp, Color.Red),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .size(70.dp).clickable { navController.navigate(Screen.About.toString()) }) {
                Row(modifier = Modifier.padding(horizontal = 4.dp, vertical = 11.dp)) {
                    Icon(painter = painterResource(id = R.drawable.about),
                        contentDescription = null,
                        modifier = Modifier.padding(vertical = 6.dp))
                    Text(text = "About", modifier = paddingModifier)
                }
            }
            logOut(navController)
        }
    }
}
    }
@Composable
fun logOut(navController: NavController){
    Card(
        border = BorderStroke(2.dp, Color.Red),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .size(70.dp).clickable(onClick = { autha.signOut()
            navController.navigate(Screen.SignIn.toString())
            })) {
        Row(modifier = Modifier.padding(horizontal = 4.dp, vertical = 11.dp)) {
            Icon(painter = painterResource(id = R.drawable.logout), contentDescription = null, modifier = Modifier.padding(vertical = 6.dp))
            Text(text = "Logout", modifier = Modifier.padding(10.dp))
        }
    }
}