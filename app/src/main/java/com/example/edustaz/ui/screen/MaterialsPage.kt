package com.example.edustaz.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.edustaz.ui.components.TopAppBar
import com.example.edustaz.ui.navigation.BottomNavBar
import com.example.edustaz.ui.theme.MontserratFont

@Composable
fun MaterialsPage(
    title: String,
    navController: NavController
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            TopAppBar(
                title = title,
                navController = navController
            )
        }, bottomBar = {
            BottomNavBar(
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
        ) {

            Text(
                "Оқу әдістемелік материалдар",
                fontFamily = MontserratFont,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
            )


        }
    }

}