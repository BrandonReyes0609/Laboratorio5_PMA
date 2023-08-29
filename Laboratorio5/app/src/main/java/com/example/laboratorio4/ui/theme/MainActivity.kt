package com.example.laboratorio4.ui.theme

//import android.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.laboratorio4.R

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    ArtisCardColumn()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun ArtisCardColumn(modifier: Modifier=Modifier) {
    val image1 = painterResource(R.drawable.fotopersonas)
    val image2 = painterResource(R.drawable.sn)
    val image3 = painterResource(R.drawable.personas2)
    val image4 = painterResource(R.drawable.blibioteca)
    val image5 = painterResource(R.drawable.blibioteca2)
    //Modigcar las caracteristicas de la foto
    val imageModifier = Modifier
        .size(200.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Green)
        //val texteModifier = Modifier
        .size(200.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Green)
    Column {
        Text(text = "Campus Central")
        Text(text = "Campus Central")
        //Column(modifier = Modifier.fillMaxSize()){
        Image(painter = image1, contentDescription = null)
        Column {

            Text("Destacados")
            Row {
                Column {
                    Image(painter = image2, contentDescription = null, modifier = imageModifier)
                    Text("Service Now")
                }
                Column {
                    Image(painter = image3, contentDescription = null, modifier = imageModifier)
                    Text("Actualidad UVG")
                }
            }
        }
        Column {

            Text("Destacados")
            Row {
                Column {
                    Image(painter = image4, contentDescription = null, modifier = imageModifier)
                    Text(text = "Directorio de Servicios\n Estudiantiles" )
                }
                Column {
                    Image(painter = image5, contentDescription = null, modifier = imageModifier)
                    Text("Portal Web Biblioteca UVG")
                }
            }
        }
        //Row {
        //    Image(painter = image4,contentDescription = null, modifier = imageModifier)
        //    Image(painter = image5,contentDescription = null, modifier = imageModifier)
        //}
    }
}









@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Laboratorio4Theme {
        ArtisCardColumn()

    }
}