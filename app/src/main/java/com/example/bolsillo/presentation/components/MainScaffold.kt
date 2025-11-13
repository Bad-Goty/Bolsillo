package com.example.bolsillo.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MainScaffold(
    contet:@Composable () -> Unit
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color(0xFFCDA9EF),
                    Color(0xFF7D00F5)
                ),
                center = Offset(0f, 0f),
                //center = Offset.Unspecified,
                radius = 700f
            )
        )
    ) {
        Scaffold(
            containerColor = Color.Transparent,

            bottomBar = {
                CustonBottomBar()
            }
        ) { inner ->
            Box(Modifier.padding(inner)) {
                contet()
            }
        }
    }
}

@Preview
@Composable
fun CustonBottomBar(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ) {
        // Contenedor "píldora"
        Box(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(bottom = 24.dp, top = 8.dp)
                .fillMaxWidth(0.9f)          // un poco más corto que el ancho total
                .height(60.dp)
                .clip(RoundedCornerShape(50.dp))
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFFA751FC), Color(0xFF7D00F5)),
                        center = Offset.Unspecified,
                        //center = Offset.Unspecified,
                        radius = 900f
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(Icons.Filled.Home, contentDescription = "asdfasdf")
                Icon(Icons.Outlined.FavoriteBorder, contentDescription = "asdfasdf")
                Icon(Icons.Outlined.Search, contentDescription = "asdfasdf")
                Icon(Icons.Outlined.Home, contentDescription = "asdfasdf")
                Icon(Icons.Outlined.Favorite, contentDescription = "asdfasdf")
            }
        }
    }
}