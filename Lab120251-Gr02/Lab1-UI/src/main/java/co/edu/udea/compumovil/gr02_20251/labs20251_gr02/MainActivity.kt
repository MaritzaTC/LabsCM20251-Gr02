package co.edu.udea.compumovil.gr02_20251.labs20251_gr02

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.templates.PersonalInfo
import co.edu.udea.compumovil.gr02_20251.labs20251_gr02.presentation.tokens.Labs20251Gr02Theme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Labs20251Gr02Theme {
                Scaffold(modifier = Modifier.fillMaxSize()){innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                       PersonalInfo()
                    }
                }
            }
        }
        }}


