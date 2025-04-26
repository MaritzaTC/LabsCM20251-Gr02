package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.AddressIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.CityIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.MailIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PhoneIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.CityAutocompleteInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ContactInfoLandscape(viewModel: UserInfoViewModel,navController: NavController) {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            SimpleNavbar()
            TitleText(text = stringResource(id = R.string.contact_info))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 8.dp)
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
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp)
                ) {
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
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Botón fuera del Row para mayor visibilidad
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
                    .padding(horizontal = 100.dp)
                    .height(50.dp)
            ) {
                Text(text = stringResource(id = R.string.next))
            }
        }
    }
}