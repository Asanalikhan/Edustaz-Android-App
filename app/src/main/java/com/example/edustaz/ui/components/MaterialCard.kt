package com.example.edustaz.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edustaz.R
import com.example.edustaz.data.MaterialItem

@Composable
fun MaterialCard(material: MaterialItem) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(170.dp), // Adjust width for better layout
        shape = RoundedCornerShape(5.dp), // Smoother edges
        colors = CardDefaults.cardColors(containerColor = Color.White), // Light gray background
    ) {
        Column(
            modifier = Modifier.padding(7.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Title
            Text(
                text = material.title,
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF4741E1)
            )

            // Author Row
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    painter = painterResource(R.drawable.frame_12645),
                    contentDescription = "Author",
                    tint = Color.Gray,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = material.author,
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.Black
                )
            }

            // Stats Row (Downloads & Views)
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.arrow_download),
                        contentDescription = "Downloads",
                        tint = Color.Gray,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = material.downloadCount.toString(),
                        style = MaterialTheme.typography.titleSmall,
                        color = Color(0xFF9E9E9E)
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.fi_eye),
                        contentDescription = "Views",
                        tint = Color.Gray,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = material.viewCount.toString(),
                        style = MaterialTheme.typography.titleSmall,
                        color = Color(0xFF9E9E9E)
                    )
                }
            }
        }
    }
}
