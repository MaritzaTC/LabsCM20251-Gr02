package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates

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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.*
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.CityAutocompleteInput
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.IconInput
import androidx.navigation.NavController
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms.UserInfoViewModel
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.GreenToBlueGradient

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
                CountryAutocompleteInput(
                    value = viewModel.country.value,
                    onValueChange = {viewModel.updateCountry(it) }
                )

                IconInput(
                    icon = { AddressIcon() },
                    textuser = stringResource(id = R.string.address_contact_info),
                    value = viewModel.address.value,
                    onValueChange = { viewModel.updateAddress(it) }
                )


Box(
    modifier = Modifier
        .padding(start = 45.dp, top = 35.dp)
        .size(width = 144.dp, height = 44.dp)
        .background(GreenToBlueGradient, shape = RoundedCornerShape(15.dp))
        .align(Alignment.Start)

    ) { Button(
    onClick = {
        if (viewModel.phone.value.isNotBlank() &&
            viewModel.mail.value.isNotBlank() &&
            isValidEmail(viewModel.mail.value) &&
            viewModel.country.value.isNotBlank()
        ) {
            navController.navigate("final")
        } else {
            Toast.makeText(
                context,
                context.getString(R.string.obligatory_data),
                Toast.LENGTH_SHORT
            ).show()
            
        }
    },
    modifier = Modifier
        .align(Alignment.Center),

    colors = ButtonDefaults.buttonColors(
        containerColor = Color.Transparent,
        contentColor = Color.Black
    )

) {
    Text(text = stringResource(id = R.string.next))
}}

            }
        }
    }
}

fun isValidEmail(email: String): Boolean {
    val emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
    return email.matches(Regex(emailRegex))
}
