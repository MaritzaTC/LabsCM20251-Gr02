package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.LabelledRadioButton

@Composable
fun RadioGroup(
    modifier: Modifier,
    items: List<String>,
    selection: String,
    onItemClick: ((String) -> Unit)
) {
    Column(modifier = modifier) {
        items.forEach { item ->
            LabelledRadioButton(
                modifier = Modifier.fillMaxWidth(),
                label = item,
                selected = item == selection,
                onClick = {
                    onItemClick(item)
                }
            )
        }
    }
}