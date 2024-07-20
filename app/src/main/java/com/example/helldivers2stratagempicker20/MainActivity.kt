package com.example.helldivers2stratagempicker20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNavigation()
        }
    }
}

@Composable
fun MyNavigation(){
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = HomeScreen.route){
        composable(HomeScreen.route){
            HomeScreen(navController = navController,
                stratTypes = listOf(stratType.ORBITAL.name,
                    stratType.EAGLE.name,
                    stratType.WEAPON.name,
                    stratType.OTHER.name))
        }
        composable(StratTypesScreen.route){
            StratTypesScreen()
        }
    }
}

