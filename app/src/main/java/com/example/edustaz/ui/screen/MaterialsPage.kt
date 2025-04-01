package com.example.edustaz.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
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
import com.example.edustaz.ui.navigation.BottomNavBar
import com.example.edustaz.ui.theme.MontserratFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MaterialsPage(
    title: String,
    navController: NavController
) {

    Scaffold(modifier = Modifier
        .fillMaxSize()
        .background(Color.White), topBar = {
        CenterAlignedTopAppBar(
            title = {
            Text(
                text = title,
                fontFamily = MontserratFont,
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp
            )
        }, navigationIcon = {
            IconButton(onClick = {/*Todo*/ }, Modifier.padding(45.dp, 0.dp, 0.dp, 0.dp)) {
                Icon(
                    painter = painterResource(R.drawable.frame_12645),
                    contentDescription = "Home"
                )
            }
        }, actions = {
            IconButton(onClick = {/*Todo*/ }, Modifier.padding(0.dp, 0.dp, 45.dp, 0.dp)) {
                Icon(
                    painter = painterResource(R.drawable.mi_notification),
                    contentDescription = "Notification"
                )
            }
        },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.White)
        )
    }, bottomBar = {
        BottomNavBar(
            items = navItems,
            navController = navController,
            onItemClick = {
                navController.navigate(it.route)
            }
        )
    }
    ) { values ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(values)
                .background(Color(0xFFF5F5F5))
        ) {}
    }

}