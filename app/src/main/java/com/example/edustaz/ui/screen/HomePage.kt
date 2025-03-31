package com.example.edustaz.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edustaz.R
import com.example.edustaz.data.MaterialItem
import com.example.edustaz.ui.components.GridScreen
import com.example.edustaz.ui.components.InfiniteMaterialList
import com.example.edustaz.ui.components.Timer
import com.example.edustaz.ui.theme.MontserratFont

val sampleMaterials = listOf(
    MaterialItem(
        "Балалардың сауат ашу деңгейі",
        "Сәкен Серікұлы",
        713,
        713
    ),
    MaterialItem("Қысқаша көбейту формулалары", "Сәкен Серікұлы", 1024, 1500),
    MaterialItem("Математикалық логика негіздері", "Айжан Баймұратова", 530, 870),
    MaterialItem("Физикалық заңдар", "Жандос Мұхаммед", 420, 690),
    MaterialItem("Абайдың қара сөздері", "Айгүл Нұрбекова", 860, 1020)
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    onNavigateBack: () -> Unit,
    title: String
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = title,
                        fontFamily = MontserratFont,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 22.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /*Todo*/ }, modifier = Modifier.padding(42.dp)) {
                        Icon(
                            painter = painterResource(R.drawable.frame_12645),
                            contentDescription = "Home"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*Todo*/ }, modifier = Modifier.padding(42.dp)) {
                        Icon(
                            painter = painterResource(R.drawable.mi_notification),
                            contentDescription = "Notification"
                        )
                    }
                }
            )
        }) { values ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(values)
                .background(Color(0xFFF5F5F5))
        ) {
            Text(
                "Үздік материалдар",
                fontFamily = MontserratFont,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(0.dp, 13.dp, 0.dp, 0.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            InfiniteMaterialList(materials = sampleMaterials)
            GridScreen()
            Spacer(modifier = Modifier.height(17.dp))
            Timer()
        }
    }
}

