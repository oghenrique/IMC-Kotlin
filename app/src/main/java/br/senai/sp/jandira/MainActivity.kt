package br.senai.sp.jandira

import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ui.theme.IMCLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(

                modifier = Modifier
                    .background(Color(0xffeb1450))
                    .fillMaxWidth()
                    .height(200.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.calculo),
                    contentDescription = ""
                )

                Text(
                    text = "Calculadora IMC",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(

                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .offset(y = -30.dp)
                        .background(
                            Color(0xFFF0ecec),
                            shape = RoundedCornerShape(
                                10.dp
                            )
                        )
                        .width(300.dp)
                        .height(400.dp),

                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Seus dados",
                        color = Color(0xffeb1450),
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(
                                bottom = 18.dp
                            )
                    )
                    Column(
                    ) {
                        Text(
                            text = "Seu peso:",
                            modifier = Modifier
                                .padding(
                                    bottom = 6.dp
                                ),
                            color = Color(0xffeb1450)
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                    Text(text = "Seu peso em Kg",
                                    color = Color.Black
                                    )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color(0xffeb1450),
                                focusedBorderColor = Color(0xffeb1450)
                            ),
                            modifier = Modifier
                                .padding(
                                    bottom = 8.dp
                                )
                        )
                        Text(
                            text = "Sua altura:",
                            modifier = Modifier
                                .padding(
                                    bottom = 6.dp
                                ),
                            color = Color(0xffeb1450),
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Sua altura em cm",
                                    color = Color.Black
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color(0xffeb1450),
                                focusedBorderColor = Color(0xffeb1450)
                            )
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xffeb1450)
                            ),
                        shape = RoundedCornerShape(
                            8.dp
                        ),
                        modifier = Modifier
                            .padding(
                                top = 32.dp
                            )
                            .height(50.dp)
                            .width(280.dp)
                    ) {
                        Text(
                            text = "Calcular",
                            fontSize = 18.sp,
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .size(
                            width = 300.dp,
                            height = 100.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        Color(0xaa2d9560)
                    )
                    ){
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically,

                    ) {
                        Column(
                            modifier = Modifier,
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Text(
                                modifier = Modifier,
                                text = "Resultado",
                                color = Color.White,

                            )
                            Text(
                                text = "Peso Ideal",
                                color = Color.White,
                                fontSize = 24.sp
                            )
                        }
                        Text(
                            text = "21.3",
                            color = Color.White,
                            fontSize = 34.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMCLoginTheme {
        Greeting()
    }
}
