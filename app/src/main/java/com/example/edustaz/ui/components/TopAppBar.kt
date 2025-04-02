package com.example.edustaz.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.edustaz.R
import com.example.edustaz.ui.theme.MontserratFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    title: String,
    navController: NavController
) {
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
            IconButton(
                onClick = {/*Todo*/ },
                modifier = Modifier.padding(45.dp, 0.dp, 0.dp, 0.dp),
            ) {
                Icon(
                    painter = painterResource(R.drawable.frame_12645),
                    contentDescription = "Home"
                )
            }
        },
        actions = {
            IconButton(
                onClick = {/*Todo*/ },
                modifier = Modifier.padding(0.dp, 0.dp, 45.dp, 0.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.mi_notification),
                    contentDescription = "Notification"
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.White)
    )
}