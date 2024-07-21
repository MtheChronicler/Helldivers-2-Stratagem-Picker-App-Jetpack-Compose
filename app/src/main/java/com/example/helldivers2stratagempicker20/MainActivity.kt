package com.example.helldivers2stratagempicker20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun MyNavigation() {
    var selectedType1 by remember { mutableStateOf(value = stratType.ORBITAL.name) }
    var selectedType2 by remember { mutableStateOf(value = stratType.EAGLE.name) }
    var selectedType3 by remember { mutableStateOf(value = stratType.WEAPON.name) }
    var selectedType4 by remember { mutableStateOf(value = stratType.OTHER.name) }
    val selectTypes: (Int, String) -> Unit = { i, s ->
        when (i) {
            1 -> selectedType1 = s
            2 -> selectedType2 = s
            3 -> selectedType3 = s
            4 -> selectedType4 = s
        }
    }
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = HomeScreen.route) {
        composable(HomeScreen.route) {
            HomeScreen(
                navController = navController,
                stratTypes = listOf(selectedType1, selectedType2, selectedType3, selectedType4)
            )
        }
        composable(StratTypesScreen.route) {
            StratTypesScreen(
                listOf(selectedType1, selectedType2, selectedType3, selectedType4),
                selectTypes
            )
        }
    }
}

