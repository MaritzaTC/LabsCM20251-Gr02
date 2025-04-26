package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms


import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.size

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R


@Composable
fun PhoneIcon(){
    val image = painterResource(id = R.drawable.tabler_icon_mail)
    Image(
        painter = image,
        contentDescription ="phone",
        modifier = Modifier
            .size(24.dp)
    )
}
