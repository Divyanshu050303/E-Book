package com.example.e_book.screen

import android.content.ContentValues.TAG
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.e_book.R
import com.example.e_book.`class`.BottomNavItem
import com.google.firebase.database.core.utilities.Utilities


object Utility {
    fun preferences(context: Context?): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    fun hasSendToast(context: Context?): Boolean {
        return preferences(context).getBoolean("Toast", false)
    }

    fun setSendToast(context: Context?, bool: Boolean?) {
        preferences(context).edit()
            .putBoolean("Toast", bool!!).apply()
    }
}
var username by  mutableStateOf("")
@Composable
fun SignUp(navController: NavController){
    var email by remember { mutableStateOf("") }
    val gmail=Regex("^([a-z0-9+._]{5,25})@(gmail).(co+m?)\$")
    val yahoo=Regex("^([a-z0-9+._]{5,25})@(yahoo).(in)\$")
    val outlook=Regex("^([a-z0-9+._]{5,25})@(outlook).(com)\$")
    val gla=Regex("^([a-z]{3,15}).([a-z]{3,15})([2-9]{1,1})?_(cs)([1-2]{1,1})([0-9]{1,1})@(gla).(ac).(in)\$")
    var pass by remember {
        mutableStateOf("") }
    var counte=0
    var counta=0
    var countp=0
    var countm=0
    var countwl=0

    val context= LocalContext.current
    Box(Modifier
        .background(Color.DarkGray)
        .size(height = 1200.dp, width = 450.dp)) {
        Image(painter = painterResource(id = R.drawable.signinimage),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(height = 1000.dp, width = 400.dp))
        Column(Modifier
            .padding(vertical = 100.dp)) {
            Text(text = "Sign Up",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(horizontal = 100.dp, vertical = 20.dp), color = Color.Black)
            OutlinedTextField(
                value = username,
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.person1),
                        contentDescription = "username", tint = Color.Black)
                },
                onValueChange = { username = it },
                label = { Text("Name", color = Color.Black) },
                placeholder = { Text(text = "Enter your name", color = Color.Black) },
                modifier = Modifier.padding(horizontal = 40.dp, vertical = 5.dp)
                , singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Black
                )
            )
            OutlinedTextField(
                value = email,
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email,
                        contentDescription = "emailIcon" , tint = Color.Black)
                },
                onValueChange = { email = it },
                label = { Text("Email", color = Color.Black) },
                placeholder = { Text(text = "Enter your e-mail", color = Color.Black) },
                modifier = Modifier.padding(horizontal = 40.dp, vertical = 5.dp),
                singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Black
                )
            )
            OutlinedTextField(
                value = pass,
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.password),
                        contentDescription = "emailIcon", tint = Color.Black)
                },
                onValueChange = { pass = it },
                label = { Text("Password", color = Color.Black) },
                placeholder = { Text(text = "PassWord", color = Color.Black) },
                modifier = Modifier.padding(horizontal = 40.dp),
                singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Black
                )
            )

            Button(onClick = {
                if(email.isEmpty()){
                    if(counte<=1){

                    Toast.makeText(context, "Enter your email Please", Toast.LENGTH_SHORT).show()
                    }
                    counte++;

                }
                else if(pass.isEmpty()){
                    if(countp<=1){

                    Toast.makeText(context, "Enter your Password Please", Toast.LENGTH_SHORT).show()
                    }
                    countp++
                }else {
                    if (email.matches(gmail)||email.matches(yahoo)||email.matches(outlook)||email.matches(gla)) {
                        autha.createUserWithEmailAndPassword(email, pass)
                            .addOnCompleteListener { task ->
                                if (task.isSuccessful) {
                                    Log.d(TAG, "createUserWithEmail:success")
                                    if(counta<=1){

                                    Toast.makeText(context, "Successfully Create Account",
                                        Toast.LENGTH_SHORT).show()
                                    }
                                    counta++

                                    navController.navigate(BottomNavItem.Setting.screen_route)
                                } else {
                                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                                    if(countwl<=1){

                                    Toast.makeText(context, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show()
                                    }
                                    countwl++
                                }
                            }
                    }
                    else{
                        if(countm<=1){

                        Toast.makeText(context, "Valid Email Please", Toast.LENGTH_LONG).show()
                        }
                        countm++
                    }
                }

            }, modifier = Modifier
                .width(120.dp)
                .padding(vertical = 8.dp)
                .align(
                    Alignment.CenterHorizontally)) {
                Text(text = "Sign up", style = MaterialTheme.typography.h5)

            }
        }
    }
}