package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign


@Composable
fun TitleText(text: String) {
    Text(
        text = text,
        modifier = Modifier.fillMaxWidth(),
        style = MaterialTheme.typography.titleLarge,
        textAlign = TextAlign.Center
    )
}
