package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.CityIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.UserText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.MintGreen
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.SoftGray

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CityAutocompleteInput(
    value: String,
    onValueChange: (String) -> Unit
) {
    val cities = listOf(
        "Bogotá", "Medellín", "Cali", "Barranquilla", "Cartagena",
        "Bucaramanga", "Manizales", "Pereira", "Santa Marta", "Cúcuta"
    )
    var expanded by remember { mutableStateOf(false) }
    var filteredCities by remember(value) {
        mutableStateOf(cities.filter { it.contains(value, ignoreCase = true) })
    }

    LaunchedEffect(value) {
        filteredCities = cities.filter { it.contains(value, ignoreCase = true) }
    }

    Column(modifier = Modifier.fillMaxWidth().padding(5.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            CityIcon()
            Spacer(modifier = Modifier.width(12.dp))
            UserText(text = stringResource(id = R.string.city_contact_info))
        }
        Spacer(modifier = Modifier.height(9.dp))

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            Box(
                modifier = Modifier
                    .menuAnchor()
                    .width(217.dp)
                    .height(41.dp)
                    .border(1.dp, MintGreen, RoundedCornerShape(15.dp))
                    .clip(RoundedCornerShape(12.dp))
                    .background(SoftGray)
                    .padding(horizontal = 8.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                BasicTextField(
                    value = value,
                    onValueChange = {
                        onValueChange(it)
                        expanded = true
                    },
                    maxLines = 1,
                    textStyle = TextStyle(fontSize = 14.sp),
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
                )
            }

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                filteredCities.forEach { city ->
                    DropdownMenuItem(
                        text = { Text(city) },
                        onClick = {
                            onValueChange(city)
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}