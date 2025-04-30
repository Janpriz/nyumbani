package com.dang.nyumbaniapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dang.nyumbaniapp.ui.theme.screens.landlord.Login_landlord
import com.dang.nyumbaniapp.ui.theme.screens.landing_page
import com.dang.nyumbaniapp.ui.theme.screens.landlord.Registration_landlord

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_LANDING) {
    NavHost(navController= navController,
        modifier=Modifier,
        startDestination=startDestination){
        composable(ROUTE_LANDING) {
            landing_page(navController)
        }
        composable (ROUTE_LANDLORD){
            Login_landlord(navController)
        }
        composable (ROUTE_LANDLORD_LOGIN){
            Login_landlord(navController)
        }
        composable (ROUTE_LANDLORD_REGISTER){
            Registration_landlord(navController)
        }
    }
}