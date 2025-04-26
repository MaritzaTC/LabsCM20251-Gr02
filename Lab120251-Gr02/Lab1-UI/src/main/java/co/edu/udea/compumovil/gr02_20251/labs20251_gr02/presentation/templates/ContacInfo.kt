package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.AddressIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.CityIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.Logo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.MailIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PeopleIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.PhoneIcon
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.SimpleNavbar
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.TitleText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.GenderSelection
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ContactInfo(viewModel: UserInfoViewModel,  navController: NavController) {
    Box(  modifier = Modifier
        .fillMaxSize(),){
        Column(
        ) {    SimpleNavbar()
            Logo()
            TitleText(text = stringResource(id = R.string.contact_info))
            Column(
                modifier = Modifier
                    .padding(start = 70.dp, top = 16.dp)
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
                IconInput(
                    icon = { CityIcon() },
                    textuser = stringResource(id = R.string.city_contact_info),
                    value = viewModel.city.value,
                    onValueChange = { viewModel.updateCity(it) }
                )
                IconInput(
                    icon = { AddressIcon() },
                    textuser = stringResource(id = R.string.address_contact_info),
                    value = viewModel.address.value,
                    onValueChange = { viewModel.updateAddress(it) }
                )
                Button(onClick = {navController.navigate("final")}) {
                    Text(stringResource(id = R.string.final_button))
                }
            }
        }

    }
}