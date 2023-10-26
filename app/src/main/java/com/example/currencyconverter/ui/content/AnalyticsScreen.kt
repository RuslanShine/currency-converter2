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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.currencyconverter.data.ItemAnalyticsModel
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.theme.ButtonColors
import com.example.currencyconverter.theme.Dimens
import com.example.currencyconverter.theme.FontSizes
import com.example.currencyconverter.theme.Purple40
import com.example.currencyconverter.ui.viewModel.AnalyticsViewModel

@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun AnalyticsScreen(context: Context, viewModel: AnalyticsViewModel, db: List<Currencies>) {

    var valueCurrencyRub by remember { mutableStateOf("") }
    var valueCurrencyResult by remember { mutableStateOf("") }
    val coroutine = rememberCoroutineScope()
    val keyboardController = LocalSoftwareKeyboardController.current

    var resultAED by remember { mutableStateOf("") }
    var resultAMD by remember { mutableStateOf("") }
    var resultAUD by remember { mutableStateOf("") }
    var resultAZN by remember { mutableStateOf("") }
    var resultBGN by remember { mutableStateOf("") }
    var resultBRL by remember { mutableStateOf("") }
    var resultBYN by remember { mutableStateOf("") }
    var resultCAD by remember { mutableStateOf("") }
    var resultCHF by remember { mutableStateOf("") }
    var resultCNY by remember { mutableStateOf("") }
    var resultCZK by remember { mutableStateOf("") }
    var resultDKK by remember { mutableStateOf("") }
    var resultEGP by remember { mutableStateOf("") }
    var resultEUR by remember { mutableStateOf("") }
    var resultGEL by remember { mutableStateOf("") }
    var resultHKD by remember { mutableStateOf("") }
    var resultHUF by remember { mutableStateOf("") }
    var resultIDR by remember { mutableStateOf("") }
    var resultINR by remember { mutableStateOf("") }
    var resultJPY by remember { mutableStateOf("") }
    var resultKGS by remember { mutableStateOf("") }
    var resultKRW by remember { mutableStateOf("") }
    var resultKZT by remember { mutableStateOf("") }
    var resultMDL by remember { mutableStateOf("") }
    var resultNOK by remember { mutableStateOf("") }
    var resultNZD by remember { mutableStateOf("") }
    var resultPLN by remember { mutableStateOf("") }
    var resultQAR by remember { mutableStateOf("") }
    var resultRON by remember { mutableStateOf("") }
    var resultRSD by remember { mutableStateOf("") }
    var resultSEK by remember { mutableStateOf("") }
    var resultSGD by remember { mutableStateOf("") }
    var resultTHB by remember { mutableStateOf("") }
    var resultTJS by remember { mutableStateOf("") }
    var resultTMT by remember { mutableStateOf("") }
    var resultTRY by remember { mutableStateOf("") }
    var resultUAH by remember { mutableStateOf("") }
    var resultUSD by remember { mutableStateOf("") }
    var resultUZS by remember { mutableStateOf("") }
    var resultVND by remember { mutableStateOf("") }
    var resultZAR by remember { mutableStateOf("") }

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
                        .padding(Dimens._8),
                    colors = CardDefaults.cardColors(Purple40)
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
                            fontSize = FontSizes._22,
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
                                onValueChange = {
                                    valueCurrencyRub = it
                                    viewModel.inputValueRub(it)
                                },
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
                            resultAED = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueAED()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultAMD = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueAMD()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultAUD = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueAUD()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultAZN = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueAZN()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultBGN = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueBGN()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultBRL = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueBRL()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultBYN = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueBYN()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultCAD = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueCAD()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultCHF = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueCHF()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultCNY = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueCNY()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultCZK = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueCZK()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultDKK = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueDKK()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultEGP = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueEGP()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultEUR = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueEUR()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultGEL = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueGEL()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultHKD = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueHKD()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultHUF = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueHUF()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultIDR = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueIDR()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultINR = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueINR()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultJPY = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueJPY()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultKGS = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueKGS()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultKRW = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueKRW()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultKZT = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueKZT()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultMDL = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueMDL()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultNOK = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueNOK()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultNZD = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueNZD()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultPLN = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValuePLN()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultQAR = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueQAR()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultRON = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueRON()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultRSD = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueRSD()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultSEK = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueSEK()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultSGD = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueSGD()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultTHB = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueTHB()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultTJS = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueTJS()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultTMT = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueTMT()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultTRY = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueTRY()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultUAH = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueUAH()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultUSD = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueUSD()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultUZS = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueUZS()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultVND = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueVND()
                                String.format("%.3f", resultFinish)
                            } else "0"

                            resultZAR = if (valueCurrencyRub > 0.toString()) {
                                val resultFinish = viewModel.getValueZAR()
                                String.format("%.3f", resultFinish)
                            } else "0"

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
        ) {
            itemsIndexed(
                mutableListOf(
                    ItemAnalyticsModel(db.find { it.charCode == "AED" }?.name, db.find { it.charCode == "AED" }?.charCode, db.find { it.charCode == "AED" }?.value, resultAED),
                    ItemAnalyticsModel(db.find { it.charCode == "AMD" }?.name, db.find { it.charCode == "AMD" }?.charCode, db.find { it.charCode == "AMD" }?.value, resultAMD),
                    ItemAnalyticsModel(db.find { it.charCode == "AUD" }?.name, db.find { it.charCode == "AUD" }?.charCode, db.find { it.charCode == "AUD" }?.value, resultAUD),
                    ItemAnalyticsModel(db.find { it.charCode == "AZN" }?.name, db.find { it.charCode == "AZN" }?.charCode, db.find { it.charCode == "AZN" }?.value, resultAZN),
                    ItemAnalyticsModel(db.find { it.charCode == "BGN" }?.name, db.find { it.charCode == "BGN" }?.charCode, db.find { it.charCode == "BGN" }?.value, resultBGN),
                    ItemAnalyticsModel(db.find { it.charCode == "BRL" }?.name, db.find { it.charCode == "BRL" }?.charCode, db.find { it.charCode == "BRL" }?.value, resultBRL),
                    ItemAnalyticsModel(db.find { it.charCode == "BYN" }?.name, db.find { it.charCode == "BYN" }?.charCode, db.find { it.charCode == "BYN" }?.value, resultBYN),
                    ItemAnalyticsModel(db.find { it.charCode == "CAD" }?.name, db.find { it.charCode == "CAD" }?.charCode, db.find { it.charCode == "CAD" }?.value, resultCAD),
                    ItemAnalyticsModel(db.find { it.charCode == "CHF" }?.name, db.find { it.charCode == "CHF" }?.charCode, db.find { it.charCode == "CHF" }?.value, resultCHF),
                    ItemAnalyticsModel(db.find { it.charCode == "CNY" }?.name, db.find { it.charCode == "CNY" }?.charCode, db.find { it.charCode == "CNY" }?.value, resultCNY),
                    ItemAnalyticsModel(db.find { it.charCode == "CZK" }?.name, db.find { it.charCode == "CZK" }?.charCode, db.find { it.charCode == "CZK" }?.value, resultCZK),
                    ItemAnalyticsModel(db.find { it.charCode == "DKK" }?.name, db.find { it.charCode == "DKK" }?.charCode, db.find { it.charCode == "DKK" }?.value, resultDKK),
                    ItemAnalyticsModel(db.find { it.charCode == "EGP" }?.name, db.find { it.charCode == "EGP" }?.charCode, db.find { it.charCode == "EGP" }?.value, resultEGP),
                    ItemAnalyticsModel(db.find { it.charCode == "EUR" }?.name, db.find { it.charCode == "EUR" }?.charCode, db.find { it.charCode == "EUR" }?.value, resultEUR),
                    ItemAnalyticsModel(db.find { it.charCode == "GEL" }?.name, db.find { it.charCode == "GEL" }?.charCode, db.find { it.charCode == "GEL" }?.value, resultGEL),
                    ItemAnalyticsModel(db.find { it.charCode == "HKD" }?.name, db.find { it.charCode == "HKD" }?.charCode, db.find { it.charCode == "HKD" }?.value, resultHKD),
                    ItemAnalyticsModel(db.find { it.charCode == "HUF" }?.name, db.find { it.charCode == "HUF" }?.charCode, db.find { it.charCode == "HUF" }?.value, resultHUF),
                    ItemAnalyticsModel(db.find { it.charCode == "IDR" }?.name, db.find { it.charCode == "IDR" }?.charCode, db.find { it.charCode == "IDR" }?.value, resultIDR),
                    ItemAnalyticsModel(db.find { it.charCode == "INR" }?.name, db.find { it.charCode == "INR" }?.charCode, db.find { it.charCode == "INR" }?.value, resultINR),
                    ItemAnalyticsModel(db.find { it.charCode == "JPY" }?.name, db.find { it.charCode == "JPY" }?.charCode, db.find { it.charCode == "JPY" }?.value, resultJPY),
                    ItemAnalyticsModel(db.find { it.charCode == "KGS" }?.name, db.find { it.charCode == "KGS" }?.charCode, db.find { it.charCode == "KGS" }?.value, resultKGS),
                    ItemAnalyticsModel(db.find { it.charCode == "KRW" }?.name, db.find { it.charCode == "KRW" }?.charCode, db.find { it.charCode == "KRW" }?.value, resultKRW),
                    ItemAnalyticsModel(db.find { it.charCode == "KZT" }?.name, db.find { it.charCode == "KZT" }?.charCode, db.find { it.charCode == "KZT" }?.value, resultKZT),
                    ItemAnalyticsModel(db.find { it.charCode == "MDL" }?.name, db.find { it.charCode == "MDL" }?.charCode, db.find { it.charCode == "MDL" }?.value, resultMDL),
                    ItemAnalyticsModel(db.find { it.charCode == "NOK" }?.name, db.find { it.charCode == "NOK" }?.charCode, db.find { it.charCode == "NOK" }?.value, resultNOK),
                    ItemAnalyticsModel(db.find { it.charCode == "NZD" }?.name, db.find { it.charCode == "NZD" }?.charCode, db.find { it.charCode == "NZD" }?.value, resultNZD),
                    ItemAnalyticsModel(db.find { it.charCode == "PLN" }?.name, db.find { it.charCode == "PLN" }?.charCode, db.find { it.charCode == "PLN" }?.value, resultPLN),
                    ItemAnalyticsModel(db.find { it.charCode == "QAR" }?.name, db.find { it.charCode == "QAR" }?.charCode, db.find { it.charCode == "QAR" }?.value, resultQAR),
                    ItemAnalyticsModel(db.find { it.charCode == "RON" }?.name, db.find { it.charCode == "RON" }?.charCode, db.find { it.charCode == "RON" }?.value, resultRON),
                    ItemAnalyticsModel(db.find { it.charCode == "RSD" }?.name, db.find { it.charCode == "RSD" }?.charCode, db.find { it.charCode == "RSD" }?.value, resultRSD),
                    ItemAnalyticsModel(db.find { it.charCode == "SEK" }?.name, db.find { it.charCode == "SEK" }?.charCode, db.find { it.charCode == "SEK" }?.value, resultSEK),
                    ItemAnalyticsModel(db.find { it.charCode == "SGD" }?.name, db.find { it.charCode == "SGD" }?.charCode, db.find { it.charCode == "SGD" }?.value, resultSGD),
                    ItemAnalyticsModel(db.find { it.charCode == "THB" }?.name, db.find { it.charCode == "THB" }?.charCode, db.find { it.charCode == "THB" }?.value, resultTHB),
                    ItemAnalyticsModel(db.find { it.charCode == "TJS" }?.name, db.find { it.charCode == "TJS" }?.charCode, db.find { it.charCode == "TJS" }?.value, resultTJS),
                    ItemAnalyticsModel(db.find { it.charCode == "TMT" }?.name, db.find { it.charCode == "TMT" }?.charCode, db.find { it.charCode == "TMT" }?.value, resultTMT),
                    ItemAnalyticsModel(db.find { it.charCode == "TRY" }?.name, db.find { it.charCode == "TRY" }?.charCode, db.find { it.charCode == "TRY" }?.value, resultTRY),
                    ItemAnalyticsModel(db.find { it.charCode == "UAH" }?.name, db.find { it.charCode == "UAH" }?.charCode, db.find { it.charCode == "UAH" }?.value, resultUAH),
                    ItemAnalyticsModel(db.find { it.charCode == "USD" }?.name, db.find { it.charCode == "USD" }?.charCode, db.find { it.charCode == "USD" }?.value, resultUSD),
                    ItemAnalyticsModel(db.find { it.charCode == "UZS" }?.name, db.find { it.charCode == "UZS" }?.charCode, db.find { it.charCode == "UZS" }?.value, resultUZS),
                    ItemAnalyticsModel(db.find { it.charCode == "VND" }?.name, db.find { it.charCode == "VND" }?.charCode, db.find { it.charCode == "VND" }?.value, resultVND),
                    ItemAnalyticsModel(db.find { it.charCode == "ZAR" }?.name, db.find { it.charCode == "ZAR" }?.charCode, db.find { it.charCode == "ZAR" }?.value, resultZAR),
                )
            ) { _, item ->
                if (item != null) {
                    ItemAnalyticsScreen(item = item)
                }
            }
        }
    }
}