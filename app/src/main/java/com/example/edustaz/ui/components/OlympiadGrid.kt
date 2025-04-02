package com.example.edustaz.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
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
import com.example.edustaz.ui.theme.MontserratFont

private val titles = listOf(
    "Тарих",
    "Жаратылыстану",
    "География",
    "Информатика",
    "Биология",
    "Физика",
    "Бастауыш сынып",
    "Музыка",
    "Психология",
    "Дене шынықтыру",
    "Қазақ тілі",
    "Орыс тілі",
    "Әскери дайындық",
    "Педагогика",
    "Құқық"
)
private val images = listOf(
    R.drawable.ic_atestat,
    R.drawable.ic_course,
    R.drawable.ic_materials,
    R.drawable.ic_olympiad,
    R.drawable.ic_atestat,
    R.drawable.ic_course,
    R.drawable.ic_materials,
    R.drawable.ic_olympiad,
    R.drawable.ic_atestat,
    R.drawable.ic_course,
    R.drawable.ic_materials,
    R.drawable.ic_olympiad,
    R.drawable.ic_atestat,
    R.drawable.ic_course,
    R.drawable.ic_materials,
)

@Composable
fun OlympiadGrid() {

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        items(titles.zip(images)) { (title, icon) ->
            GridItem(iconRes = icon, text = title)
        }
    }
}

@Composable
private fun GridItem(iconRes: Int, text: String) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .size(110.dp)
            .padding(7.dp)
            .background(Color.White),
        shape = RoundedCornerShape(5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(6.dp)
        ) {

            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = "Icon",
                modifier = Modifier
                    .size(55.dp)
                    .align(alignment = Alignment.Start)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = text,
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}