package com.example.currencyconverter.ui.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.currencyconverter.data.ItemAnalyticsModel
import com.example.currencyconverter.theme.Dimens

@Composable
fun ItemAnalyticsScreen(item: ItemAnalyticsModel) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimens._8),
        shape = RoundedCornerShape(Dimens._16),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = Dimens._4)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(Dimens._8)
                    .padding(start = 4.dp),
                horizontalAlignment = Alignment.Start
            ) {

                    item.nameCurrency?.let {
                        Text(
                            text = it,
                            color = Color.Black,
                            fontSize = 18.sp
                        )
                    }

                Text(
                    text = "${item.codCurrency }/RUB: ${item.exchangeRate }",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
            item.result?.let {
                Text(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(Dimens._8)
                        .padding(end = 4.dp),
                    text = it.toString(),
                    color = Color.Black,
                    fontSize = 18.sp, textAlign = TextAlign.End
                )
            }
        }
    }
}