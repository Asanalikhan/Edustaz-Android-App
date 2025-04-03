package com.example.edustaz.ui.screen.olympiad

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.edustaz.ui.components.CustomSwitch
import com.example.edustaz.ui.components.OlympiadGrid
import com.example.edustaz.ui.navigation.BottomNavBar
import com.example.edustaz.ui.navigation.TopAppBar

@Composable
fun OlympiadPage(
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
        },
        bottomBar = {
            BottomNavBar(
                navController = navController,
                onItemClick = {
                    navController.navigate(it.route)
                }
            )
        }
    ) { values ->

        var selectedType by remember { mutableStateOf("Ұстаздарға") }
        var selectedOption by remember { mutableStateOf<String?>(null) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(values)
                .background(Color(0xFFF5F5F5))
        ) {
            CustomSwitch(
                selectedOption = selectedType,
                onOptionSelected = { selectedType = it }
            )

            if (selectedOption == null) {
                OlympiadGrid(
                    onItemClick = {
                        selectedOption = it
                    }
                )
            } else {
                OlympiadDetailed(
                    subject = selectedOption!!,
                    type = selectedType == "Ұстаздарға",
                    onBack = {selectedOption = null}
                )
            }
        }
    }
}