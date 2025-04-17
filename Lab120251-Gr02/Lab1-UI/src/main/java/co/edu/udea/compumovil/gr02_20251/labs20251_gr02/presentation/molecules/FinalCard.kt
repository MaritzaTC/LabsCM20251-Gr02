package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.FinalText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.MintGreen

@Composable
fun FinalCard(){
    OutlinedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        border = BorderStroke(1.dp, Color(0xFF30C88F)),
        modifier = Modifier
            .size(width = 280.dp, height = 100.dp)
    ) {
        FinalText(stringResource(id = R.string.final_form))
    }
}