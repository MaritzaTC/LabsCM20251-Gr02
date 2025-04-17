package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.GenderSelection
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PersonalInfoLandscape(viewModel: UserInfoViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        SimpleNavbar()
        TitleText(text = stringResource(id = R.string.personal_info))
        Logo(size = 100.dp)
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 0.dp, start = 30.dp)
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {

                IconInput(
                    textuser = stringResource(id = R.string.name_personal_info),
                    value = viewModel.name.value,
                    onValueChange = { viewModel.updateName(it) }
                )
                IconInput(
                    textuser = stringResource(id = R.string.lastname_personal_info),
                    value = viewModel.lastName.value,
                    onValueChange = { viewModel.updateLastname(it) }
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            ) {
                GenderSelection(
                    selectedSex = viewModel.sex.value,
                    onSexChange = { viewModel.updateSex(it) }
                )
            }
        }
    }
}


