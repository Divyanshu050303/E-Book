package com.example.e_book.screen

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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
import com.example.e_book.`class`.Screen
import com.google.firebase.auth.FirebaseAuth

 var autha:FirebaseAuth=FirebaseAuth.getInstance()




@Composable
fun SignIn(navController: NavController){
    var email by remember { mutableStateOf("") }
    var pass by remember {
        mutableStateOf("") }
    val mContext = LocalContext.current
    var counte=0
    var counta=0
    var countp=0
    var counwl=0

    Box(Modifier
        .size(height = 1200.dp, width = 450.dp)
        .background(color = Color.DarkGray)) {
        Image(painter = painterResource(id = R.drawable.signinimage),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(height = 1000.dp, width = 400.dp))
        Column(Modifier
            .padding(vertical = 100.dp)) {
            Text(text = "Sign In",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(horizontal = 100.dp, vertical = 20.dp), color = Color.Black)
            OutlinedTextField(
                value = email,
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.email),
                        contentDescription = "emailIcon", tint = Color.Black)
                },
                onValueChange = { email = it },
                label = { Text("Email") },
                placeholder = { Text(text = "Enter your e-mail", color = Color.Black) },
                modifier = Modifier.padding(horizontal = 40.dp, vertical = 5.dp), singleLine = true,
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Black,
                            focusedLabelColor = Color.Black,
                            unfocusedLabelColor = Color.Black
                        )
            )
            Spacer(modifier = Modifier.padding(vertical = 10.dp))
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
                    unfocusedLabelColor = Color.Black)
            )
            Spacer(modifier = Modifier.padding(vertical = 10.dp))
            Button(onClick = {

                if(email.isEmpty()){

                    if(counte<=1){

                    Toast.makeText(mContext, "Enter your email Please", Toast.LENGTH_SHORT).show()
                    }
                     counte+=1
                }
                else if(pass.isEmpty()){
                    if(countp<=1){

                    Toast.makeText(mContext, "Enter your Password Please", Toast.LENGTH_SHORT).show()
                    }
                    countp+=1
                }else {
                    autha.signInWithEmailAndPassword(email, pass).addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Log.d(TAG, "signInWithEmail:success")
                            if(counta<=1){

                            Toast.makeText(mContext, "Loged in",
                                Toast.LENGTH_SHORT).show()
                            }
                            counta++
                            navController.navigate(BottomNavItem.Setting.screen_route)
                        } else {
                            Log.w(TAG, "signInWithEmail:failure", task.exception)
                            if(counwl<=1){

                            Toast.makeText(mContext, "Authentication failed.",
                                Toast.LENGTH_SHORT).show()
                            }
                            counwl++

                        }
                    }
                }

            }, modifier = Modifier
                .width(160.dp)
                .padding(vertical = 8.dp)
                .align(
                    Alignment.CenterHorizontally)) {
                Text(text = "Sign In", style = MaterialTheme.typography.h5)

            }
            Spacer(modifier = Modifier.padding(vertical = 5.dp))
        Button(onClick = { navController.navigate(Screen.SignUp.toString()) },
                modifier = Modifier
                    .width(160.dp)
                    .padding(vertical = 8.dp)
                    .align(
                        Alignment.CenterHorizontally))
            {
            Text(text ="Sign Up" , style = MaterialTheme.typography.h5 )
    }
    }
}

}