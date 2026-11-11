package com.example.rolssp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rolssp.PlaceCard
import com.example.rolssp.data.PlacesRepo
import com.example.rolssp.ui.theme.*

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(32.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Pink, contentColor = Paper),
        modifier = modifier.fillMaxWidth().height(64.dp)
    ) {
        Text(text, fontFamily = Ubuntu, fontWeight = FontWeight.Bold, fontSize = 24.sp)
    }
}

@Composable
fun HomeScreen(onSpin: () -> Unit) {
    val samples = remember { PlacesRepo.all.take(3) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 36.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("SP", fontFamily = Yellowtail, fontSize = 96.sp, color = Ink)
        Text("Sem custos!", fontFamily = BrunoAce, fontSize = 40.sp, color = Pink)
        Text(
            "Rolês gratuitos em São Paulo",
            fontFamily = Ubuntu, fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Ink
        )

        Spacer(Modifier.height(24.dp))

        Box(Modifier.fillMaxWidth().height(340.dp), contentAlignment = Alignment.TopCenter) {
            PlaceCard(samples[1], Modifier.width(150.dp).align(Alignment.TopStart).offset(x = (-60).dp, y = 40.dp), nameSize = 14)
            PlaceCard(samples[2], Modifier.width(150.dp).align(Alignment.TopEnd).offset(x = 60.dp, y = 40.dp), nameSize = 14)
            PlaceCard(samples[0], Modifier.width(200.dp), nameSize = 18)
        }

        Spacer(Modifier.height(16.dp))
        Text(
            "Sem ideia do que fazer hoje? Toque no botão e deixe o acaso escolher um rolê grátis para você.",
            fontFamily = Ubuntu, fontSize = 18.sp, color = Ink, textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(24.dp))
        PrimaryButton("Sortear rolê", onSpin)
        Spacer(Modifier.height(8.dp))
        Text("Toque para girar o carrossel", fontFamily = Ubuntu, fontSize = 14.sp, color = Ink.copy(alpha = 0.6f))
    }
}
