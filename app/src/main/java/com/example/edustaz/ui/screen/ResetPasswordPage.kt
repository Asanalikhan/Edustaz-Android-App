package com.example.edustaz.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.edustaz.ui.components.Button
import com.example.edustaz.ui.components.EmailTextField

@Composable
fun ResetPasswordPage(onNavigateBack : () -> Unit) {
    var email by remember { mutableStateOf("") }
    var isSubmitted by remember { mutableStateOf(false) }

    Column(
        Modifier
            .fillMaxSize()
            .padding(20.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (!isSubmitted) {
            Text(
                "Почтаңызды енгізіңіз",
                style = MaterialTheme.typography.titleLarge.copy(
                    color = Color.Black,
                )
            )
            Text(
                "Почтаңызға құпия сөзіңіз жіберіледі",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color.Gray
                )
            )
            Spacer(modifier = Modifier.padding(0.dp, 16.dp))
            EmailTextField(email = email, onEmailChange = { email = it })
            Spacer(modifier = Modifier.padding(0.dp, 24.dp))
            Button(onClick = { isSubmitted = true }, text = "Жөнелту")
        } else {
            Text(
                "Смс жіберілді",
                style = MaterialTheme.typography.titleLarge.copy(
                    color = Color.Black,
                )
            )
            Text(
                "Смсты таппасаңыз “Спам” папкасын қараңыз.\n" +
                        "Еш қиындықсыз мобильді қосымшамызды қолдана беріңіз!",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.padding(0.dp, 24.dp))
            Button(onClick = { onNavigateBack() }, text = "Ары қарай болдыру")
        }
    }
}
