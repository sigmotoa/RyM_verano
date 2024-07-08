package com.sigmotoa.rickymorty_verano.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sigmotoa.rickymorty_verano.R

/**
 *
 * Created by sigmotoa on 8/07/24.
 * @author sigmotoa
 *
 * www.sigmotoa.com
 */

@Composable
fun SCard(modifier: Modifier = Modifier) {
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = Color.Magenta),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier
            .width(200.dp)
            .height(240.dp)
    ) {
        Text(
            "Soy sigmotoa en una card",
            fontStyle = FontStyle.Italic,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Image(painterResource(R.drawable.parky_001), contentDescription = "Mi amigo")
        Text("Soy el otro texto", textAlign = TextAlign.Center)
    }
}

@Composable
fun JGCard(modifier: Modifier = Modifier) {
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = Color.Blue),
        modifier = Modifier
            .width(200.dp)
            .height(240.dp)
    ) {
        Text(
            "Millonarios FC",
            fontStyle = FontStyle.Italic,
            fontSize = 19.sp,
            textAlign = TextAlign.Center
        )
        Image(painterResource(R.drawable.escudomillos), contentDescription = "MillonariosFC")
        Text("El más grande.", textAlign = TextAlign.Center)
    }
}


@Preview(showSystemUi = true, showBackground = true, backgroundColor = 0xFFF3EBEB)
@Composable
fun PrevCard(modifier: Modifier = Modifier) {
    JGCard()
}
