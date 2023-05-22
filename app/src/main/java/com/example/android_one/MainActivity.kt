package com.example.android_one

import android.os.Bundle
import android.util.Size
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_one.ui.theme.Android_oneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    Greetings()
                    Greeting()
                }
            }
        }
@Preview(showBackground = true)
@Composable
fun Greetings() {

    Column(
        modifier = Modifier
            .fillMaxSize(0.7f)
            .border(2.dp, Color.Blue)

            .background(Color.Black),


        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top


    )
    {
        Text("Hello Calvin.",color= Color.Green, fontSize = 70.sp,
            fontFamily = FontFamily.Cursive,

        )
        Text("Default page",color= Color.Green,
            fontSize = 40.sp, fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold
        )
        Text("Thank you for visiting this page",color= Color.Green,
            fontSize = 30.sp, fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold

        )
    }


}
@Preview(showBackground = true)
@Composable
fun Greeting() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .border(2.dp, Color.Blue)

            .background(Color.Black),


        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top


    )
    {
        Text("Hello Calvin.",color= Color.Green, fontSize = 70.sp,
            fontFamily = FontFamily.Cursive,

            )
        Text("Default page", Modifier.padding(3.dp),color= Color.Green,
            fontSize = 40.sp, fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold
        )
        Text("Thank you for visiting this page", Modifier.padding(20.dp),color= Color.Green,
            fontSize = 30.sp, fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
//            style = Shadow(color = Color.Green)

        )
    }


}