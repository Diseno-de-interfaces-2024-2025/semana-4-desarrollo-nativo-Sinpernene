package com.example.task4.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Ejercicio 2.2
@Composable
fun MyButtonColor(content: String, color: Color) {
    var state by remember { mutableStateOf(false) }
    Column {
        Button(
            onClick = { state = true },
            colors = ButtonDefaults.buttonColors(
                contentColor = if (state) Color.Black else Color.White,
                containerColor = if (state) color else Color.DarkGray
            ),
            border = BorderStroke(if (state) 3.dp else 1.dp, Color.Black),
            shape = RoundedCornerShape(if (state) 4.dp else 20.dp)
        ){
            Text(text = if (state) content else "Pulsa aquí")
        }
    }
}

@Preview
@Composable
fun ButtonPreview2() {
    MyButtonColor("Ha cambiado el texto!", Color.Cyan)
}