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
import com.example.currencyconverter.data.ItemAnalyticsModel
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
//                                    viewModel.inputValueRub(it)
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

                            var rez = valueCurrencyRub

                            viewModel.inputValueRub(rez)

//                                    coroutine.launch {
//                                        valueCurrencyResult = if (valueCurrencyRub > 0.toString()) {
//                                            val result = valueCurrencyRub
//                                            val resultFinish = viewModel.inputValueRub(result)
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
        ) {
            itemsIndexed(
                listOf(
                    ItemAnalyticsModel(db.aED.name, db.aED.charCode, db.aED.value,viewModel.test()),
//                    ItemAnalyticsModel(db.aMD.name, db.aMD.charCode, db.aMD.value),
//                    ItemAnalyticsModel(db.aUD.name, db.aUD.charCode, db.aUD.value),
//                    ItemAnalyticsModel(db.aZN.name, db.aZN.charCode, db.aZN.value),
//                    ItemAnalyticsModel(db.bGN.name, db.bGN.charCode, db.bGN.value),
//                    ItemAnalyticsModel(db.bRL.name, db.bRL.charCode, db.bRL.value),
//                    ItemAnalyticsModel(db.bYN.name, db.bYN.charCode, db.bYN.value),
//                    ItemAnalyticsModel(db.cAD.name, db.cAD.charCode, db.cAD.value),
//                    ItemAnalyticsModel(db.cHF.name, db.cHF.charCode, db.cHF.value),
//                    ItemAnalyticsModel(db.cNY.name, db.cNY.charCode, db.cNY.value),
//                    ItemAnalyticsModel(db.cZK.name, db.cZK.charCode, db.cZK.value),
//                    ItemAnalyticsModel(db.dKK.name, db.dKK.charCode, db.dKK.value),
//                    ItemAnalyticsModel(db.eGP.name, db.eGP.charCode, db.eGP.value),
//                    ItemAnalyticsModel(db.eUR.name, db.eUR.charCode, db.eUR.value),
//                    ItemAnalyticsModel(db.gEL.name, db.gEL.charCode, db.gEL.value),
//                    ItemAnalyticsModel(db.hKD.name, db.hKD.charCode, db.hKD.value),
//                    ItemAnalyticsModel(db.hUF.name, db.hUF.charCode, db.hUF.value),
//                    ItemAnalyticsModel(db.iDR.name, db.iDR.charCode, db.iDR.value),
//                    ItemAnalyticsModel(db.iNR.name, db.iNR.charCode, db.iNR.value),
//                    ItemAnalyticsModel(db.jPY.name, db.jPY.charCode, db.jPY.value),
//                    ItemAnalyticsModel(db.kGS.name, db.kGS.charCode, db.kGS.value),
//                    ItemAnalyticsModel(db.kRW.name, db.kRW.charCode, db.kRW.value),
//                    ItemAnalyticsModel(db.kZT.name, db.kZT.charCode, db.kZT.value),
//                    ItemAnalyticsModel(db.mDL.name, db.mDL.charCode, db.mDL.value),
//                    ItemAnalyticsModel(db.nOK.name, db.nOK.charCode, db.nOK.value),
//                    ItemAnalyticsModel(db.nZD.name, db.nZD.charCode, db.nZD.value),
//                    ItemAnalyticsModel(db.pLN.name, db.pLN.charCode, db.pLN.value),
//                    ItemAnalyticsModel(db.qAR.name, db.qAR.charCode, db.qAR.value),
//                    ItemAnalyticsModel(db.rON.name, db.rON.charCode, db.rON.value),
//                    ItemAnalyticsModel(db.rSD.name, db.rSD.charCode, db.rSD.value),
//                    ItemAnalyticsModel(db.sEK.name, db.sEK.charCode, db.sEK.value),
//                    ItemAnalyticsModel(db.sGD.name, db.sGD.charCode, db.sGD.value),
//                    ItemAnalyticsModel(db.tHB.name, db.tHB.charCode, db.tHB.value),
//                    ItemAnalyticsModel(db.tJS.name, db.tJS.charCode, db.tJS.value),
//                    ItemAnalyticsModel(db.tMT.name, db.tMT.charCode, db.tMT.value),
//                    ItemAnalyticsModel(db.tRY.name, db.tRY.charCode, db.tRY.value),
//                    ItemAnalyticsModel(db.uAH.name, db.uAH.charCode, db.uAH.value),
//                    ItemAnalyticsModel(db.uSD.name, db.uSD.charCode, db.uSD.value),
//                    ItemAnalyticsModel(db.uZS.name, db.uZS.charCode, db.uZS.value),
//                    ItemAnalyticsModel(db.vND.name, db.vND.charCode, db.vND.value),
//                    ItemAnalyticsModel(db.zAR.name, db.zAR.charCode, db.zAR.value),
                )
            ) { _, item ->
                ItemAnalyticsScreen(item = item)
            }
        }


    }

}