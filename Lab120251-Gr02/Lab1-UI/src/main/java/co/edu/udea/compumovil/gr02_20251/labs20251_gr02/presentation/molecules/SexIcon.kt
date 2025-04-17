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
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PeopleIcon

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.UserText

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SexIcon(usertext: String) {
    Column(
        modifier = Modifier
            .width(80.dp)
            .padding(top = 10.dp,)

    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PeopleIcon()
            Spacer(modifier = Modifier.width(12.dp))
            UserText(text = usertext)
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}
