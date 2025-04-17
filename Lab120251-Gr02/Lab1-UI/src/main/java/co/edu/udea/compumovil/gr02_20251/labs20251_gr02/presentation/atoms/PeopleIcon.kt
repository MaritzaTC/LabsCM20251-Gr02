package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.size

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R


@Composable
fun PeopleIcon(){
    val image = painterResource(id = R.drawable.outline_people_alt_24)
    Image(
        painter = image,
        contentDescription ="people",
        modifier = Modifier
            .size(24.dp)
    )
}

