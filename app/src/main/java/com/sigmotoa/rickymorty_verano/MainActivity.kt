package com.sigmotoa.rickymorty_verano

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sigmotoa.rickymorty_verano.ui.JGCard
import com.sigmotoa.rickymorty_verano.ui.SCard
import com.sigmotoa.rickymorty_verano.ui.theme.RickYMorty_VeranoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            RickYMorty_VeranoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   // SBox("Hola desde una funcion")
                    //SBox("hola otra vez")
                    //SBox("Hola, me estoy robando la pantalla")
                    //SColumn()
                    Greeting(
                       name = "",
                        modifier = Modifier.padding(innerPadding)
                    )
                    LazyColumn {
                        item { SCard() }
                        item { Spacer(modifier = Modifier.height(48.dp)) }
                        item { SCard() }
                        item { SBox("Sigmotoa") }
                        item { SCard() }
                        item { SCard() }
                        item { SCard() }
                        item { SCard() }
                        item { SCard() }
                        item { JGCard() }
                    }

                    //SCard()


                }
            }
        }
    }
}

@Composable
fun SBox(texto:String) {
    Box (modifier = Modifier
        .fillMaxWidth()
        .background(Color.Yellow)){
        Text(text = texto)
       // Text(text="Estoy en un Box")
    }
}

@Composable
fun SColumn(modifier: Modifier = Modifier) {
    Column (modifier = Modifier.fillMaxSize()){
        Text(text = "Holas, estoy en una columna")
        Text(text = "Holas, estoy debajo" , fontSize = 24.sp)
        SBox("Estoy en una columna pero soy un box")
        Text(text = "Estoy debajo de un box")
        SBox("Estoy en una columna pero soy un box")


    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewSigmotoa() {
    RickYMorty_VeranoTheme {
        Greeting("sigmotoa")
    }
}

@Preview(
    device = "id:wearos_square", showSystemUi = true, showBackground = true,
    backgroundColor = 0xFF4E3CE2,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_WATCH,

)
@Composable
fun PreviewKarol() {
    Greeting(name = "Karol Vane")
}

@Preview(
    device = "id:wearos_large_round", showSystemUi = true, showBackground = true,
    backgroundColor = 0xFF4E3CE2,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_WATCH,

)
@Composable
fun PreviewJesus() {
    Greeting(name = "JesusG")
}