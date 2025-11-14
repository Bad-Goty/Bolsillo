package com.example.bolsillo.pruebas.degradados

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun BotonesTextos(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .background(
                    brush = Brush.linearGradient(
                        listOf(Color(0xFF7D00F5), Color(0xFFEBD9FF))
                    ),
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            Text("Aceptar", color = Color.White)
        }
        Spacer(Modifier.height(54.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .background(
                    brush = Brush.sweepGradient(
                        colors = listOf(
                            Color.Blue,
                            Color.Yellow,
                            Color.Cyan,
                            Color.Magenta
                        )
                    ),
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            Text("Aceptar", color = Color.White)
        }

        Spacer(Modifier.height(54.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color.White, Color(0xFF7D00F5)),
                        center = Offset.Unspecified,
                        radius = 150f
                    ),
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            Text("Aceptar", color = Color.Black)
        }

        Spacer(Modifier.height(54.dp))

        Text(
            text = "GOTY",
            style = TextStyle(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFEBD9FF), Color(0xFF7D00F5))
                ),
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        )


    }

}