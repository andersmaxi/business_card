package com.example.bcard_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bcard_compose.ui.theme.BCard_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BCard_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Anders Trejo")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {


        Column(modifier = Modifier.padding(24.dp)){

            Spacer(modifier = Modifier.height(120.dp))

            Column ( modifier = modifier
                     .align(Alignment.CenterHorizontally))
            {
                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        // Set image size to 40 dp
                        .size(140.dp)
                        // Clip image to be shaped as a circle
                        .clip(RectangleShape)
                )
            }
            Spacer(modifier = Modifier.height(1.dp))

            Column(  modifier = modifier
                    .align(Alignment.CenterHorizontally)) {
                Text(
                    text = "$name",
                    fontSize = 26.sp,
                    modifier = modifier
                )
                Text(
                    text = "Senior Software Engineer",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    modifier = modifier

                )
                Text(
                    text = "IBM Cloud",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    modifier = modifier

                )
            }

            Spacer(modifier = Modifier.height(60.dp))


            Column( modifier = Modifier
                   .align(Alignment.CenterHorizontally)
                   .background(color= Color(245,245,245))
                   .padding(15.dp))
            {

                Column() {

                    Row(){
                        Image(
                            painter = painterResource(R.drawable.phone),
                            contentDescription = "phone",
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "01 555-6666-7777",
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            modifier = modifier

                        )

                    }


                }
                Spacer(modifier = Modifier.height(10.dp))

                Column() {
                    Row() {
                        Image(
                            painter = painterResource(R.drawable.linkedin),
                            contentDescription = "phone",
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "anderstrejo",
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            modifier = modifier

                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Column() {
                    Row() {
                        Image(
                            painter = painterResource(R.drawable.email),
                            contentDescription = "phone",
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "anderstrejo@hotmail.com",
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            modifier = modifier

                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))

                Column() {
                    Row() {
                        Image(
                            painter = painterResource(R.drawable.gps),
                            contentDescription = "phone",
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "595 Madison ,Trenton ,NJ 07666",
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            modifier = modifier

                        )
                    }
                }
            }

        }





}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BCard_ComposeTheme {
        Greeting("Anders Trejo")
    }
}