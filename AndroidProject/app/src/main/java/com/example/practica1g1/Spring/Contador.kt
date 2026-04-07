package com.example.practica1g1.Spring

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun Contador(modifier: Modifier = Modifier) {

    var contador by remember { mutableStateOf(0) }
    var flag by remember { mutableStateOf(false) }


    LaunchedEffect(flag) {
        while (flag){
            contador ++
            delay(1000)
        }
    }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Contador: $contador",
            style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly
            verticalAligment = Aligment.CenterVerticaly
        ) { }
        Button(onClick = { flag = true }) {
            Text("Incrementar")
        }

        Button(onClick = { flag = false }) {
            Text("Detener")
        }
    }
}