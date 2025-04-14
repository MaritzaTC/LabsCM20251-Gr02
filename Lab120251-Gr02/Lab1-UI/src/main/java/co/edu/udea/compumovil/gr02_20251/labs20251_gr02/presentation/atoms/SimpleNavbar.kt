package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.GreenToBlueGradient

@Composable
fun SimpleNavbar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(GreenToBlueGradient)
    )
}
