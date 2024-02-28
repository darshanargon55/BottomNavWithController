package com.example.bottomnavwithcontroller.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    var title :String,var icon:ImageVector,var screen_route:String
){
    object Home : BottomNavItem("Home",Icons.Rounded.Home,"home")
    object MyNetwork : BottomNavItem("My Network",Icons.Rounded.Person,"my_network")
    object AddPost : BottomNavItem("Post",Icons.Filled.Add ,"add_post")
    object Notification : BottomNavItem("Notification",Icons.Rounded.Notifications,"notification")
}
