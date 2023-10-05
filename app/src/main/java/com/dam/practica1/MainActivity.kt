package com.dam.practica1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.practica1.ui.theme.PrimeraAplicacionTheme
import com.dam.practica1.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeraAplicacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("porros")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color= Green) {
        Text(
            text = "Hola soy  $name!",
            color = Color.Red,
            modifier = Modifier.padding(22.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeraAplicacionTheme {
        Greeting("Alex")
    }
}

@Composable
fun Parting(name:String,modifier: Modifier=Modifier){
    Surface(
        color = Purple40,
        shape = CircleShape,
        tonalElevation = 13.dp,
    ) {
        Text(
            text = "Adios me piro $name!",
            color = Color.Red,
            modifier = Modifier.padding(22.dp),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Black
            )
        )
    }

}

@Preview(showBackground = false)
@Composable
fun PreviewParting() {
    PrimeraAplicacionTheme {
        Parting("soy Alex")
    }

}
@Composable
fun Message