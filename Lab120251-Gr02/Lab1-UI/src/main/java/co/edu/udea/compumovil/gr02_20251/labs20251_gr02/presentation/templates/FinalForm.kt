package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.FinalCard
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@Composable
fun FinalForm(viewModel: UserInfoViewModel,  navController: NavController) {
    Box(  modifier = Modifier
        .fillMaxSize(),) {
        Column(
        ) {
            SimpleNavbar()
            Logo()
            Column(
                modifier = Modifier
                    .padding(start = 70.dp, top = 16.dp)
            ) {
                FinalCard(navController = navController)
            }
        }
    }}
