package com.example.whatsapprun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.example.whatsapprun.ui.theme.WhatsappRunTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import io.github.serpro69.kfaker.faker


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            WhatsappRunTheme(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = true
            ) {
//                window.statusBarColor = colorScheme.primary.toArgb()
                WhatsAppLayout()

            }
        }
    }
}


@Composable
fun WhatsAppLayout(){


    val systemUiController = rememberSystemUiController()

//                systemUiController.setSystemBarsColor(Color(0xFF118385), darkIcons = isSystemInDarkTheme())
//    systemUiController.setStatusBarColor(Color(0xFF118385), darkIcons = isSystemInDarkTheme())
    systemUiController.setNavigationBarColor(Color.Transparent)



    val camera = painterResource(id = R.drawable.photo_camera_48px)
    val search = painterResource(id = R.drawable.search_48px)
    val more = painterResource(id = R.drawable.more_vert_48px)
    val group = painterResource(id = R.drawable.groups_48px)
    val profilePics = setOf(
        R.drawable.pro_0b36fe3068c6474aa8bddd33a48c272b_jpg_1200w_1200h_1s,
        R.drawable.pro_095d2b032a754346b4bd84fa3ded5bff_jpg_1200w_1200h_1s,
        R.drawable.pro_170388045e464228934ca7ed16413614_jpg_1200w_1200h_1s,
        R.drawable.pro_0bddc5b6724347d7992a925c378d0a12_jpg_1200w_1200h_1s,
        R.drawable.pro_11ca1b58ae6b49fb84f39d159d7c9c31_jpg_1200w_1200h_1s,
        R.drawable.pro_128396fcfffa430c9f78c9a80265e20c_jpg_1200w_1200h_1s,
        R.drawable.pro_1c237af0c9f3438787920d396d7319b9_jpg_1200w_1200h_1s,
        R.drawable.pro_1e10f872512e4eafa273183122bdaf9f_jpg_1200w_1200h_1s,
        R.drawable.pro_0bddc5b6724347d7992a925c378d0a12_jpg_1200w_1200h_1s,
        R.drawable.pro_29a928b0f6e64a7e9ddcbf743097b92a_jpg_1200w_1200h_1s,
        R.drawable.pro_338f6c8fec624b9c89095adf29c4ee13_jpg_1200w_1200h_1s,
        R.drawable.pro_49c28c1458f241fbb3e97105c92288aa_jpg_1200w_1200h_1s,
        R.drawable.pro_372d76e5582443f4a0a8973a83c03569_jpg_1200w_1200h_1s,
        R.drawable.pro_856f8dc0f4be4d3498bcc3aa519f201d_jpg_1200w_1200h_1s,
    )
    val faker = faker {  }

    Column {
        Column(
            modifier = Modifier
                .background(Color(0xFF118385))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.1f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "WhatsApp",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 28.sp,
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .padding(start = 12.dp),
                    color = Color.White
                )


                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = camera,
                        contentDescription = "more",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Icon(
                        painter = search,
                        contentDescription = "camera",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Icon(
                        painter = more,
                        contentDescription = "search",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .size(28.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Icon(
                    painter = group,
                    contentDescription = "group",
                    tint = Color.White,
                    modifier = Modifier
                        .size(32.dp)
                )
                Text(
                    text = "Chats",
                    color = Color.White, fontFamily = FontFamily.SansSerif,
                )
                Text(
                    text = "Status",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )
                Text(
                    text = "Calls",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )

            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 12.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            repeat(20) {
                Spacer(modifier = Modifier.height(12.dp))
                Card(profilePics.random(), faker.name.neutralFirstName(), faker.bigBangTheory.quotes().substring(0..7))
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }


}

@Composable
fun Card(
    @DrawableRes image: Int = R.drawable.pro_170388045e464228934ca7ed16413614_jpg_1200w_1200h_1s,
    userName: String,
    message: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "user",
            modifier = Modifier
                .size(52.dp)
                .clip(CircleShape)
                .clickable {
                }
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = userName,
                    color = Color(R.color.gray_10),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "28/06/23",
                    color = Color(R.color.gray_500),
                    fontSize = 12.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = message, color = Color(R.color.gray_500))
                Text(
                    text = (1..19).random().toString(),
                    color = Color.White,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color(0xFF118385))
                        .padding(5.dp)
                )
            }
        }
    }
}

