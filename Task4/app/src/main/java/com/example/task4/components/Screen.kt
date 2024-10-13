package com.example.task4.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen(modifier: Modifier) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var dir by remember { mutableStateOf("") }
    var country by remember { mutableStateOf("") }
    var buttonName by remember { mutableStateOf("") }
    var buttonEmail by remember { mutableStateOf("") }
    var buttonDir by remember { mutableStateOf("") }
    var buttonCountry by remember { mutableStateOf("") }
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier.fillMaxWidth().weight(0.15f).background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Text("Screen", color = Color.White, textAlign = TextAlign.Center, fontSize = 30.sp)
        }
        Column(Modifier.fillMaxWidth().background(Color.LightGray))
        {
            Spacer(Modifier.height(10.dp))
            Row(Modifier.horizontalScroll(rememberScrollState())) {
                repeat(10) {
                    Box(
                        Modifier.width(60.dp).height(60.dp)
                            .background(Color.Gray, shape = RoundedCornerShape(90))
                    )
                    Spacer(Modifier.width(20.dp))
                }
            }
            Spacer(Modifier.height(10.dp))
        }
        Column(Modifier.fillMaxWidth().weight(1f).background(Color.White)) {
            Row (Modifier.fillMaxSize().weight(0.5f).background(Color.White)){
                Box(Modifier.padding(20.dp).fillMaxSize().weight(1f).background(Color.Cyan, shape = RoundedCornerShape(5)))
                Box(Modifier.fillMaxSize().weight(1f).background(Color.White).verticalScroll(rememberScrollState())) {
                    Text(lorem, Modifier.padding(15.dp))
                }
            }
            Box(Modifier.fillMaxSize().weight(1f).background(Color.White)) {
                Column {
                    Spacer(Modifier.height(10.dp))
                    Text("Formulario", fontSize = 30.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    Spacer(Modifier.height(10.dp))
                    Row {
                        TextField(value = name, onValueChange = { name = it }, label = { Text("Nombre") }, modifier = Modifier.weight(1f))
                        Text(buttonName, textAlign = TextAlign.Center, modifier = Modifier.weight(1f).align(Alignment.CenterVertically))
                    }
                    Spacer(Modifier.height(10.dp))
                    Row {
                        TextField(value = email, onValueChange = { email = it }, label = { Text("Email") }, modifier = Modifier.weight(1f))
                        Text(buttonEmail, textAlign = TextAlign.Center, modifier = Modifier.weight(1f).align(Alignment.CenterVertically))
                    }
                    Spacer(Modifier.height(10.dp))
                    Row {
                        TextField(value = dir, onValueChange = { dir = it }, label = { Text("Dirección") }, modifier = Modifier.weight(1f))
                        Text(buttonDir, textAlign = TextAlign.Center, modifier = Modifier.weight(1f).align(Alignment.CenterVertically))
                    }
                    Spacer(Modifier.height(10.dp))
                    Row {
                        TextField(value = country, onValueChange = { country = it }, label = { Text("País") }, modifier = Modifier.weight(1f))
                        Text(buttonCountry, textAlign = TextAlign.Center, modifier = Modifier.weight(1f).align(Alignment.CenterVertically))
                    }
                    Spacer(Modifier.height(10.dp))
                    Button(
                        onClick = {
                            buttonName = name
                            buttonEmail = email
                            buttonDir = dir
                            buttonCountry = country
                        },
                        modifier = Modifier.align(Alignment.CenterHorizontally)

                    ) { Text("Actualizar") }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewScreen() {
    Screen(Modifier)
}

const val lorem = "Lorem ipsum odor amet, consectetuer adipiscing elit. Eleifend proin faucibus pretium cubilia in sapien ut at? Vitae etiam dignissim lobortis curabitur morbi consectetur; pretium facilisis placerat. Sodales tellus condimentum cras morbi diam amet? Varius maecenas parturient lacus eros feugiat nulla per eros. Purus vivamus ullamcorper lobortis sit enim suspendisse. Ultrices fames nunc ipsum class inceptos velit pretium habitant.\n" +
        "\n" +
        "Malesuada egestas imperdiet; quis nisl nam purus ac. Malesuada sed conubia pellentesque praesent curae sed. Feugiat sem malesuada parturient cursus gravida. Torquent aenean erat at est dolor finibus mi non. Urna ut non; id fringilla accumsan dolor. Habitasse imperdiet maximus; suscipit congue imperdiet adipiscing lacinia feugiat. Quis morbi suscipit ipsum ex nostra. Magna feugiat platea fusce nec justo nibh. Mi aptent netus mauris nibh congue a sem.\n" +
        "\n" +
        "Sem taciti cubilia nulla porttitor venenatis cubilia scelerisque maximus pellentesque. Sociosqu maecenas eleifend neque placerat parturient class porta maximus. Mauris platea natoque hac, taciti enim finibus. Montes sem lobortis consectetur vitae ornare; ridiculus erat lobortis. Porta himenaeos tempor morbi tristique nam luctus mi euismod aptent. Lacinia molestie vel praesent mus; et pulvinar ipsum. Himenaeos himenaeos sit est nulla mi.\n" +
        "\n" +
        "Volutpat cras fermentum interdum, duis vestibulum eu nisl urna. Dictumst eros sem in euismod urna nulla. Dictumst dolor vel morbi aliquam imperdiet sit, quisque vulputate dignissim! Rutrum suspendisse cursus blandit; ad vivamus condimentum aptent. Nam viverra sodales molestie sapien lobortis aenean libero platea. Sem magna maximus leo lacus convallis etiam turpis dictum. Habitasse conubia bibendum a luctus cursus commodo accumsan. Lacus viverra proin laoreet ex; vel ex.\n" +
        "\n" +
        "Taciti auctor litora ut nisi felis dis nullam pretium neque. At fermentum magna mattis ornare urna vestibulum dictumst. Velit vulputate nam nec odio adipiscing et. Fusce nam posuere aptent amet nisl eget velit. Vehicula vel non quam at accumsan egestas condimentum. Dui lobortis id diam potenti pulvinar vel tristique scelerisque. Mattis commodo tristique velit accumsan feugiat."