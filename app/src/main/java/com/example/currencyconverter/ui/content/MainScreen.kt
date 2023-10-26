package com.example.currencyconverter.ui.content

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
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
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.currencyconverter.R
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.theme.ButtonColors
import com.example.currencyconverter.theme.Dimens
import com.example.currencyconverter.theme.FontSizes
import com.example.currencyconverter.theme.Purple40
import com.example.currencyconverter.theme.Purple80
import com.example.currencyconverter.ui.viewModel.HomeViewModel
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun MainScreen(context: Context, viewModel: HomeViewModel, db: List<Currencies>) {

//    val test by viewModel.valuesData.observeAsState()
//    val uiState by viewModel._valuesData.collectAsState("")

    val coroutine = rememberCoroutineScope()
    val keyboardController = LocalSoftwareKeyboardController.current
    val myList = listOf(
        "Выберите валюту",
        db.find { it.charCode == "AED" }?.let { it.name },
        db.find { it.charCode == "AMD" }?.let { it.name },
        db.find { it.charCode == "AUD" }?.let { it.name },
        db.find { it.charCode == "AZN" }?.let { it.name },
        db.find { it.charCode == "BGN" }?.let { it.name },
        db.find { it.charCode == "BRL" }?.let { it.name },
        db.find { it.charCode == "BYN" }?.let { it.name },
        db.find { it.charCode == "CAD" }?.let { it.name },
        db.find { it.charCode == "CHF" }?.let { it.name },
        db.find { it.charCode == "CNY" }?.let { it.name },
        db.find { it.charCode == "CZK" }?.let { it.name },
        db.find { it.charCode == "DKK" }?.let { it.name },
        db.find { it.charCode == "EGP" }?.let { it.name },
        db.find { it.charCode == "EUR" }?.let { it.name },
        db.find { it.charCode == "GEL" }?.let { it.name },
        db.find { it.charCode == "HKD" }?.let { it.name },
        db.find { it.charCode == "HUF" }?.let { it.name },
        db.find { it.charCode == "IDR" }?.let { it.name },
        db.find { it.charCode == "INR" }?.let { it.name },
        db.find { it.charCode == "JPY" }?.let { it.name },
        db.find { it.charCode == "KGS" }?.let { it.name },
        db.find { it.charCode == "KRW" }?.let { it.name },
        db.find { it.charCode == "KZT" }?.let { it.name },
        db.find { it.charCode == "MDL" }?.let { it.name },
        db.find { it.charCode == "NOK" }?.let { it.name },
        db.find { it.charCode == "NZD" }?.let { it.name },
        db.find { it.charCode == "PLN" }?.let { it.name },
        db.find { it.charCode == "QAR" }?.let { it.name },
        db.find { it.charCode == "RON" }?.let { it.name },
        db.find { it.charCode == "RSD" }?.let { it.name },
        db.find { it.charCode == "SEK" }?.let { it.name },
        db.find { it.charCode == "SGD" }?.let { it.name },
        db.find { it.charCode == "THB" }?.let { it.name },
        db.find { it.charCode == "TJS" }?.let { it.name },
        db.find { it.charCode == "TMT" }?.let { it.name },
        db.find { it.charCode == "TRY" }?.let { it.name },
        db.find { it.charCode == "UAH" }?.let { it.name },
        db.find { it.charCode == "USD" }?.let { it.name },
        db.find { it.charCode == "UZS" }?.let { it.name },
        db.find { it.charCode == "VND" }?.let { it.name },
        db.find { it.charCode == "ZAR" }?.let { it.name }
    )

    val listСurrencyOne = myList
    val expandedOne = remember { mutableStateOf(false) }
    val currentValueOne = remember { mutableStateOf(listСurrencyOne[0]) }
    var textOne by remember { mutableStateOf("") }


    val listСurrencyTow = myList
    val expandedTow = remember { mutableStateOf(false) }
    val currentValueTow = remember { mutableStateOf(listСurrencyTow[0]) }
    var textTow by remember { mutableStateOf("") }


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
//                .height(Dimens._500)
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
                        .padding(Dimens._8),
                    colors = CardDefaults.cardColors(Purple40)
                ) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            modifier = Modifier.padding(Dimens._4),
                            text = stringResource(R.string.currency_converter),
                            color = Color.Black,
                            fontSize = FontSizes._24
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(Dimens._156)
                        .padding(Dimens._8),
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = Dimens._12),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Row(modifier = Modifier.clickable {
                                expandedOne.value = !expandedOne.value
                            }, verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = currentValueOne.value.toString(),
                                    fontSize = FontSizes._18,
                                    color = Color.Black
                                )
                                Icon(
                                    imageVector = Icons.Filled.ArrowDropDown,
                                    contentDescription = null
                                )
                                DropdownMenu(expanded = expandedOne.value,
                                    onDismissRequest = { expandedOne.value = false }) {
                                    listСurrencyOne.forEach {
                                        DropdownMenuItem(
                                            text = { Text(text = it.toString()) },
                                            onClick = {
                                                currentValueOne.value = it
                                                expandedOne.value = false

                                                coroutine.launch {
                                                    if (it != null) {
                                                        viewModel.searchFromVal(it)
                                                    }
                                                }
                                                coroutine.launch {
                                                    if (it != null) {
                                                        viewModel.searchValueFromVal(it)
                                                    }
                                                }
                                            },
                                            modifier = Modifier.background(Color.White),
                                        )
                                    }
                                }
                            }
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(Dimens._8),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Text(
                                text = viewModel.setCurrencyNameFromVal(),
                                fontSize = FontSizes._24,
                                color = Color.Black
                            )
                            OutlinedTextField(value = textOne,
                                onValueChange = { textOne = it },

                                modifier = Modifier.width(Dimens._240),
                                textStyle = androidx.compose.ui.text.TextStyle(
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
                                    Icon(Icons.Default.Clear,
                                        contentDescription = "clear text",
                                        modifier = Modifier
                                            .clickable {
                                                textOne = ""
                                            }
                                    )
                                }
                            )
                        }
                    }
                }


                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(Dimens._156)
                        .padding(Dimens._8)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Purple80)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = Dimens._12),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Row(modifier = Modifier.clickable {
                                expandedTow.value = !expandedTow.value
                            }, verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = currentValueTow.value.toString(),
                                    fontSize = FontSizes._18,
                                    color = Color.Black
                                )
                                Icon(
                                    imageVector = Icons.Filled.ArrowDropDown,
                                    contentDescription = null
                                )
                                DropdownMenu(expanded = expandedTow.value,
                                    onDismissRequest = { expandedTow.value = false }) {
                                    listСurrencyTow.forEach {
                                        DropdownMenuItem(
                                            text = { Text(text = it.toString()) },
                                            onClick = {
                                                currentValueTow.value = it
                                                expandedTow.value = false

                                            coroutine.launch {
                                                if (it != null) {
                                                    viewModel.searchToVal(it)
                                                }
                                            }
                                            coroutine.launch {
                                                if (it != null) {
                                                    viewModel.searchValueToVal(it)
                                                }
                                            }

                                            },
                                            modifier = Modifier.background(Color.White)
                                        )
                                    }
                                }

                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Text(
                                text = viewModel.setCurrencyNameToVal(),
                                fontSize = FontSizes._24,
                                color = Color.Black
                            )
                            OutlinedTextField(value = textTow,
                                onValueChange = { textTow = it },
                                modifier = Modifier.width(Dimens._240),
                                textStyle = androidx.compose.ui.text.TextStyle(
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
                                    Icon(Icons.Default.Clear,
                                        contentDescription = "clear text",
                                        modifier = Modifier
                                            .clickable {
                                                textTow = ""
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
                        .padding(top = Dimens._36, bottom = Dimens._36),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = {
                            coroutine.launch {
                                textTow = if (textOne > 0.toString()) {
                                    val result = textOne
                                    val resultFinish = viewModel.recalculatingValues(result)
                                    String.format("%.3f", resultFinish)
                                } else "0"
                            }
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
    }
}




