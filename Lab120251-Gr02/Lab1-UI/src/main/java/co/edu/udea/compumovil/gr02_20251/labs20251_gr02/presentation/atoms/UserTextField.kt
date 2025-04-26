package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.MintGreen
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.SoftGray

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun UserTextField(
    value: String,
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text,
    capitalization: KeyboardCapitalization = KeyboardCapitalization.Words,
    imeAction: androidx.compose.ui.text.input.ImeAction = androidx.compose.ui.text.input.ImeAction.Next
) {
    Box(
        modifier = Modifier
            .width(217.dp)
            .height(41.dp)
            .border(1.dp, MintGreen, RoundedCornerShape(15.dp))
            .clip(RoundedCornerShape(12.dp))
            .background(SoftGray)
            .padding(horizontal = 8.dp)
    ) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            maxLines = 1,
            keyboardOptions = KeyboardOptions(
                capitalization = capitalization,
                keyboardType = keyboardType,
                imeAction = imeAction,
                autoCorrect = false
            ),
            textStyle = TextStyle(
                fontSize = 14.sp,
                textAlign = TextAlign.Start
            ),
            modifier = Modifier.align(Alignment.CenterStart)
        )
    }
}