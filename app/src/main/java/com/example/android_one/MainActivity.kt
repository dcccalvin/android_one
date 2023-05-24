package com.example.android_one

import android.os.Bundle
import android.util.Size
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.DecoratedCustomViewStyle
import com.example.android_one.ui.theme.Android_oneTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {  button()
//                    Greetings()
//                    Greeting()
//                    raw()
//                    overlap()
                }
            }
        }
@Preview(showBackground = true)
@Composable
fun button(){
    Column(modifier = Modifier


        .fillMaxSize()
        .border(2.dp, Color.Blue)

        .background(Color.Black),


        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top



    ) {
//        var textstate by remember {
//            mutableSetOf("Your name")
//        }




//        Button(onClick = {},
//        modifier = Modifier
//            .padding(10.dp),
//        shape = RectangleShape,
//        colors =ButtonDefaults.buttonColors(
//
//
//            containerColor = Color.Green
//        )
//    )
//    {
//        Image(painter = painterResource(id = R.drawable.linux2), contentDescription = "icon",
//            modifier = Modifier
//                .width(30.dp)
//                .height(30.dp)
//
//        )
//        Text("Install",color= Color.Black)
//
//
//
//    }

    }

}





//@Preview(showBackground = true)
//@Composable
//fun Greetings() {
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .border(2.dp, Color.Blue)
//
//            .background(Color.Black),
//
//
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Top
//
//
//    )
//    {
//        Text("Hello Calvin.",color= Color.Green, fontSize = 70.sp,
//            fontFamily = FontFamily.Cursive,
//
//        )
//        Text("Default page",color= Color.Green,
//            fontSize = 40.sp, fontFamily = FontFamily.Cursive,
//            fontWeight = FontWeight.Bold
//        )
//        Text("Thank you for visiting this page",color= Color.Green,
//            fontSize = 30.sp, fontFamily = FontFamily.Cursive,
//            fontWeight = FontWeight.Bold
//
//        )
//        Button(onClick = {},
//            colors =ButtonDefaults.buttonColors(
//                containerColor = Color.Green)
//
//            ) {
//            Text("Buy Now!",color= Color.Black)
//
//
//        }
//    }
//
//
//}
//@Preview(showBackground = true)
//@Composable
//fun Greeting() {
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .border(2.dp, Color.Blue)
//
//            .background(Color.Black),
//
//
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Top
//
//
//    )
//    {
//
//
//        Text("Hello Calvin.",color= Color.Green, fontSize = 70.sp,
//            fontFamily = FontFamily.Cursive,
//
//            )
//        Text("Default page", Modifier.padding(3.dp),color= Color.Green,
//            fontSize = 40.sp, fontFamily = FontFamily.Serif,
//            fontWeight = FontWeight.SemiBold
//        )
//        Text("Thank you for visiting this page", Modifier.padding(20.dp),color= Color.Green,
//            fontSize = 30.sp, fontFamily = FontFamily.Cursive,
//            fontWeight = FontWeight.Bold
////            style = Shadow(color = Color.Green)
//
//        )
//        Image(
//            painter = painterResource(id = R.drawable.linux2), contentDescription = "linux",
//            modifier = Modifier
//                .border(2.dp, Color.Green, RoundedCornerShape(20))
//                .width(300.dp)
//                .shadow(10.dp)
//
//
//            )
//    }
//
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun raw()
//{
//    Row(modifier = Modifier
//        .fillMaxSize()
//        .border(2.dp, Color.Blue)
//
//        .background(Color.Black),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Center
//
//
//        )
//    {
//        Image(
//            painter = painterResource(id = R.drawable.linux2), contentDescription = "linux",
//            modifier = Modifier
//                .border(2.dp, Color.Green, RoundedCornerShape(20))
//                .width(200.dp)
//                .shadow(10.dp)
//
//
//        )
//        Image(
//            painter = painterResource(id = R.drawable.linux2), contentDescription = "linux",
//            modifier = Modifier
//                .border(2.dp, Color.Green, RoundedCornerShape(20))
//                .width(200.dp)
//                .shadow(10.dp)
//                .padding(1.dp)
//
//
//        )
//
//
//    }
//
//
//
//
//}
//@Preview(showBackground = true)
//@Composable
//fun overlap()
//{
//    Box(modifier = Modifier
//        .fillMaxSize()
//        .border(2.dp, Color.Blue)
//
//        .background(Color.Black))
//    {
//        Image(
//            painter = painterResource(id = R.drawable.linux2), contentDescription = "linux",
////            colorFilter = ColorFilter.tint(Color.Black),
//
//            modifier = Modifier
//                .border(2.dp, Color.White)
//                .width(400.dp)
//                .shadow(10.dp),
//            contentScale = ContentScale.FillBounds
//
//
//        )
//        Text("Thank you for visiting this page", Modifier.padding(20.dp),color= Color.White,
//            fontSize = 30.sp, fontFamily = FontFamily.Cursive,
//            fontWeight = FontWeight.Bold,
//
//
//
//        )
//    }
//
//
//    }











