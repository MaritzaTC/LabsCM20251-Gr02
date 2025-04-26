package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PersonIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.DatePickerField
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.DropdownMenuEducation
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.GenderSelection
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PersonalInfo(viewModel: UserInfoViewModel,  navController: NavController) {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            SimpleNavbar()
            Logo()
            TitleText(text = stringResource(id = R.string.personal_info))
            Column(
                modifier = Modifier
                    .padding(start = 70.dp, top = 16.dp, end = 70.dp)
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
                    onSexChange = { viewModel.updateSex(it) }
                )

                Spacer(modifier = Modifier.height(16.dp))

                DatePickerField(
                    label = stringResource(id = R.string.date),
                    selectedDate = viewModel.birthDate.value,
                    onDateSelected = { viewModel.updateBirthDate(it) }
                )

                Spacer(modifier = Modifier.height(16.dp))

                DropdownMenuEducation(
                    selectedOption = viewModel.educationLevel.value,
                    onOptionSelected = { viewModel.updateEducationLevel(it) }
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        if (viewModel.name.value.isNotBlank() &&
                            viewModel.lastName.value.isNotBlank() &&
                            viewModel.birthDate.value.isNotBlank()
                        ) {

                            navController.navigate("contact")
                        } else {
                            Toast.makeText(
                                context,
                                context.getString(R.string.obligatory_data),
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = stringResource(id = R.string.next))
                }
            }
        }
    }
}