@Composable
fun ImageViewer() {
    Box(modifier = Modifier) {

    }
}

@Composable
fun MyStatusComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Box(contentAlignment = Alignment.BottomEnd) {
            Image(
                painter = painterResource(id = R.drawable.pro_095d2b032a754346b4bd84fa3ded5bff_jpg_1200w_1200h_1s),
                contentDescription = "user",
                modifier = Modifier
                    .size(52.dp)
                    .clip(CircleShape)
                    .clickable {
                    }
            )
            Box(
                modifier = Modifier
                    .background(Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                Box(modifier = Modifier
                    .size(20.dp)
                    .background(Color.White, ShapeDefaults.ExtraLarge))
                Icon(
                    painter = painterResource(R.drawable.add_48px),
                    contentDescription = "Add",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(16.dp)
                        .background(Color(0xFF118385)),
                    tint = Color.White

                )
            }
        }

        Spacer(modifier = Modifier.width(12.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "My status",
                    color = Color(R.color.gray_10),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Tap to add status update",
                    color = Color(R.color.gray_500),
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
fun HeaderComponent() {
    val camera = painterResource(id = R.drawable.photo_camera_48px)
    val search = painterResource(id = R.drawable.search_48px)
    val more = painterResource(id = R.drawable.more_vert_48px)
    val group = painterResource(id = R.drawable.groups_48px)

    Column(
        modifier = Modifier
            .background(Color(0xFF118385))
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "WhatsApp",
                fontFamily = FontFamily.SansSerif,
                fontSize = 28.sp,
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .padding(start = 12.dp),
                color = Color.White
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = camera,
                    contentDescription = "more",
                    tint = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .size(28.dp)
                )
                Icon(
                    painter = search,
                    contentDescription = "camera",
                    tint = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .size(28.dp)
                )
                Icon(
                    painter = more,
                    contentDescription = "search",
                    tint = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .size(28.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(
                painter = group,
                contentDescription = "group",
                tint = Color.White,
                modifier = Modifier
                    .size(32.dp)
            )
            Text(
                text = "Chats",
                color = Color.White, fontFamily = FontFamily.SansSerif,
            )
            Text(
                text = "Status",
                color = Color.White,
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Calls",
                color = Color.White,
                fontFamily = FontFamily.SansSerif
            )

        }
    }
}


@Composable
fun StatusComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Box(contentAlignment = Alignment.BottomEnd) {
            Image(
                painter = painterResource(id = R.drawable.pro_0b36fe3068c6474aa8bddd33a48c272b_jpg_1200w_1200h_1s),
                contentDescription = "user",
                modifier = Modifier
                    .size(52.dp)
                    .clip(CircleShape)
                    .clickable {
                    }
            )
        }

        Spacer(modifier = Modifier.width(12.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Miley",
                    color = Color(R.color.gray_10),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "23 minutes ago",
                    color = Color(R.color.gray_500),
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderComponentPreview() {
    MaterialTheme {
        HeaderComponent()
    }
}

@Preview(showBackground = true)
@Composable
fun MyStatusComponentPreview() {
    MaterialTheme {
        MyStatusComponent()
    }
}

@Preview(showBackground = true)
@Composable
fun StatusComponentPreview() {
    MaterialTheme{
        StatusComponent()
    }

}

@Preview(showBackground = true)
@Composable
fun WhatsAppLayoutPreview() {
    WhatsappRunTheme {
        WhatsAppLayout()
        factorielle(5)
    }
}
fun factorielle(n: Int): Long {
    if (n == 0) {
        return 1
    }
    return n * factorielle(n - 1)
}


