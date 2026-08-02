package com.example.studentmanager.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.studentmanager.model.Student

@Composable
fun StudentCard(
    student: Student,
    onEdit: () -> Unit = {},
    onDelete: () -> Unit = {}
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = student.name,
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text("ID: ${student.id}")
            Text("Grade: ${student.gpa}")
            Text("Attendance: ${student.attendance}%")

            Spacer(modifier = Modifier.height(12.dp))

            Row {

                OutlinedButton(onClick = onEdit) {
                    Icon(Icons.Default.Edit, null)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Edit")
                }

                Spacer(modifier = Modifier.width(8.dp))

                Button(onClick = onDelete) {
                    Icon(Icons.Default.Delete, null)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Delete")
                }

            }

        }

    }

}