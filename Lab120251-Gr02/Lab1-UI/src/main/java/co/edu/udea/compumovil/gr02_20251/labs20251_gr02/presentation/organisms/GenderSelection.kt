package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.SexIcon


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun RadioGroupAndIcon(){
    Row {
        SexIcon("Sexo:")
        Column {
            val sexTypes = listOf("Hombre", "Mujer", "Otro(?)")
            val currentSelection = remember { mutableStateOf(sexTypes.first()) }
            RadioGroup(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                items = sexTypes,
                selection = currentSelection.value,
                onItemClick = { clickedItem ->
                    currentSelection.value = clickedItem
                }
            )
        }
    }
}


