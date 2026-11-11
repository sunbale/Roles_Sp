package com.example.rolssp.ui

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import com.example.rolssp.PlaceCard
import com.example.rolssp.data.PlacesRepo
import com.example.rolssp.ui.theme.*
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue
import kotlin.random.Random

@Composable
fun CarouselScreen(onFinished: (Int) -> Unit) {
    val places = PlacesRepo.all
    val size = places.size

    // Usamos um número razoável de páginas para evitar estresse de memória no PagerState
    val pageCount = size * 100
    val startPage = remember { (pageCount / 2) - ((pageCount / 2) % size) }
    val pagerState = rememberPagerState(initialPage = startPage) { pageCount }

    LaunchedEffect(Unit) {
        val winner = Random.nextInt(size)
        val current = pagerState.currentPage
        val delta = (winner - (current % size) + size) % size
        val target = current + size * 1 + delta // 1 volta completa + offset do sorteado

        pagerState.animateScrollToPage(
            page = target,
            animationSpec = tween(durationMillis = 3000, easing = FastOutSlowInEasing)
        )
        delay(600)
        onFinished(winner)
    }

    Column(
        modifier = Modifier.fillMaxSize().systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(24.dp))
        Text("Sorteando…", fontFamily = BrunoAce, fontSize = 32.sp, color = Pink)
        Text("O carrossel está girando", fontFamily = Ubuntu, fontSize = 18.sp, color = Ink)

        Spacer(Modifier.weight(1f))

        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false,
            contentPadding = PaddingValues(horizontal = 64.dp),
            pageSpacing = 16.dp,
            modifier = Modifier.fillMaxWidth()
        ) { page ->
            val offset = ((pagerState.currentPage - page) + pagerState.currentPageOffsetFraction).absoluteValue
            val scale = lerp(0.85f, 1f, 1f - offset.coerceIn(0f, 1f))

            PlaceCard(
                place = places[page % size],
                modifier = Modifier
                    .fillMaxWidth()
                    .graphicsLayer { scaleX = scale; scaleY = scale }
            )
        }

        Spacer(Modifier.weight(1f))
        Text(
            "Aguarde, estamos escolhendo um rolê para você",
            fontFamily = Ubuntu, fontSize = 14.sp, color = Ink.copy(alpha = 0.6f),
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(32.dp))
    }
}
