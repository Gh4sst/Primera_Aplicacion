package com.dam.practica2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dam.practica2.ui.theme.PrimeraAplicacionTheme

class Practica_2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            PrimeraAplicacionTheme {


                MessageCard(msg = Message(author = "Mondongo",body=""))



                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    MessageCard(msg = Message(author = "Mondongo",body=""))
                }
            }
        }
    }
}
data class Message(val author:String,val body:String)

@Composable
fun MessageCard(msg: Message){
    Row(modifier = Modifier.padding(all=8.dp)){

        Image(
            painter = painterResource(R.drawable.esqueleto),
            contentDescription="Imagen de perfil",
            modifier = Modifier
                .size(30.dp)
                .clip(
                    CircleShape)
            )
        Spacer(modifier=Modifier.width(8.dp))

    Column {
        Text(text = msg.author)
        Text(text = msg.body)
    }
    }


}

@Preview(showBackground = true)
@Composable
fun MessageCardPreview(){
    PrimeraAplicacionTheme{
        MessageCard(msg = Message(author = "Mondongo",body="hola soy manolo"))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeraAplicacionTheme {
        Greeting("Android")
    }
}