package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MiUIOrientado(viewModel: UserInfoViewModel) {
    val configuration = LocalConfiguration.current
    val orientation = configuration.orientation
    when (orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {
            PersonalInfo(viewModel)
        }
        Configuration.ORIENTATION_LANDSCAPE -> {
            PersonalInfoLandscape(viewModel)
        }
    }
}