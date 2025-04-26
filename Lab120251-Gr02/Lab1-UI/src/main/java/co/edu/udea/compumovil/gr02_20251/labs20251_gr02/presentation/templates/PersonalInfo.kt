package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.DatePickerField
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.DropdownMenuEducation
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.GenderSelection
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PersonalInfo(viewModel: UserInfoViewModel) {
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            SimpleNavbar()
            Logo()
            TitleText(text = stringResource(id = R.string.personal_info))
            Column(
                modifier = Modifier
                    .padding(start = 70.dp, top = 16.dp, end = 70.dp)
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
                GenderSelection(
                    selectedSex = viewModel.sex.value,
                    onSexChange = { viewModel.updateSex(it) }
                )
                Spacer(modifier = Modifier.height(16.dp))

                DatePickerField(
                    label = "Fecha de nacimiento",
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
                            println("Información personal:")
                            println("${viewModel.name.value} ${viewModel.lastName.value}")
                            println(viewModel.sex.value)
                            println("Nació el ${viewModel.birthDate.value}")
                            println(viewModel.educationLevel.value)
                        } else {
                            Toast.makeText(
                                context,
                                "Por favor completa todos los campos obligatorios",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Siguiente")
                }
            }
        }
    }
}