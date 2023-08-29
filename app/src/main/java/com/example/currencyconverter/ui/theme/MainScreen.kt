package com.example.currencyconverter.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle
import java.time.temporal.TemporalQueries.offset

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun MainScreen() {
    val listСurrencyOne = listOf("USD", "EUR", "JPY", "GBP", "AUD", "CHF", "RUB")
    val expandedOne = remember { mutableStateOf(false) }
    val currentValueOne = remember { mutableStateOf(listСurrencyOne[0]) }
    var textOne by remember { mutableStateOf("") }

    val listСurrencyTow = listOf("USD", "EUR", "JPY", "GBP", "AUD", "CHF", "RUB")
    val expandedTow = remember { mutableStateOf(false) }
    val currentValueTow = remember { mutableStateOf(listСurrencyTow[0]) }
    var textTow by remember { mutableStateOf("") }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(Dimens._500)
            .padding(Dimens._8),
        shape = RoundedCornerShape(Dimens._16),
        elevation = CardDefaults.cardElevation(defaultElevation = Dimens._4)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens._8),
                colors = CardDefaults.cardColors(Purple40)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        modifier = Modifier
                            .padding(Dimens._4),
                        text = "Currency",
                        fontSize = 24.sp
                    )
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(Dimens._150)
                    .padding(Dimens._8),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Surface(modifier = Modifier.fillMaxSize()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(Dimens._8)
                                .padding(start = Dimens._20)
                                .padding(end = Dimens._20), contentAlignment = Alignment.CenterStart
                        ) {
                            Row(modifier = Modifier.clickable {
                                expandedOne.value = !expandedOne.value
                            }, verticalAlignment = Alignment.CenterVertically) {
                                Text(text = currentValueOne.value, fontSize = 24.sp, color = Color.Black)
                                Icon(
                                    imageVector = Icons.Filled.ArrowDropDown,
                                    contentDescription = null
                                )
                                DropdownMenu(
                                    expanded = expandedOne.value,
                                    onDismissRequest = { expandedOne.value = false }) {
                                    listСurrencyOne.forEach {
                                        DropdownMenuItem(
                                            text = { Text(text = it) },
                                            onClick = {
                                                currentValueOne.value = it
                                                expandedOne.value = false
                                            })
                                    }
                                }
                                Box(
                                    contentAlignment = Alignment.CenterEnd,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    OutlinedTextField(
                                        value = textOne,
                                        onValueChange = { textOne = it },
                                        modifier = Modifier
                                            .width(Dimens._150),
                                        textStyle = androidx.compose.ui.text.TextStyle(fontSize = 24.sp),
                                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                        colors = TextFieldDefaults.outlinedTextFieldColors(
                                            focusedBorderColor = Color.White,
                                            unfocusedBorderColor = Color.White,
                                            textColor = Color.Black
                                        ),
                                        placeholder = { Text("0") }


                                    )
                                }


                            }

                        }

                    }
                }

            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(Dimens._150)
                    .padding(Dimens._8),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Surface(modifier = Modifier.fillMaxSize(), color = Purple80) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(Dimens._8)
                                .padding(start = Dimens._20)
                                .padding(end = Dimens._20), contentAlignment = Alignment.CenterStart
                        ) {
                            Row(modifier = Modifier.clickable {
                                expandedTow.value = !expandedTow.value
                            }, verticalAlignment = Alignment.CenterVertically) {
                                Text(text = currentValueTow.value, fontSize = 24.sp, color = Color.Black)
                                Icon(
                                    imageVector = Icons.Filled.ArrowDropDown,
                                    contentDescription = null
                                )
                                DropdownMenu(
                                    expanded = expandedTow.value,
                                    onDismissRequest = { expandedTow.value = false }) {
                                    listСurrencyTow.forEach {
                                        DropdownMenuItem(
                                            text = { Text(text = it) },
                                            onClick = {
                                                currentValueTow.value = it
                                                expandedTow.value = false
                                            })
                                    }
                                }
                                Box(
                                    contentAlignment = Alignment.CenterEnd,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    OutlinedTextField(
                                        value = textTow,
                                        onValueChange = { textTow = it },
                                        modifier = Modifier
                                            .width(Dimens._150),
                                        textStyle = androidx.compose.ui.text.TextStyle(fontSize = 24.sp),
                                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                        colors = TextFieldDefaults.outlinedTextFieldColors(
                                            focusedBorderColor = Color.White,
                                            unfocusedBorderColor = Color.White,
                                            textColor = Color.Black
                                        ),
                                        placeholder = { Text("0") }


                                    )
                                }


                            }

                        }

                    }
                }

            }
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(320.dp),
                    colors = ButtonDefaults.buttonColors(ButtonColors)
                ) {
                    Text("CONVERT", fontSize = 25.sp)

                }

            }


        }


    }
}