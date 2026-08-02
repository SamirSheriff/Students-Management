package com.example.studentmanager.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddStudentScreen() {

    var name by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }
    var gpa by remember { mutableStateOf("") }
    var attendance by remember { mutableStateOf("") }

    Scaffold(

        topBar = {

            TopAppBar(
                title = {
                    Text("Add Student")
                }
            )

        }

    ) { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),

            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Student Name") }
            )

            OutlinedTextField(
                value = id,
                onValueChange = { id = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Student ID") }
            )

            OutlinedTextField(
                value = gpa,
                onValueChange = { gpa = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("GPA") }
            )

            OutlinedTextField(
                value = attendance,
                onValueChange = { attendance = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Attendance %") }
            )

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {

                    println(name)
                    println(id)

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
            ) {

                Text("Save Student")

            }

        }

    }

}