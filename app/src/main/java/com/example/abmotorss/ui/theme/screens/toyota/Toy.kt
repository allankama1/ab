package com.example.abmotorss.ui.theme.screens.toyota

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.ui.theme.WazitoECommerceTheme
import com.example.abmotorss.ui.theme.screens.login.LoginScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToyScreen(navController: NavHostController) {

}


@Composable
@Preview(showBackground = true)
fun ToyscreenPreview(){
    WazitoECommerceTheme {
        LoginScreen(navController = rememberNavController())
    }
}