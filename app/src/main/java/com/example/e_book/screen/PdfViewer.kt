package com.example.e_book.screen



import android.view.View
import android.widget.ImageButton
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Share
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.example.e_book.R
import com.example.e_book.`class`.BottomNavItem
import com.example.e_book.data.*
import com.github.barteksc.pdfviewer.PDFView

var favorite = listOf<dataProviderToCard>()


var download = listOf<dataProviderToCard>()
var down by mutableStateOf(false)
//var isPressed=Ins

@Composable
fun PdfVieweroffline(navController: NavController, book: dataProviderToCard){
    var fav by remember {
    mutableStateOf(false)
    }
    val color = Color(0xFFFF1100)
    Column( Modifier.padding(vertical = 10.dp)) {
        Row(Modifier.padding(vertical = 6.dp, horizontal = 10.dp)) {
            Image(
                painter = painterResource(id = R.drawable.prev ),
                contentDescription = null,
                Modifier
                    .size(50.dp)
                    .padding(vertical = 8.dp)
                    .clickable(onClick = { navController.navigate(BottomNavItem.Home.screen_route) })
            )
            Text(
                text =book.bookName,
                modifier = Modifier.padding(vertical =8.dp, horizontal = 20.dp),
                style = MaterialTheme.typography.h5
            )

            IconToggleButton(checked = fav, onCheckedChange ={
                if(favorite.contains(book)){
                    favorite= favorite.toMutableList().also { it.remove(book) }
                    fav=!fav
                }
                else{
                    favorite= favorite+book
                    fav=!fav
                }
            } ) {
                
            Icon(tint = color, imageVector=  if(favorite.contains(book)){Icons.Filled.Favorite
            }else{Icons.Default.FavoriteBorder},contentDescription = null ,modifier = Modifier
                .size(35.dp))
            }
            Spacer(modifier = Modifier.padding(horizontal = 5.dp))

            IconToggleButton(checked = down , onCheckedChange ={
                if(download.contains(book)){
                    download= download.toMutableList().also { it.remove(book) }
                    down=!down
                }
                else{
                    download= download+book
                    down=!down
                }} ) {
            Icon(painter = painterResource(id = if(download.contains(book)){R.drawable.done}else{R.drawable.download}),contentDescription = null ,modifier = Modifier.size(35.dp))
            }
        }
     Timepssssoff(book.name)
    }

}

@Composable
fun Timepssssoff(Name:String) {

    AndroidView(factory ={
        View.inflate(it, R.layout.pdfviewer, null)
    }, modifier = Modifier.fillMaxSize()) {
        val pdfview:PDFView = it.findViewById(R.id.pdfView)
        pdfview.fromAsset(Name)
            .enableSwipe(true)
            .swipeHorizontal(false)
            .enableDoubletap(true)
            .defaultPage(0)
            .enableAnnotationRendering(false)
            .password(null)
            .scrollHandle(null)
            .enableAntialiasing(true)
            .spacing(0).load()
    }
}


@Composable
fun PdfViewerofflineFav(navController: NavController, book: dataProviderToCard){
    var fav by remember {
        mutableStateOf(false)
    }
    val color = Color(0xFFFF1100)
    Column( Modifier.padding(vertical = 10.dp)) {
        Row(Modifier.padding(vertical = 6.dp, horizontal = 10.dp)) {
            Image(
                painter = painterResource(id = R.drawable.prev ),
                contentDescription = null,
                Modifier
                    .size(50.dp)
                    .padding(vertical = 8.dp)
                    .clickable(onClick = { navController.navigate(BottomNavItem.Favorite.screen_route) })
            )
            Text(
                text =book.bookName,
                modifier = Modifier.padding(vertical =8.dp, horizontal = 20.dp),
                style = MaterialTheme.typography.h5
            )

            IconToggleButton(checked = fav, onCheckedChange ={
                if(favorite.contains(book)){
                    favorite= favorite.toMutableList().also { it.remove(book) }
                }
                else{
                    favorite= favorite+book
                    fav=!fav
                }
            } ) {

                Icon(tint = color, imageVector=  if(favorite.contains(book)){Icons.Filled.Favorite
                }else{Icons.Default.FavoriteBorder},contentDescription = null ,modifier = Modifier
                    .size(35.dp))
            }
            Spacer(modifier = Modifier.padding(horizontal = 5.dp))

            IconToggleButton(checked = down , onCheckedChange ={
                if(download.contains(book)){
                    download= download.toMutableList().also { it.remove(book) }
                    down=!down
                }
                else{
                    download= download+book
                    down=!down
                }} ) {
                Icon(painter = painterResource(id = if(download.contains(book)){R.drawable.done}else{R.drawable.download}),contentDescription = null ,modifier = Modifier.size(35.dp))
            }
        }
        Timepssssoff(book.name)
    }

}



@Composable
fun PdfViewerofflineDown(navController: NavController, book: dataProviderToCard){
    var fav by remember {
        mutableStateOf(false)
    }
    val color = Color(0xFFFF1100)
    Column( Modifier.padding(vertical = 10.dp)) {
        Row(Modifier.padding(vertical = 6.dp, horizontal = 10.dp)) {
            Image(
                painter = painterResource(id = R.drawable.prev ),
                contentDescription = null,
                Modifier
                    .size(50.dp)
                    .padding(vertical = 8.dp)
                    .clickable(onClick = { navController.navigate(BottomNavItem.Download.screen_route) })
            )
            Text(
                text =book.bookName,
                modifier = Modifier.padding(vertical =8.dp, horizontal = 20.dp),
                style = MaterialTheme.typography.h5

            )

            IconToggleButton(checked = fav, onCheckedChange ={
                if(favorite.contains(book)){
                    favorite= favorite.toMutableList().also { it.remove(book) }
                }
                else{
                    favorite= favorite+book
                    fav=!fav
                }
            } ) {

                Icon(tint = color, imageVector=  if(favorite.contains(book)){Icons.Filled.Favorite
                }else{Icons.Default.FavoriteBorder},contentDescription = null ,modifier = Modifier
                    .size(35.dp))
            }
            Spacer(modifier = Modifier.padding(horizontal = 5.dp))

            IconToggleButton(checked = down , onCheckedChange ={
                if(download.contains(book)){
                    download= download.toMutableList().also { it.remove(book) }
                    down=!down
                }
                else{
                    download= download+book
                    down=!down
                }} ) {
                Icon(painter = painterResource(id = if(download.contains(book)){R.drawable.done}else{R.drawable.download}),contentDescription = null ,modifier = Modifier.size(35.dp))
            }
        }
        Timepssssoff(book.name)
    }

}


 

