package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms

import android.R.attr.name
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class UserInfoViewModel : ViewModel() {
    var currentPage by mutableStateOf("personal")
    var name = mutableStateOf("")
    var lastName = mutableStateOf("")
    var sex = mutableStateOf("")
    var phone = mutableStateOf("")
    var mail = mutableStateOf("")
    var city = mutableStateOf("")
    var address = mutableStateOf("")
    var birthDate = mutableStateOf("")
    var educationLevel = mutableStateOf("")
    var country = mutableStateOf("")





    fun updateName(newName: String) {
        name.value = newName
    }

    fun updateLastname(newLastname: String) {
        lastName.value = newLastname
    }

    fun updateSex(newSexo: String) {
        sex.value = newSexo
    }

    fun updateBirthDate(newDate: String) {
        birthDate.value = newDate
    }

    fun updateCountry(newCountry: String) {
        country.value = newCountry
    }



    fun updateEducationLevel(newEducation: String) {
        educationLevel.value = newEducation
    }
    fun updatePhone(newPhone: String) {
        phone.value = newPhone
    }

    fun updateMail(newMail: String) {
        mail.value = newMail
    }

    fun updateCity(newCity: String) {
        city.value = newCity
    }

    fun updateAddress(newAddress: String) {
        address.value = newAddress
    }
}
