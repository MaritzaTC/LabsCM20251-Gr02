package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val MintGreen = Color(0xFF30C88F)
val SoftGray = Color(0xFFF2F0F0)
val Pink40 = Color(0xFF7D5260)


val LinearGreen = Color(0xFF33D35E)
val LinearBlue = Color(0xFF2AB6D9)

val GreenToBlueGradient = Brush.linearGradient(
    colors = listOf(LinearGreen, LinearBlue),
    start = Offset(0f, 0f),
    end = Offset(1000f, 0f)
)
