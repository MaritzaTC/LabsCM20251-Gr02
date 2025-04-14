package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText

@Composable
fun PersonalInfo(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        SimpleNavbar()

        TitleText(text = "Información Personal")

    }
}