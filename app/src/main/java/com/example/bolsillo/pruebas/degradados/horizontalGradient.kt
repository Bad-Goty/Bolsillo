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
fun fondoDegradadoHorizontal(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = listOf(Color.Blue, Color.Cyan),
                start = Offset(0f, 0f),

                end = Offset(1000f, 0f) // <- HORIZONTAL
                //end = Offset(1000f, 1000f) // <- DIAGONAL
            ),

        )
    )
}