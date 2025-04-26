package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.*
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.CityAutocompleteInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import androidx.navigation.NavController
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ContactInfo(viewModel: UserInfoViewModel,navController: NavController) {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            SimpleNavbar()
            Logo()
            TitleText(text = stringResource(id = R.string.contact_info))

            Column(
                modifier = Modifier
                    .padding(start = 70.dp, top = 16.dp, end = 70.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconInput(
                    icon = { PhoneIcon() },
                    textuser = stringResource(id = R.string.phone_contact_info),
                    value = viewModel.phone.value,
                    onValueChange = { viewModel.updatePhone(it) },
                    keyboardType = KeyboardType.Phone
                )

                IconInput(
                    icon = { MailIcon() },
                    textuser = stringResource(id = R.string.mail_contact_info),
                    value = viewModel.mail.value,
                    onValueChange = { viewModel.updateMail(it) },
                    keyboardType = KeyboardType.Email
                )

                CityAutocompleteInput(
                    value = viewModel.city.value,
                    onValueChange = { viewModel.updateCity(it) }
                )

                IconInput(
                    icon = { AddressIcon() },
                    textuser = stringResource(id = R.string.address_contact_info),
                    value = viewModel.address.value,
                    onValueChange = { viewModel.updateAddress(it) }
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        if (viewModel.phone.value.isNotBlank() &&
                            viewModel.mail.value.isNotBlank()
                        ) {
                            navController.navigate("final")
                        } else {
                            Toast.makeText(
                                context,
                                "Por favor completa todos los campos obligatorios",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text(text = stringResource(id = R.string.next))
                }
            }
        }
    }
}