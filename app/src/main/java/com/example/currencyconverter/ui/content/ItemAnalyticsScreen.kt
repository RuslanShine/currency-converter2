package com.example.currencyconverter.ui.content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.currencyconverter.theme.Dimens
import com.example.currencyconverter.theme.FontSizes
import com.example.currencyconverter.theme.Purple40

@Composable
fun ItemAnalyticsScreen() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimens._8),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
        ) {
            Box(contentAlignment = Alignment.CenterEnd) {
                Text(
                    text = "1234567",
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                Text(
                    text = "Казахстанский тенге",
                    color = Color.Black,
                    fontSize = 18.sp
                )
                Text(
                    text = "USD/RUB:13.23", fontSize = 14.sp,
                    color = Color.Black
                )
            }

        }

    }
}