package com.example.bolsillo.pruebas.degradados

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DegradadoRadial() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.radialGradient(
                colors = listOf(Color.White, Color(0xFF7D00F5)),
                center = Offset.Unspecified,
                radius = 600f
            )
        )
    ) {

    }
}