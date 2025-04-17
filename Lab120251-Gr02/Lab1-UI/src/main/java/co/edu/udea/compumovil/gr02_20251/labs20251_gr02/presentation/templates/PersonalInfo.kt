package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.os.Build
import androidx.annotation.RequiresApi

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.RadioGroupAndIcon

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PersonalInfo(){
  Box(  modifier = Modifier
      .fillMaxSize(),){
      Column(
  ) {    SimpleNavbar()
          Logo()
          TitleText(text = "Información personal")
          Column(
              modifier = Modifier
              .padding(start = 70.dp, top = 16.dp)
          ) {
        IconInput("Nombres:")
        IconInput("Apellidos:")
              RadioGroupAndIcon()

    }
  }

  }
}