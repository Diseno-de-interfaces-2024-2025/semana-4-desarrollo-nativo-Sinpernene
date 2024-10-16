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
    var buttonContent by remember { mutableStateOf("Pulsa aquí!") }
    var containerColor by remember { mutableStateOf(Color.DarkGray) }
    var contentColor by remember { mutableStateOf(Color.White) }
    var borderStroke by remember { mutableStateOf(1.dp) }
    var roundedCornerShapeSize by remember { mutableStateOf(20.dp) }
    Column {
        Button(
            onClick = { buttonContent = content
                      containerColor = color
                      contentColor = Color.Black
                      borderStroke = 3.dp
                      roundedCornerShapeSize = 4.dp},
            colors = ButtonDefaults.buttonColors(
                contentColor = contentColor,
                containerColor = containerColor
            ),
            border = BorderStroke(borderStroke, Color.Black),
            shape = RoundedCornerShape(roundedCornerShapeSize)
        ){
            Text(buttonContent)
        }
    }
}

@Preview
@Composable
fun ButtonPreview2() {
    MyButtonColor("Ha cambiado el texto!", Color.Cyan)
}