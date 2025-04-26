package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class UserInfoViewModel : ViewModel() {
    var name = mutableStateOf("")
    var lastName = mutableStateOf("")
    var sex = mutableStateOf("")
    var birthDate = mutableStateOf("")
    var educationLevel = mutableStateOf("")


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



    fun updateEducationLevel(newEducation: String) {
        educationLevel.value = newEducation
    }


}
