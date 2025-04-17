package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.UserText


@Composable
fun LabelledRadioButton(
    modifier: Modifier = Modifier,
    label: String,
    selected: Boolean,
    onClick: (() -> Unit)?,
    enabled: Boolean = true,
    colors: RadioButtonColors = RadioButtonDefaults.colors(
        selectedColor = Color(0xFF30C88F),
        unselectedColor = Color(0xFFBBBBBB)
    )
) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .height(25.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = selected,
            onClick = onClick,
            enabled = enabled,
            colors = colors
        )
        UserText(label)
    }
}