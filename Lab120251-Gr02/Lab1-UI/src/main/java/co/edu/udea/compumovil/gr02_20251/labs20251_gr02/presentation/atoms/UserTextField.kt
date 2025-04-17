package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.MintGreen
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.SoftGray


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun UserTextField() {
        var value by remember { mutableStateOf("") }
        TextField(
            value = value,
            onValueChange = { value = it },
            maxLines = 2,
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                keyboardType = KeyboardType.Text,
                imeAction = androidx.compose.ui.text.input.ImeAction.Done
            ),
            modifier = Modifier
                .width(217.dp)
                .height(41.dp)
                .padding(0.dp)
                .border(2.dp, (MintGreen), RoundedCornerShape(15.dp))
                .clip(RoundedCornerShape(12.dp))
                .background(SoftGray)

        )
}
