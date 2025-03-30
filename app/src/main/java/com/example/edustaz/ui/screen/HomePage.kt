package com.example.edustaz.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.edustaz.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    onNavigateBack : () -> Unit,
    title: String)  {

    Scaffold(modifier = Modifier.fillMaxSize().padding(42.dp, 0.dp),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = title)
                },
                navigationIcon = {
                    IconButton(onClick = { /*Todo*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.frame_12645),
                            contentDescription = "Home"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*Todo*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.mi_notification),
                            contentDescription = "Notification"
                        )
                    }
                }
            )
        }){
        values ->
        LazyColumn(modifier = Modifier.fillMaxSize().padding(values)) {

        }
    }
}

