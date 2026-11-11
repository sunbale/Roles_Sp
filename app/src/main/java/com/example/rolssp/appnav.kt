package com.example.rolssp.ui


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.rolssp.data.PlacesRepo

@Composable
fun AppNav() {
    val nav = rememberNavController()

    NavHost(navController = nav, startDestination = "home") {

        composable("home") {
            HomeScreen(onSpin = { nav.navigate("carousel") })
        }

        composable("carousel") {
            CarouselScreen(onFinished = { index ->
                // popUpTo remove o carrossel do histórico: "voltar" não reinicia o giro
                nav.navigate("result/$index") {
                    popUpTo("carousel") { inclusive = true }
                }
            })
        }

        composable(
            route = "result/{index}",
            arguments = listOf(navArgument("index") { type = NavType.IntType })
        ) { entry ->
            val index = entry.arguments!!.getInt("index")
            ResultScreen(
                place = PlacesRepo.all[index],
                onSpinAgain = { nav.navigate("carousel") { popUpTo("home") } },
                onHome = { nav.popBackStack("home", inclusive = false) }
            )
        }
    }
}