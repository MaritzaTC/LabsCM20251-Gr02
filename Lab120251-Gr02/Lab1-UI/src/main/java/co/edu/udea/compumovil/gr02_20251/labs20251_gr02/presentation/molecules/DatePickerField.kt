package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules

import android.app.DatePickerDialog
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DatePickerField(
    label: String,
    selectedDate: String,
    onDateSelected: (String) -> Unit
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
        label = { Text(label) },
        trailingIcon = { Icon(imageVector = Icons.Default.DateRange, contentDescription = "Fecha") },
        modifier = Modifier
            .fillMaxWidth()
            .clickable { datePickerDialog.show() },
        readOnly = true,
        enabled = true
    )
}
