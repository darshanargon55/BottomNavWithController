package com.example.bottomnavwithcontroller.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavwithcontroller.NotificationScreen
import com.example.bottomnavwithcontroller.activity.AddPostScreen
import com.example.bottomnavwithcontroller.activity.HomeScreen
import com.example.bottomnavwithcontroller.activity.NetworkScreen

@Composable
fun NavigationGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomNavItem.Home.screen_route ){
        composable(BottomNavItem.Home.screen_route){
            HomeScreen()
        }
        composable(BottomNavItem.MyNetwork.screen_route){
            NetworkScreen()
        }
        composable(BottomNavItem.AddPost.screen_route){
            AddPostScreen()
        }
        composable(BottomNavItem.Notification.screen_route){
            NotificationScreen()
        }
    }
}