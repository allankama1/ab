package com.example.abmotorss.ui.theme.screens.home


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint

import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.R
import com.example.abmotorss.navigation.BM_URL
import com.example.abmotorss.navigation.FORD_URL
import com.example.abmotorss.navigation.MERC_URL

import com.example.abmotorss.navigation.SPLASH_URL
import com.example.abmotorss.navigation.TOY_URL
import com.example.abmotorss.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    Column(modifier = Modifier
        .paint(
            painterResource(id = R.drawable.wa1),
            contentScale = ContentScale.FillBounds,
        )
        .fillMaxSize()
        .verticalScroll(rememberScrollState()
        )

    ){
        TopAppBar(
            title = {
                Text(
                    text = "AB motors",
                    color = Color.White
                )

            },

        )//End of Top App bar

        Spacer(modifier = Modifier.height(20.dp))

        Row( modifier = Modifier.padding(start = 20.dp)) {
            Column {
                Text(
                    text = "AB motors",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(20,100,255)
                )
                Text(text = "Keep the motion")
            }
            Spacer(modifier = Modifier.width(100.dp))

            Image(
                painter = painterResource(id = R.drawable.caar),
                contentDescription ="amazon",
                modifier = Modifier.size(100.dp))
        }//End Row
        Spacer(modifier = Modifier.height(20.dp))


        //cards columns start
        Column(modifier = Modifier.padding(start = 20.dp)) {
            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .clickable {
                        navController.navigate(TOY_URL )
                        Toast.makeText(mContext,"Go to Toyota screen",
                            Toast.LENGTH_SHORT).show()

                    }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.toyota),
                            contentDescription = "amazon",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Toyota",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card


                Card (modifier = Modifier.
                clickable {
                    navController.navigate(MERC_URL )
                    Toast.makeText(mContext,"Go to Mercedes screen",
                        Toast.LENGTH_SHORT).show()

                }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.merc),
                            contentDescription = "Mercedes",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Mercedes",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 1
            Spacer(modifier = Modifier.height(25.dp))

            //Row 2
            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)
                    .
                    clickable {
                        navController.navigate(MERC_URL )
                        Toast.makeText(mContext,"Go to BMW screen",
                            Toast.LENGTH_SHORT).show()

                    }
                )

                {



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bmw),
                            contentDescription = "BMW",
                            modifier = Modifier.size(20.dp)
                        )
                        Text(
                            text = "BMW",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)
                    .clickable {
                        navController.navigate(MERC_URL )
                        Toast.makeText(mContext,"Go to Mitsubishi screen",
                            Toast.LENGTH_SHORT).show()

                    }){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.mitsubishi),
                            contentDescription = "Mitsubishi",
                            modifier = Modifier.size(250.dp)
                        )
                        Text(
                            text = "Mitsubishi",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 2
            Spacer(modifier = Modifier.height(25.dp))

            //Row 3
            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)
                    .clickable {
                        navController.navigate(MERC_URL )
                        Toast.makeText(mContext,"Go to Lexus screen",
                            Toast.LENGTH_SHORT).show()

                    }){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lexus),
                            contentDescription = "Lexus",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Lexus",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)
                    .clickable {
                        navController.navigate(FORD_URL )
                        Toast.makeText(mContext,"Go to Ford screen",
                            Toast.LENGTH_SHORT).show()

                    }){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ford),
                            contentDescription = "Ford",
                            modifier = Modifier.size(200.dp)
                        )
                        Text(
                            text = "Ford",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 3

        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}