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
import com.example.laboratorio4.R

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3("Android")
                    ArtisCardColumn1()
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun ArtisCardColumn3(modifier: Modifier=Modifier) {
    val image1 = painterResource(R.drawable.engranaje1)
    val image2 = painterResource(R.drawable.f1)
    val image3 = painterResource(R.drawable.l8)
    val image4 = painterResource(R.drawable.l16)
    val image5 = painterResource(R.drawable.l18)
    val image6 = painterResource(R.drawable.l17)
    val image7 = painterResource(R.drawable.l18)
    val image8 = painterResource(R.drawable.l12)
    val image9 = painterResource(R.drawable.l13)
    val image10 = painterResource(R.drawable.l7)


    //val image4 = painterResource(R.drawable.blibioteca)
    //val image5 = painterResource(R.drawable.blibioteca2)
    //Modigcar las caracteristicas de la foto
    val imageModifier = Modifier
        .size(200.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Green)
        //val texteModifier = Modifier
        .size(200.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Green)
    val Borde = Modifier
        //.size(200.dp)
        .border(BorderStroke(1.dp, Color.Black))
    //.background(Color.Green)
    //val texteModifier = Modifier
    val Icono = Modifier
        .size(40.dp)
        .border(BorderStroke(1.dp, Color.Black))

    Column(modifier = Modifier.fillMaxSize()){
        Row{

            //Text(text = "My Profile", modifier = Modifier.border(BorderStroke(1.dp, Color.Black)))
            //Image(painter = image1, contentDescription = null,modifier = Modifier
            //    .size(20.dp)
            //    .border(BorderStroke(1.dp, Color.Black)))
            //}
        }
        Row{
            Image(painter = image3, contentDescription = null,modifier = Icono)
            Column {
                Text(text = "Emergency Contacts")
            }
        }
        //Parte 1
        Column {
            //Image(painter = image2, contentDescription = null,modifier = Borde)
            //Text(text = "Brandon Javier Reyes Morales")
            Row{
                Image(painter = image4, contentDescription = null,modifier = Icono)
                Column {
                    Text(text = "Emergencias")
                    Text(text = "Si se presenta un incidente o un percance por favor marca el número de emergencia y rapidamente te apoyamos\n")
                }
            }

        }
        //Parte 2
        Row{
            Image(painter = image5, contentDescription = null,modifier = Icono)
            Column {
                Text(text = "Call 4444-4444", modifier = Modifier.background(Color.Green))
                Text(text = "")
            }
        }
        //Parte 3
        Row{
            Image(painter = image6, contentDescription = null,modifier = Icono)
            Column {
                Text(text = "Clinica UVG")
                Text(text = "La Clínica UVG, presta los siguientes servicios:\n" +
                        "*Atención a Emergencias\n" +
                        "*Atención Primaria a Enfermedades Comunes Plan Educacional sobre Enfermedades\n" +
                        "\n" +
                        "Horario de Atención: 7:00 a.m. a 8:30 p.m.\n" +
                        "Campus Central Edificio F 119-120.")
            }
        }
        //Parte 3
        Row{
            Image(painter = image7, contentDescription = null,modifier = Icono)
            Column {
                Text(text = "Call 2222-2222 ex 31313", modifier = Modifier.background(Color.Green))

            }
        }
    }
//BorderStroke(1.dp, Color.Black))
//        .background(Color.Green)
}









@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    Laboratorio4Theme {
        ArtisCardColumn3()

    }
}