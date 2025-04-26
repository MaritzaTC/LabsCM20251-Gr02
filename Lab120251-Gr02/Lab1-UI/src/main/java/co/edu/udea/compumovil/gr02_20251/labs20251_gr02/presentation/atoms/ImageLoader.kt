package co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
@Composable
fun ImageLoader(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val gifUrl = "https://img1.picmix.com/output/stamp/normal/1/0/8/8/1238801_efcf5.gif"

    AsyncImage(
        model = ImageRequest.Builder(context)
            .data(gifUrl)
            .crossfade(true)
            .build(),
        contentDescription = null,
        modifier = Modifier.size(200.dp)
    )

}
