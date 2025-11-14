package com.example.bolsillo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bolsillo.presentation.components.MainScaffold
import com.example.bolsillo.presentation.screens.MainScreen
import com.example.bolsillo.ui.theme.BolsilloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BolsilloTheme {
                MainScaffold {
                    MainScreen()
                }
            }
        }
    }
}

@Preview
@Composable
fun todo(modifier: Modifier = Modifier) {
    MainScaffold {
        MainScreen()
    }
}

