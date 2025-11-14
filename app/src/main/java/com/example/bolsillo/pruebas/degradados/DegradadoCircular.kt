package com.example.bolsillo.pruebas.degradados

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DegradadoCircularBarrido(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.sweepGradient(
                colors = listOf(
                    Color.Blue,
                    Color.Yellow,
                    Color.Cyan,
                    Color.Magenta
                )
            )
        )

    ) {}
}