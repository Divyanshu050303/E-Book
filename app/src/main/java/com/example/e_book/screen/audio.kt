package com.example.e_book.screen
//
//
//import android.app.Activity
//import android.os.Build
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.annotation.RequiresApi
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.e_book.ui.theme.EBookTheme
//
//
//class MainActivity : ComponentActivity() {
//    @RequiresApi(Build.VERSION_CODES.M)
//    private var pressedTime: Long = 0
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            EBookTheme() {
//                // on below line we are specifying background color for our application
//                Surface(
//                    // on below line we are specifying modifier and color for our app
//                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
//                ) {
//                    // on the below line we are specifying the theme as the scaffold.
//                    Scaffold(
//                        // in scaffold we are specifying the top bar.
//                        topBar = {
//                            // inside top bar we are specifying background color.
//                            TopAppBar(backgroundColor = Color.White,
//                                // along with that we are specifying title for our top bar.
//                                title = {
//                                    // in the top bar we are specifying tile as a text
//                                    Text(
//                                        // on below line we are specifying
//                                        // text to display in top app bar.
//                                        text = "GFG",
//
//                                        // on below line we are specifying
//                                        // modifier to fill max width.
//                                        modifier = Modifier.fillMaxWidth(),
//
//                                        // on below line we are specifying
//                                        // text alignment.
//                                        textAlign = TextAlign.Center,
//
//                                        // on below line we are specifying
//                                        // color for our text.
//                                        color = Color.White
//                                    )
//                                })
//                        }) {
//                        // on below line we are calling connection information method to display UI
//                        pressBackAgainToExit()
//                    }
//                }
//            }
//        }
//    }
//
//    // on below line we are calling on back press method.
//    @RequiresApi(Build.VERSION_CODES.M)
//    override fun onBackPressed() {
//        // on below line we are checking if the press time is greater than 2 sec
//        if (pressedTime + 2000 > System.currentTimeMillis()) {
//            // if time is greater than 2 sec we are closing the application.
//            super.onBackPressed()
//            finish()
//        } else {
//            // in else condition displaying a toast message.
//            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
//        }
//        // on below line initializing our press time variable
//        pressedTime = System.currentTimeMillis();
//    }
//}
//
//// on below line we are creating contact picker function.
//@Composable
//fun pressBackAgainToExit() {
//    // on below line we are creating variable for activity.
//    val activity = LocalContext.current as Activity
//    // on below line we are creating a column,
//    Column(
//        // on below line we are adding a modifier to it,
//        modifier = Modifier
//            .fillMaxSize()
//            // on below line we are adding a padding.
//            .padding(all = 30.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//    ) {
//        // on below line we are adding a text for heading.
//        Text(
//            // on below line we are specifying text
//            text = "Press Back Again to Exit in Android",
//            // on below line we are specifying text color, font size and font weight
//            color = greenColor, fontSize = 20.sp, fontWeight = FontWeight.Bold
//        )
//    }
//}
