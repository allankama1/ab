package com.example.abmotorss.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.R
import com.example.abmotorss.navigation.LOGIN_URL
import com.example.abmotorss.navigation.SIGNUP_URL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Splashscreen(navController: NavHostController) {
Column(modifier = Modifier
    .fillMaxSize()
    .fillMaxWidth()
    .paint(
        painterResource(id = R.drawable.wallll),
        contentScale = ContentScale.FillBounds,
    )
    .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,


){

    val coroutine = rememberCoroutineScope()
    coroutine.launch{ delay(2000)
    navController.navigate(LOGIN_URL)}

    Image(painter = painterResource(id = R.drawable.carr),
        contentDescription = "car",
        modifier = Modifier
            .size(200.dp)
            .clip(shape = CircleShape),
        contentScale = ContentScale.Crop

    )

    Text(text = "Welcome to AB motors.We hope you will find your dream car here as we offer a vast range of vehicles that are new and also modified according to customer needs.",
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 25.sp

    )
}

}

@Composable
@Preview(showBackground = true)
fun SplashscreenPreview(){
    Splashscreen(navController =rememberNavController())
}
