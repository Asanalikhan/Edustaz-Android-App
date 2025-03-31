package com.example.edustaz.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.edustaz.R
import com.example.edustaz.data.MaterialItem

@Composable
fun InfiniteMaterialList(materials: List<MaterialItem>) {
    var startIndex by remember { mutableStateOf(0) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        // Left Button
        IconButton(onClick = {
            startIndex = (startIndex - 1 + materials.size) % materials.size
        }, modifier = Modifier.width(25.dp)) {
            Icon(
                painter = painterResource(R.drawable.baseline_keyboard_arrow_left_24),
                contentDescription = "Previous"
            )
        }

        // Content Row (Static Display)
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            MaterialCard(materials[startIndex % materials.size])
            MaterialCard(materials[(startIndex + 1) % materials.size])
        }

        // Right Button
        IconButton(onClick = {
            startIndex = (startIndex + 1) % materials.size
        }, modifier = Modifier.width(25.dp)) {
            Icon(
                painter = painterResource(R.drawable.baseline_keyboard_arrow_right_24),
                contentDescription = "Next"
            )
        }
    }
}
