package com.example.studentmanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.studentmanager.ui.screens.HomeScreen
import com.example.studentmanager.ui.screens.AddStudentScreen
import com.example.studentmanager.ui.screens.PredictionScreen
import com.example.studentmanager.ui.screens.StudentListScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {

            HomeScreen(

                onStudentListClick = {
                    navController.navigate("students")
                },

                onAddStudentClick = {
                    navController.navigate("add_student")
                },

                onPredictionClick = {
                    navController.navigate("prediction")
                }

            )

        }

        composable("students") {
            StudentListScreen()
        }

        composable("add_student") {
            AddStudentScreen()
        }

        composable("prediction") {
            PredictionScreen()
        }

    }

}