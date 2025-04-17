package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PersonIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.UserText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.UserTextField


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun IconInput(textuser: String, value: String, onValueChange: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(5.dp)

    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PersonIcon()
            Spacer(modifier = Modifier.width(12.dp))
            UserText(text = textuser)
        }
        Spacer(modifier = Modifier.height(9.dp))
        UserTextField(value = value, onValueChange = onValueChange)
    }
}
