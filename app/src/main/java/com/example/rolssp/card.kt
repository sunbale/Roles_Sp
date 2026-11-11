package com.example.rolssp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.rolssp.data.Place
import com.example.rolssp.ui.theme.*

@Composable
fun PlaceCard(place: Place, modifier: Modifier = Modifier, nameSize: Int = 22) {
    Column(
        modifier = modifier
            .aspectRatio(444f / 603f)
            .clip(RoundedCornerShape(percent = 8))
            .background(Pink)
    ) {
        Spacer(Modifier.weight(43f))
        AsyncImage(
            model = place.photoName,
            contentDescription = place.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .weight(458f)
                .fillMaxWidth()
        )
        Box(
            modifier = Modifier
                .weight(102f)
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 4.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = place.name,
                color = Orange,
                fontFamily = Ubuntu,
                fontWeight = FontWeight.Bold,
                fontSize = nameSize.sp,
                maxLines = 2,
                overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis
            )
        }
    }
}
