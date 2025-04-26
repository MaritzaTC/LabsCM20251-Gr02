package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun DropdownMenuEducation(
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {
    val options = listOf("Primaria", "Secundaria", "Universidad")
    var expanded by remember { mutableStateOf(false) }

    Column {
        OutlinedTextField(
            value = selectedOption,
            onValueChange = {},
            label = { Text("Grado de escolaridad") },
            trailingIcon = { Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "Expandir") },
            modifier = Modifier
                .fillMaxWidth()
                .clickable { expanded = true },
            readOnly = true,
            enabled = true
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
