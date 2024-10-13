package com.example.task4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task4.ui.theme.Task4Theme

class Ejercicio3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Task4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Login(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
//Ejercicio3
@Composable
fun Login(modifier: Modifier) {
    var textToShow by remember { mutableStateOf("") }
    var user by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var color by remember { mutableStateOf(Color.Unspecified)}
    Box(Modifier.fillMaxSize()) {
        Column(Modifier.align(Alignment.Center)) {
            TextField(value = user, onValueChange = { user = it }, label = { Text("Usuario") })
            Spacer(modifier = Modifier.height(40.dp))
            TextField(value = password, onValueChange = { password = it }, label = { Text("Contraseña") })
            Spacer(modifier = Modifier.height(20.dp))
            Text(textToShow, color = color, modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                if (user == "admin" && password == "1234") {
                    textToShow = "Usuario Correcto"
                    color = Color.Green
                } else {
                    textToShow = "Usuario incorrecto"
                    color = Color.Red
                }
            }
            ) {
                Text("Acceder")
            }
        }
    }
}

@Preview
@Composable
fun LoginPreview() {
    Task4Theme {
        Login(modifier = Modifier)
    }
}