package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MiUIOrientado(viewModel: UserInfoViewModel) {

    val navController = rememberNavController()
    val configuration = LocalConfiguration.current
    val orientation = configuration.orientation
    when (orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {
            NavHost(navController, startDestination = "personal") {
                composable("personal") { PersonalInfo(viewModel, navController) }
                composable("contact") { ContactInfo(viewModel, navController) }
                composable("final") { FinalForm(viewModel, navController) }
            }

        }
        Configuration.ORIENTATION_LANDSCAPE -> {
            NavHost(navController, startDestination = "personal"){
                composable("personal") { PersonalInfoLandscape(viewModel, navController) }
                composable("contact") { ContactInfoLandscape(viewModel, navController) }
                composable("final") { FinalFormLandscape(viewModel, navController) }
            }

        }
    }
}