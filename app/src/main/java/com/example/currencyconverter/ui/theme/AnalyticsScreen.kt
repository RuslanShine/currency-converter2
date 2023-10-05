package com.example.currencyconverter.ui.theme

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.viewModel.AnalyticsViewModel


@Composable
fun AnalyticsScreen(context: Context, viewModel: AnalyticsViewModel, db: Currencies) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .background(Color.Black), contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Fragment", color = Color.White, fontSize = 24.sp
        )

    }
}