package com.example.edustaz.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edustaz.ui.theme.MontserratFont

@Composable
fun NumberedList() {
    val items = listOf(
        "Қатысушының аты-жөнін енгізіңіз (Бірнеше қатысушы болса барлығының аты-жөнін жазыңыз)",
        "Тестті бастау батырмасын басып тест тапсырыңыз (Басқа қолданушыға көмек ретінде тіркесеңіз қатысу кодын беріңіз. Өзі код арқылы тапсыра алады)",
        "Марапатты жүктеп алыңыз (Қатысушы тест біткен соң нәтижесі шыққан беттен өзі жүктеп алуына болады)"
    )

    Text(
        text = "Қатысу нұсқаулығы",
        fontFamily = MontserratFont,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = Color.Green,
        modifier = Modifier.padding(16.dp, 5.dp)
    )

    Column(modifier = Modifier.padding(16.dp, 0.dp)) {
        items.forEachIndexed { index, text ->
            Row {
                Text(
                    text = "${index + 1}. ",
                    fontFamily = MontserratFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp
                )
                Text(
                    text = text,
                    fontFamily = MontserratFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp
                )
            }
        }
    }

    Spacer(modifier = Modifier.height(10.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            modifier = Modifier
                .weight(1f)
                .height(35.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color(0xFF4741E1)),
            shape = RoundedCornerShape(10.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Код еңгізу",
                    fontFamily = MontserratFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }

        Spacer(modifier = Modifier.width(40.dp))

        Card(
            modifier = Modifier
                .weight(1f)
                .height(35.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color(0xFF4741E1)),
            shape = RoundedCornerShape(10.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Text(
                        text = "Нұстаулықты жүктеу",
                        fontFamily = MontserratFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center,
                    )

                }
            }
        }
    }
}
