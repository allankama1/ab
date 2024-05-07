package com.example.abmotorss.ui.theme.screens.lexus

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.abmotorss.R
import com.example.abmotorss.ui.theme.WazitoECommerceTheme
import com.example.abmotorss.ui.theme.screens.login.LoginScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LexScreen(navController: NavHostController) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Text(text = "Tickets",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        //Row1
        Row (modifier = Modifier.padding(start = 20.dp)){
            //Column1

            Column {
                Card(modifier = Modifier
                    .height(100.dp)
                    .width(160.dp)) {
                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.caar),
                            contentDescription = "Las Vegas",
                            modifier= Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds)
                        Icon(imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "favourite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Colosseum",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "443 reviews",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "From Ksh.385000",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Red
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row{
                    val mContext = LocalContext.current

                    OutlinedButton(onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0757355014".toUri()
                        mContext.startActivity(callIntent)
                    }) {
                        Text(text = "Call")
                    }
                    //Email
                    OutlinedButton(onClick = {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for tour visit")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "This is kamau requesting for a tour")
                        mContext.startActivity(shareIntent)
                    }) {
                        Text(text = "Email")
                    }
                }
            }


            //End of Column1
            Spacer(modifier = Modifier.width(10.dp))

            //Column1

            Column {
                Card(modifier = Modifier
                    .height(100.dp)
                    .width(160.dp)) {
                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.caar),
                            contentDescription = "Las Vegas",
                            modifier= Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds)
                        Icon(imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "favourite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Colosseum",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                    Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "443 reviews",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "From Ksh.385000",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Red
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row{
                    val mContext = LocalContext.current
                    OutlinedButton(onClick = {


                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0757355014".toUri()
                        mContext.startActivity(callIntent)
                    }) {
                        Text(text = "Call")
                    }
                    //Email
                    OutlinedButton(onClick = {


                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for tour visit")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "This is kamau requesting for a tour")
                        mContext.startActivity(shareIntent)
                    }) {
                        Text(text = "Email")
                    }
                }
            }


            //End of Column1
        }
    }

    Spacer(modifier = Modifier.height(10.dp))

    //2nd row
    Row (modifier = Modifier.padding(start = 20.dp)){
        //Column1

        Column {
            Card(modifier = Modifier
                .height(100.dp)
                .width(160.dp)) {
                Box(modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.caar),
                        contentDescription = "Las Vegas",
                        modifier= Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds)
                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "favourite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(5.dp))

            Text(text = "Colosseum",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(5.dp))


            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "443 reviews",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "From Ksh.385000",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Red
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row{
                val mContext = LocalContext.current

                OutlinedButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0757355014".toUri()
                    mContext.startActivity(callIntent)
                }) {
                    Text(text = "Call")
                }
                //Email
                OutlinedButton(onClick = {

                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for tour visit")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "This is kamau requesting for a tour")
                    mContext.startActivity(shareIntent)
                }) {
                    Text(text = "Email")
                }
            }
        }


        //End of Column1
        Spacer(modifier = Modifier.width(10.dp))

        //Column1

        Column {
            Card(modifier = Modifier
                .height(100.dp)
                .width(160.dp)) {
                Box(modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.carr),
                        contentDescription = "Las Vegas",
                        modifier= Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds)
                    Icon(imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "favourite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(5.dp))

            Text(text = "Colosseum",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
                Icon(imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Red)
            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "443 reviews",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "From Ksh.385000",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Red
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row{
                val mContext = LocalContext.current

                OutlinedButton(onClick = {

                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0757355014".toUri()
                    mContext.startActivity(callIntent)
                }) {

                    Text(text = "Call")
                }
                //Email
                OutlinedButton(onClick = {

                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("info.ac.ke"))
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for tour visit")
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "This is kamau requesting for a tour")
                    mContext.startActivity(shareIntent)
                }) {
                    Text(text = "Email")
                }
            }
        }


        //End of Column1
    }
}
//End of Row2








@Composable
@Preview(showBackground = true)
fun LexscreenPreview(){
    WazitoECommerceTheme {
        LoginScreen(navController = rememberNavController())
    }
}