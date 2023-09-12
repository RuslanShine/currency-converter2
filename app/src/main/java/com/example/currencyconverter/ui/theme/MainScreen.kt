package com.example.currencyconverter.ui.theme

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.R

//fun convert(from: String?, to: String?, v: Float): Float {
//    val fromVal: Float = repo.get(from)
//    val toVal: Float = repo.get(to)
//    return fromVal / toVal * v
//}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(valuesData: ValCurs, context: Context) {

    val myList = listOf(
        valuesData.valute.aED.name,
        valuesData.valute.aMD.name,
        valuesData.valute.aUD.name,
        valuesData.valute.aZN.name,
        valuesData.valute.bGN.name,
        valuesData.valute.bRL.name,
        valuesData.valute.bYN.name,
        valuesData.valute.cAD.name,
        valuesData.valute.cHF.name,
        valuesData.valute.cNY.name,
        valuesData.valute.cZK.name,
        valuesData.valute.dKK.name,
        valuesData.valute.eGP.name,
        valuesData.valute.eUR.name,
        valuesData.valute.gBP.name,
        valuesData.valute.gEL.name,
        valuesData.valute.hKD.name,
        valuesData.valute.hUF.name,
        valuesData.valute.iDR.name,
        valuesData.valute.iNR.name,
        valuesData.valute.jPY.name,
        valuesData.valute.kGS.name,
        valuesData.valute.kRW.name,
        valuesData.valute.kZT.name,
        valuesData.valute.mDL.name,
        valuesData.valute.nOK.name,
        valuesData.valute.nZD.name,
        valuesData.valute.pLN.name,
        valuesData.valute.qAR.name,
        valuesData.valute.rON.name,
        valuesData.valute.rSD.name,
        valuesData.valute.sEK.name,
        valuesData.valute.sGD.name,
        valuesData.valute.tHB.name,
        valuesData.valute.tJS.name,
        valuesData.valute.tMT.name,
        valuesData.valute.tRY.name,
        valuesData.valute.uAH.name,
        valuesData.valute.uSD.name,
        valuesData.valute.uZS.name,
        valuesData.valute.vND.name,
        valuesData.valute.xDR.name,
        valuesData.valute.zAR.name
    )


    val listСurrencyOne = myList
    val expandedOne = remember { mutableStateOf(false) }
    val currentValueOne = remember { mutableStateOf(listСurrencyOne[0]) }
    var textOne by remember { mutableStateOf("") }
//    var rez = textOne * valuesData.valute.aUD.value


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
                        .height(Dimens._150)
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
                                    text = currentValueOne.value,
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
                                        DropdownMenuItem(text = { Text(text = it) }, onClick = {
                                            currentValueOne.value = it
                                            expandedOne.value = false
                                        }, modifier = Modifier.background(Color.White))
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
                                text = valuesData.valute.uSD.charCode,
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
                                placeholder = { Text("0") })
                        }
                    }
                }


                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(Dimens._150)
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
                                    text = currentValueTow.value,
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
                                        DropdownMenuItem(text = { Text(text = it) }, onClick = {
                                            currentValueTow.value = it
                                            expandedTow.value = false
                                        }, modifier = Modifier.background(Color.White))
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
                                text = valuesData.valute.aED.charCode, fontSize = FontSizes._24, color = Color.Black
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
                                placeholder = { Text("0") })
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = Dimens._36),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = {

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



