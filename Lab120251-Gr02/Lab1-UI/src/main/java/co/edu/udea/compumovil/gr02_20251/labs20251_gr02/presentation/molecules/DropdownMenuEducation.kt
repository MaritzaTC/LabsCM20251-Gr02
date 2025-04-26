package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R

@Composable
fun DropdownMenuEducation(
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {
    val options = listOf(
        stringResource(id = R.string.primary),
        stringResource(id = R.string.secundary),
        stringResource(id = R.string.university)
    )
    var expanded by remember { mutableStateOf(false) }

    Column {
        OutlinedTextField(
            value = selectedOption,
            onValueChange = {},
            label = { Text(stringResource(id = R.string.grade),
                modifier = Modifier
                    .clickable { expanded = true })
                    },
            trailingIcon = { Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "Expandir",
                modifier = Modifier
                    .clickable { expanded = true }) },

            readOnly = true,
            enabled = true,
            shape = RoundedCornerShape(15.dp),
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach { label ->
                DropdownMenuItem(
                    onClick = {
                        onOptionSelected(label)
                        expanded = false
                    },
                    text = { Text(label) }
                )
            }
        }
    }
}
