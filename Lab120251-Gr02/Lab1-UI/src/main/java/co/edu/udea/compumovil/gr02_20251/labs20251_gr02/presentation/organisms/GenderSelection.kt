package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.organisms

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules.SexIcon


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun GenderSelection(selectedSex: String, onSexChange: (String) -> Unit){
    Row {
        SexIcon(stringResource(id = R.string.sex_personal_info))
        Column {
            val sexTypes = listOf(stringResource(id = R.string.man_personal_info), stringResource(id = R.string.women_personal_info), stringResource(id = R.string.other_personal_info))
            RadioGroup(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                items = sexTypes,
                selection = selectedSex,
                onItemClick = { clickedItem ->
                    onSexChange(clickedItem)
                }
            )
        }
    }
}



