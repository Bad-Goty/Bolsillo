package com.example.bolsillo.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ViewTodo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
        ) {

        Text(
            "Bienvenido",
            color = Color(0xFF7D00F5),
            style = TextStyle(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFB16FFD), Color(0xFF7D00F5))
                )
            ),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 32.sp
        )

        Spacer(Modifier.height(16.dp))

        Text(
            "Resumen del Mes",
            color = Color(0xFF7D00F5),
            fontSize = 16.sp
        )

        Spacer(Modifier.height(4.dp))

        GraficaMes()
    }
}

@Composable
fun GraficaMes(modifier: Modifier = Modifier) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .border(
            BorderStroke(
                width = 2.dp,
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFFA751FC), Color(0xFF7D00F5)),
                    start = Offset(0f, 0f),

                    //end = Offset(1000f, 0f) // <- HORIZONTAL
                    end = Offset(1000f, 1000f) // <- DIAGONAL
                ),
            ),
            shape = RoundedCornerShape(8.dp)
        )
        .clip(shape = RoundedCornerShape(8.dp))


    ) {

        Column(modifier = Modifier
            .weight(1f)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Ingresos",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF7D00F5),
                modifier = Modifier

                    .fillMaxWidth()
                    .drawBehind {
                        val strokeWidth = 2.dp.toPx()
                        val y = size.height - strokeWidth / 2

                        drawLine(
                            color = Color(0xFF7D00F5),
                            start = Offset(0f, y),
                            end = Offset(size.width, y),
                            strokeWidth = strokeWidth
                        )
                    },
                textAlign = TextAlign.Center
            )

            Box(modifier = Modifier
                .height(160.dp)
                .width(80.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF39E833), Color(0xFFB0F8A8)),
                        start = Offset(0f, 0f),
                        end = Offset(1000f, 1000f) // <- DIAGONAL
                    )
                )
            )

        }


        VerticalDivider(
            color = Color(0xFF7D00F5),
            thickness = 2.dp
        )


        Column(modifier = Modifier
            .weight(1f)
        ) {

        }

    }
}