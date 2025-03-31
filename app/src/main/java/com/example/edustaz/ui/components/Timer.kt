package com.example.edustaz.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.edustaz.ui.theme.MontserratFont

@Composable
fun Timer() {
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White)
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
        ) {
            val (title, description, time) = createRefs()

            Text(
                text = "Наурыз айының зияткерлік олимпиадасы",
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.Green,
                modifier = Modifier.constrainAs(title) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )

            Text(
                text = "Олимпиаданың бітуіне қалды",
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier.constrainAs(description) { // ✅ Unique reference
                    top.linkTo(title.bottom, margin = 9.dp)
                    start.linkTo(parent.start)
                }
            )
        }
    }
}
