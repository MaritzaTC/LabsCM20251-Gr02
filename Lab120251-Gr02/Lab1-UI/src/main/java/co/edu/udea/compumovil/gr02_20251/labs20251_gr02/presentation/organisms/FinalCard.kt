package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.molecules

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.R
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.FinalText
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms.ImageLoader
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.GreenToBlueGradient
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.MintGreen

@Composable
fun FinalCard(navController: NavController){
    OutlinedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        border = BorderStroke(1.dp,MintGreen),
        modifier = Modifier
            .size(width = 280.dp, height = 450.dp)

    ) {
        FinalText(stringResource(id = R.string.final_form))
        Column(   modifier = Modifier
            .fillMaxWidth()
            .padding(26.dp)) {
            ImageLoader()
        }

        Box(
            modifier = Modifier
                .padding(35.dp)
                .fillMaxWidth()
                .background(GreenToBlueGradient, shape = RoundedCornerShape(15.dp)),
        )
        {
            Button(onClick = { navController.navigate("personal") },
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(width = 207.dp, height = 44.dp),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black
                )
            ) {
                Text(stringResource(id = R.string.final_button),
                )
            }
        }

    }
}