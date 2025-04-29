package com.dang.nyumbaniapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dang.nyumbaniapp.ui.theme.screens.Login_landlord
import com.dang.nyumbaniapp.ui.theme.screens.landing_page

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
    }
}