package com.example.studentmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.studentmanager.model.Student
import com.example.studentmanager.ui.components.StudentCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentListScreen() {

    var search by remember { mutableStateOf("") }

    val students = listOf(
        Student(1, "Ahmed Ali", 3.5, 90),
        Student(2, "Sara Mohamed", 3.8, 95),
        Student(3, "Omar Hassan", 2.9, 81)
    )

    val filtered = students.filter {
        it.name.contains(search, true)
    }

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text("Students")
                }
            )
        },

        floatingActionButton = {

            FloatingActionButton(
                onClick = {}
            ) {

                Icon(Icons.Default.Add, null)

            }

        }

    ) { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {

            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Search Student") },
                leadingIcon = {
                    Icon(Icons.Default.Search, null)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                items(filtered) {

                    StudentCard(student = it)

                }

            }

        }

    }

}