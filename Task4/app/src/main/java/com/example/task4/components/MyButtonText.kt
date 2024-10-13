package com.example.task4.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

//Ejercicio 2.1
@Composable
fun MyButtonText(){
    var state by remember { mutableStateOf(false) }
    val buttonContentOnline = "Pulsa aquí"
    val buttonContentOffline = "Botón pulsado!"
    Column()
    {
        Button(
            onClick = { state = true }
        ) {
            Text(text = if (state) buttonContentOffline else buttonContentOnline)
        }
    }
}

@Preview
@Composable
fun ButtonPreview(){
    MyButtonText()
}