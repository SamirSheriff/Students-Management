package com.example.studentmanager.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.studentmanager.ui.components.FeatureCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onStudentListClick: () -> Unit,
    onAddStudentClick: () -> Unit,
    onPredictionClick: () -> Unit
) {

    Scaffold(

        topBar = {

            TopAppBar(
                title = {
                    Text("Student AI Manager")
                }
            )

        },

        bottomBar = {

            NavigationBar {

                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Default.Home, null)
                    },
                    label = {
                        Text("Home")
                    }
                )

            }

        }

    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(20.dp),

            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Text(
                text = "Welcome!",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "Choose one of the following options.",
                style = MaterialTheme.typography.bodyLarge
            )

            FeatureCard(
                title = "Student List",
                description = "View, update and delete students.",
                icon = Icons.Default.Home,
                onClick = onStudentListClick
            )

            FeatureCard(
                title = "Add Student",
                description = "Create a new student record.",
                icon = Icons.Default.PersonAdd,
                onClick = onAddStudentClick
            )

            FeatureCard(
                title = "AI Prediction",
                description = "Predict academic performance.",
                icon = Icons.Default.Psychology,
                onClick = onPredictionClick
            )

        }

    }

}

