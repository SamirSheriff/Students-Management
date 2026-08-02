package com.example.studentmanager.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PredictionScreen() {

    var gpa by remember { mutableStateOf("") }
    var attendance by remember { mutableStateOf("") }
    var assignment by remember { mutableStateOf("") }
    var midterm by remember { mutableStateOf("") }
    var finalExam by remember { mutableStateOf("") }

    var prediction by remember { mutableStateOf("") }
    var confidence by remember { mutableStateOf("") }

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text("AI Prediction")
                }
            )
        }

    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Text(
                text = "Enter Student Information",
                style = MaterialTheme.typography.headlineSmall
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
                label = { Text("Attendance (%)") }
            )

            OutlinedTextField(
                value = assignment,
                onValueChange = { assignment = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Assignment Score") }
            )

            OutlinedTextField(
                value = midterm,
                onValueChange = { midterm = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Midterm Score") }
            )

            OutlinedTextField(
                value = finalExam,
                onValueChange = { finalExam = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("Final Exam Score") }
            )

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = {

                    // Temporary prediction logic
                    val average =
                        listOf(
                            assignment.toDoubleOrNull() ?: 0.0,
                            midterm.toDoubleOrNull() ?: 0.0,
                            finalExam.toDoubleOrNull() ?: 0.0
                        ).average()

                    prediction = when {
                        average >= 85 -> "Excellent"
                        average >= 70 -> "Good"
                        average >= 50 -> "Average"
                        else -> "Needs Improvement"
                    }

                    confidence = "96%"
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Predict")
            }

            if (prediction.isNotEmpty()) {

                Spacer(modifier = Modifier.height(16.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Text(
                            text = "Prediction Result",
                            style = MaterialTheme.typography.titleLarge
                        )

                        Text(
                            text = "Prediction: $prediction",
                            style = MaterialTheme.typography.bodyLarge
                        )

                        Text(
                            text = "Confidence: $confidence",
                            style = MaterialTheme.typography.bodyLarge
                        )

                    }

                }

            }

        }

    }

}