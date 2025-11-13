package com.example.bolsillo.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.bolsillo.presentation.components.MainScreenHeader
import com.example.bolsillo.presentation.components.ViewEgresos
import com.example.bolsillo.presentation.components.ViewIngresos
import com.example.bolsillo.presentation.components.ViewTodo

@Composable
fun MainScreen() {

    var selectedView by remember { mutableIntStateOf(0) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        //contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item {
            MainScreenHeader(vistas = selectedView, onVistaChange = { newVista -> selectedView = newVista })
        }

        item {
            Surface(
                color = Color.White,
                tonalElevation = 2.dp,
                shadowElevation = 0.dp,
                shape = RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp),
                modifier = Modifier.fillParentMaxHeight()   // ⭐ ESTE ES EL TRUCO
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding()
                        .background(Color.Transparent)
                ) {
                    when (selectedView) {
                        0 -> ViewTodo()
                        1 -> ViewIngresos()
                        2 -> ViewEgresos()
                    }
                }
            }
        }

    }
}