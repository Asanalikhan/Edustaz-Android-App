package com.example.edustaz.ui.screen.materials

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edustaz.R
import com.example.edustaz.data.model.MaterialItem
import com.example.edustaz.ui.components.BlueButtons
import com.example.edustaz.ui.components.Button
import com.example.edustaz.ui.components.InfiniteMaterialList
import com.example.edustaz.ui.theme.MontserratFont

private val sampleMaterials = listOf(
    MaterialItem(
        "Балалардың сауат ашу деңгейі", "Сәкен Серікұлы", 713, 713
    ),
    MaterialItem("Қысқаша көбейту формулалары", "Сәкен Серікұлы", 1024, 1500),
    MaterialItem("Математикалық логика негіздері", "Айжан Баймұратова", 530, 870),
    MaterialItem("Физикалық заңдар", "Жандос Мұхаммед", 420, 690),
    MaterialItem("Абайдың қара сөздері", "Айгүл Нұрбекова", 860, 1020)
)

@Composable
fun MaterialsDetailed(id: Int, onBackClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            IconButton(
                modifier = Modifier
                    .padding(start = 10.dp),
                onClick = {
                    onBackClick()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
            }
            Text(
                "Үздік материалдар",
                fontFamily = MontserratFont,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                modifier = Modifier
                    .padding(0.dp, 13.dp, 60.dp, 0.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        InfiniteMaterialList(materials = sampleMaterials)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 9.dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(5.dp)
                ),
        ) {
            Text(
                text = "Kysqasha",
                modifier = Modifier
                    .padding(start = 15.dp, top = 10.dp),
                color = Color.Green,
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Medium,
                fontSize = 17.sp
            )
            Text(
                text = "alsdhflasdflkasdflhalsdjflashdgihflaishdglahsdljfhlihasldhlaskhdglasidhfaskgdhf;kalsdkjf;lj",
                modifier = Modifier
                    .padding(start = 15.dp, top = 22.dp, end = 15.dp),
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
            )
            Text(
                text = "Автор:",
                modifier = Modifier
                    .padding(start = 22.dp, top = 10.dp),
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp
            )
            Row(
                modifier = Modifier
                    .padding(22.dp, 0.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.frame_12645),
                    contentDescription = "Author"
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Saken Serikuly",
                    fontFamily = MontserratFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 15.sp,
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(R.drawable.arrow_download),
                            contentDescription = "Downloads",
                            tint = Color.Gray,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "321",
                            fontFamily = MontserratFont,
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp,
                            color = Color(0xFF9E9E9E)
                        )
                    }
                    Spacer(modifier = Modifier.width(7.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(R.drawable.fi_eye),
                            contentDescription = "Views",
                            tint = Color.Gray,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "123",
                            fontFamily = MontserratFont,
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp,
                            color = Color(0xFF9E9E9E)
                        )
                    }
                }
            }

            BlueButtons(listOf("asdfasdf", "asdfasdf", "as"))

            Box(
                modifier = Modifier
                    .padding(20.dp, 0.dp)
            ) {
                Button(
                    onClick = {},
                    text = "Тегін жүктеу"
                )
            }
            Spacer(modifier = Modifier.height(13.dp))

        }

    }
}