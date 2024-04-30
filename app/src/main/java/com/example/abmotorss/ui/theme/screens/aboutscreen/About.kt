package com.example.abmotorss.ui.theme.screens.aboutscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.abmotorss.R

@Composable
fun AboutScreen(navController: NavHostController){
Column( modifier = Modifier
    .paint(
        painterResource(id = R.drawable.caar),
        contentScale = ContentScale.FillBounds,
    )
    .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,) {

}
Text(text = "")
}
@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){


}