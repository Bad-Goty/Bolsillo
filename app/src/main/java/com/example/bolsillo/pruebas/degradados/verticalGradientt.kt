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
fun fondoDegradadoVertical() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(


               /*
               brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF7D00F5), // Morado
                        Color(0xFFEBD9FF)  // Blanco lavanda
                    )
                )

                */

                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF7D00F5), Color(0xFFEBD9FF), Color.White),
                    startY = 10f,
                    endY = 0f
                )




            )
    )
}