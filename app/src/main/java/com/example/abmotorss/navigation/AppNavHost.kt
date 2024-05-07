package com.example.abmotorss.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.ui.theme.screens.aboutscreen.AboutScreen
import com.example.abmotorss.ui.theme.screens.bmw.BmScreen
import com.example.abmotorss.ui.theme.screens.ford.FordScreen
import com.example.abmotorss.ui.theme.screens.home.HomeScreen
import com.example.abmotorss.ui.theme.screens.lexus.LexScreen
import com.example.abmotorss.ui.theme.screens.login.LoginScreen
import com.example.abmotorss.ui.theme.screens.merc.MercScreen
import com.example.abmotorss.ui.theme.screens.mitsubishi.MitScreen
import com.example.abmotorss.ui.theme.screens.products.AddProductsScreen
import com.example.abmotorss.ui.theme.screens.products.ViewProductsScreen
import com.example.abmotorss.ui.theme.screens.signup.SignupScreen
import com.example.abmotorss.ui.theme.screens.splash.Splashscreen
import com.example.abmotorss.ui.theme.screens.toyota.ToyScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){

        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }


        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
        composable(SPLASH_URL){
            Splashscreen(navController =navController )
        }

        composable(ABOUT_URL){
            AboutScreen(navController =navController )
        }
        composable(BM_URL){
            BmScreen(navController =navController )
        }
        composable(FORD_URL){
            FordScreen(navController =navController )
        }
        composable(LEX_URL){
            LexScreen(navController =navController )
        }
        composable(MERC_URL){
            MercScreen(navController =navController )
        }
        composable(MIT_URL){
            MitScreen(navController =navController )
        }
        composable(TOY_URL){
            ToyScreen(navController =navController )
        }


    }
}