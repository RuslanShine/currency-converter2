package com.example.currencyconverter.ui.content

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.animation.splineBasedDecay
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.currencyconverter.R
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.theme.ButtonColors
import com.example.currencyconverter.theme.Dimens
import com.example.currencyconverter.theme.FontSizes
import com.example.currencyconverter.theme.Purple40
import com.example.currencyconverter.ui.viewModel.AnalyticsViewModel
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun AnalyticsScreen(context: Context, viewModel: AnalyticsViewModel, db: Currencies) {

    var valueCurrencyRub by remember { mutableStateOf("") }
    var valueCurrencyResult by remember { mutableStateOf("") }
    val coroutine = rememberCoroutineScope()
    val keyboardController = LocalSoftwareKeyboardController.current
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dimens._8),
            shape = RoundedCornerShape(Dimens._16),
            elevation = CardDefaults.cardElevation(defaultElevation = Dimens._4)
        ) {
            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .background(Color.White)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(Dimens._8), colors = CardDefaults.cardColors(Purple40)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            modifier = Modifier.padding(Dimens._4),
                            text = "Конвертер росссийского рубля",
                            color = Color.Black,
                            fontSize = FontSizes._24,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(Dimens._156)
                        .padding(Dimens._8)
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = Dimens._12, bottom = 4.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Text(
                                text = "Введите количество средств:",
                                fontSize = 18.sp,
                                color = Color.Black
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(Dimens._8),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Text(
                                text = "RUB",
                                fontSize = FontSizes._24,
                                color = Color.Black
                            )
                            OutlinedTextField(value = valueCurrencyRub,
                                onValueChange = { valueCurrencyRub = it },

                                modifier = Modifier.width(Dimens._240),
                                textStyle = TextStyle(
                                    fontSize = FontSizes._24
                                ),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                    focusedBorderColor = Color.White,
                                    unfocusedBorderColor = Color.White,
                                    textColor = Color.Black
                                ),
                                placeholder = { Text("0") },
                                trailingIcon = {
                                    Icon(
                                        Icons.Default.Clear,
                                        contentDescription = "clear text",
                                        modifier = Modifier
                                            .clickable {
                                                valueCurrencyRub = ""
                                            }
                                    )
                                }
                            )
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = Dimens._8, bottom = Dimens._16),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = {
//                                    coroutine.launch {
//                                        valueCurrencyResult = if (valueCurrencyRub > 0.toString()) {
//                                            val result = valueCurrencyRub
//                                            val resultFinish = viewModel.recalculatingValues(result)
//                                            String.format("%.3f", resultFinish)
//                                        } else "0"
//                                    }
                            keyboardController?.hide()
                            Toast.makeText(context, "Конвертация", Toast.LENGTH_SHORT).show()
                        },
                        modifier = Modifier.width(Dimens._320),
                        colors = ButtonDefaults.buttonColors(ButtonColors)
                    ) {
                        Text("CONVERT", fontSize = FontSizes._24)

                    }
                }

            }

        }


        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimens._8)
        ) {
            itemsIndexed(
                listOf("1", "2", "2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2",)
            ) { _, item ->
                ItemAnalyticsScreen( )
            }
        }


    }

}