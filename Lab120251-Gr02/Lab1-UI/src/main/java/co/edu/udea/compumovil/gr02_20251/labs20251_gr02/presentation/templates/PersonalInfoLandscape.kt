package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.R.attr.label
import android.R.attr.text
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PeopleIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.DatePickerField
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.DropdownMenuEducation
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.GenderSelection
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel
import androidx.navigation.NavController
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.GreenToBlueGradient


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PersonalInfoLandscape(viewModel: UserInfoViewModel, navController: NavController) {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SimpleNavbar()
        TitleText(text = stringResource(id = R.string.personal_info))
        //Logo(size = 60.dp)

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 30.dp, end = 30.dp, top = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp)
            ) {
                IconInput(
                    icon = { PeopleIcon() },
                    textuser = stringResource(id = R.string.name_personal_info),
                    value = viewModel.name.value,
                    onValueChange = { viewModel.updateName(it) }
                )
                IconInput(
                    icon = { PeopleIcon() },
                    textuser = stringResource(id = R.string.lastname_personal_info),
                    value = viewModel.lastName.value,
                    onValueChange = { viewModel.updateLastname(it) }
                )
                Spacer(modifier = Modifier.height(16.dp))

                Box(modifier = Modifier.width(180.dp)) {
                    DatePickerField(
                        label = stringResource(id = R.string.date),
                        selectedDate = viewModel.birthDate.value,
                        onDateSelected = { viewModel.updateBirthDate(it) }
                    )
                }
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
                Spacer(modifier = Modifier.height(8.dp))

                Box(modifier = Modifier.width(200.dp)) {
                    DropdownMenuEducation(
                        selectedOption = viewModel.educationLevel.value,
                        onOptionSelected = { viewModel.updateEducationLevel(it) }
                    )
                }

                Box(
                    modifier = Modifier
                        .padding(start = 0.dp, top = 20.dp)
                        .size(width = 200.dp, height = 44.dp)
                        .background(GreenToBlueGradient, shape = RoundedCornerShape(15.dp))
                        .align(Alignment.Start),

                    )
                {
                    Button(
                        onClick = {
                            if (
                                viewModel.name.value.isNotBlank() &&
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
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(width = 90.dp, height = 44.dp),

                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Black
                        )

                    ) {
                        Text(text = stringResource(id = R.string.next))
                    }
                }

            }
        }
    }
}