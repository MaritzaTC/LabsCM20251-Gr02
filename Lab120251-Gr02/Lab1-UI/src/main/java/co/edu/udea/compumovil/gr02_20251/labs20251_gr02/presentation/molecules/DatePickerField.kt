package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules
import androidx.compose.material3.TextFieldDefaults
import android.app.DatePickerDialog
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DatePickerField(
    label: String,
    selectedDate: String,
    onDateSelected: (String) -> Unit,
    focusedBorderColor: Color = Color.Blue, // Define el color del borde cuando tiene foco
    unfocusedBorderColor: Color = Color.Gray, // Define el color del borde cuando no tiene foco
    disabledBorderColor: Color = Color.LightGray
) {
    val context = LocalContext.current
    val calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    val month = calendar.get(Calendar.MONTH)
    val day = calendar.get(Calendar.DAY_OF_MONTH)

    val datePickerDialog = DatePickerDialog(context, { _, y, m, d ->
        val localDate = LocalDate.of(y, m + 1, d)
        val formatted = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        onDateSelected(formatted)
    }, year, month, day)

    OutlinedTextField(
        value = selectedDate,
        onValueChange = {},
        label = { Text(label, modifier = Modifier
            .clickable { datePickerDialog.show() }) },
        trailingIcon = { Icon(imageVector = Icons.Default.DateRange, contentDescription = "Fecha",
            modifier = Modifier
                .clickable { datePickerDialog.show() })
        },

        textStyle = TextStyle(color = Color.Black),

        readOnly = true,
        enabled = true,
        shape = RoundedCornerShape(15.dp),

    )
}
