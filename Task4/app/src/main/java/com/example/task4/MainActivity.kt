package com.example.task4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task4.ui.theme.Task4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val intent = Intent(this, Ejercicio3::class.java)
        setContent {
            Task4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column {
                        MyText(
                            text = "Hello Android!",
                            fontSize = 50.sp,
                            color = Color.Red,
                            padding = innerPadding
                        )

                        Button(
                            modifier = Modifier.padding(innerPadding),
                            onClick = {
                                startActivity(intent)
                            },
                        ) {
                            Text("Ejercicio 3")
                        }
                    }
                }
            }
        }
    }
}

//Ejercicio 1
@Composable
fun MyText(text: String, fontSize: TextUnit, color: Color, padding: PaddingValues) {
    Text(
        text = text,
        modifier = Modifier.padding(padding),
        style = TextStyle(
            fontSize = fontSize,
            color = color
        )
    )
}

@Preview
@Composable
fun TextPreview(){
    MyText("Desarrollo de interfaces!", 50.sp, Color.Red, PaddingValues(0.dp))
}