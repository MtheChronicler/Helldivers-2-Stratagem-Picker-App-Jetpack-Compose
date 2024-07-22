package com.example.helldivers2stratagempicker20

interface Destinations{
    val route: String
}

object HomeScreen: Destinations{
    override val route = "HomeScreen"
}

object StratTypesScreen: Destinations{
    override val route = "StratTypesScreen"
}

object StratListScreen: Destinations{
    override val route = "StratListScreen"
}