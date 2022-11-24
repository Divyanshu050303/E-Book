package com.example.e_book.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.e_book.R
import com.example.e_book.data.dataProviderToCard

import com.google.gson.Gson
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Download(navController:NavController) {
    Scaffold(bottomBar = { com.example.e_book.BottomNavigation(navController = navController) }) {
        Box() {
            Image(painter = painterResource(id = R.drawable.back2),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(height = 1000.dp, width = 400.dp))

            Column() {
            Text(text = "DOWNLOAD", style = MaterialTheme.typography.h4, modifier = Modifier.padding(vertical = 20.dp, horizontal = 10.dp), color = Color.White, fontWeight = FontWeight.Bold)
                if (download.isEmpty()) {
                    Text(text = "You don't have any favorite item yet", modifier = Modifier.padding(horizontal = 40.dp, vertical = 380.dp), color = Color.White)
                } else {
                    fun navigateToDownLoadBookList(bookList: dataProviderToCard) {
                        val downbook = Gson().toJson(bookList)
                        navController.navigate("bookPdfdownList/$downbook")
                    }
                    LazyVerticalGrid(
                        contentPadding = PaddingValues(vertical = 5.dp, horizontal = 8.dp),
                        columns = GridCells.Fixed(2)
                    )
                    {
                        items(items = download) { item ->
                            AlingmentDownloadBook(name = item,
                                Modifier.clickable(onClick = { navigateToDownLoadBookList(item) }))
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun AlingmentDownloadBook(name:dataProviderToCard, modifier: Modifier) {
    Card(modifier
        .padding(vertical = 8.dp, horizontal = 17.dp)
        .height(190.dp)
        .width(30.dp)
        , elevation = 4.dp , backgroundColor = Color.LightGray) {
        Image(painter = rememberAsyncImagePainter(model = name.image), contentDescription ="Image" , contentScale = ContentScale.FillBounds, modifier = Modifier
            .height(150.dp)
            .width(50.dp)
        )
    }
}