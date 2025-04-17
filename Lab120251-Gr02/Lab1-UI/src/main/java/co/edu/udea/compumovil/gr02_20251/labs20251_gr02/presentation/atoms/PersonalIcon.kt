package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms




import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable



@Composable
fun PersonIcon(){
    Icon(
        imageVector = Icons.Outlined.Person,
        contentDescription = "Person"
    )
}

