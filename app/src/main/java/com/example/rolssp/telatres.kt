package com.example.rolssp.ui



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rolssp.PlaceCard
import com.example.rolssp.data.Place
import com.example.rolssp.ui.theme.*

@Composable
fun ResultScreen(place: Place, onSpinAgain: () -> Unit, onHome: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().systemBarsPadding().padding(horizontal = 36.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(24.dp))
        Text("Seu rolê é…", fontFamily = BrunoAce, fontSize = 32.sp, color = Pink)
        Spacer(Modifier.height(16.dp))

        PlaceCard(place, Modifier.fillMaxWidth(0.85f), nameSize = 20)

        Spacer(Modifier.weight(1f))
        PrimaryButton("Sortear de novo", onSpinAgain)
        Spacer(Modifier.height(12.dp))
        OutlinedButton(
            onClick = onHome,
            shape = RoundedCornerShape(32.dp),
            border = BorderStroke(3.dp, Pink),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Pink),
            modifier = Modifier.fillMaxWidth().height(64.dp)
        ) {
            Text("Voltar ao início", fontFamily = Ubuntu, fontWeight = FontWeight.Bold, fontSize = 22.sp)
        }
        Spacer(Modifier.height(32.dp))
    }
}