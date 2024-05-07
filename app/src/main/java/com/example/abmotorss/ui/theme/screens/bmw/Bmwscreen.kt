package com.example.abmotorss.ui.theme.screens.bmw

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.ui.theme.WazitoECommerceTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BmScreen(navController: NavHostController) {


}


@Composable
@Preview(showBackground = true)
fun BmscreenPreview(){
    WazitoECommerceTheme {
        com.example.abmotorss.ui.theme.screens.login.LoginScreen(navController = rememberNavController())
    }
}