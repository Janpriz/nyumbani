package com.dang.nyumbaniapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dang.nyumbaniapp.navigation.ROUTE_CUSTOMER
import com.dang.nyumbaniapp.navigation.ROUTE_LANDLORD


@Composable
fun landing_page(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top)


    {
        Spacer( modifier = Modifier.height(50.dp))
        Text("Welcome to nyumbani",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic
        )
        Text("Affordable houses",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )
//        Image(painter = painterResource(id =),
//            contentDescription = "t",modifier=Modifier
//                .height(200.dp)
//                .fillMaxWidth()
//        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(ROUTE_LANDLORD)},
            modifier = Modifier.width(200.dp)) {
            Text(text = "Landlord",
                fontSize = 30.sp,
            )

        }
        Spacer(modifier=Modifier.height(20.dp))
        Button(onClick = { navController.navigate(ROUTE_CUSTOMER)   },
            modifier=Modifier.width(200.dp)) {
            Text(text = "Customer",
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp,

                )
        }






    }

}




@Preview
@Composable
private fun homepreview() {
    landing_page( rememberNavController() )}


