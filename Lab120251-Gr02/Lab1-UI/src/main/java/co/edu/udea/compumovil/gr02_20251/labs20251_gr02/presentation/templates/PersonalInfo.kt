package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PeopleIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PersonIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.GenderSelection
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PersonalInfo(viewModel: UserInfoViewModel){
    Box(  modifier = Modifier
        .fillMaxSize(),){
        Column(
        ) {    SimpleNavbar()
            Logo()
            TitleText(text = stringResource(id = R.string.personal_info))
            Column(
                modifier = Modifier
                    .padding(start = 70.dp, top = 16.dp)
            ) {
                IconInput(
                    icon = { PersonIcon() },
                    textuser = stringResource(id = R.string.name_personal_info),
                    value = viewModel.name.value,
                    onValueChange = { viewModel.updateName(it) }
                )
                IconInput(
                    icon = { PersonIcon() },
                    textuser = stringResource(id = R.string.lastname_personal_info),
                    value = viewModel.lastName.value,
                    onValueChange = { viewModel.updateLastname(it) }
                )
                GenderSelection(
                    selectedSex = viewModel.sex.value,
                    onSexChange = {
                        viewModel.updateSex(it)
                    })
            }
        }

    }
}