package com.example.currencyconverter.ui.theme

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.unit.dp
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
        valuesData.valute.aED.charCode,
        valuesData.valute.aMD.charCode,
        valuesData.valute.aUD.charCode,
        valuesData.valute.aZN.charCode,
        valuesData.valute.bGN.charCode,
        valuesData.valute.bRL.charCode,
        valuesData.valute.bYN.charCode,
        valuesData.valute.cAD.charCode,
        valuesData.valute.cHF.charCode,
        valuesData.valute.cNY.charCode,
        valuesData.valute.cZK.charCode,
        valuesData.valute.dKK.charCode,
        valuesData.valute.eGP.charCode,
        valuesData.valute.eUR.charCode,
        valuesData.valute.gBP.charCode,
        valuesData.valute.gEL.charCode,
        valuesData.valute.hKD.charCode,
        valuesData.valute.hUF.charCode,
        valuesData.valute.iDR.charCode,
        valuesData.valute.iNR.charCode,
        valuesData.valute.jPY.charCode,
        valuesData.valute.kGS.charCode,
        valuesData.valute.kRW.charCode,
        valuesData.valute.kZT.charCode,
        valuesData.valute.mDL.charCode,
        valuesData.valute.nOK.charCode,
        valuesData.valute.nZD.charCode,
        valuesData.valute.pLN.charCode,
        valuesData.valute.qAR.charCode,
        valuesData.valute.rON.charCode,
        valuesData.valute.rSD.charCode,
        valuesData.valute.sEK.charCode,
        valuesData.valute.sGD.charCode,
        valuesData.valute.tHB.charCode,
        valuesData.valute.tJS.charCode,
        valuesData.valute.tMT.charCode,
        valuesData.valute.tRY.charCode,
        valuesData.valute.uAH.charCode,
        valuesData.valute.uSD.charCode,
        valuesData.valute.uZS.charCode,
        valuesData.valute.vND.charCode,
        valuesData.valute.xDR.charCode,
        valuesData.valute.zAR.charCode
    )


    val listСurrencyOne = myList
    val expandedOne = remember { mutableStateOf(false) }
    val currentValueOne = remember { mutableStateOf(listСurrencyOne[0]) }
    var textOne by remember { mutableStateOf("") }
    var rezult = textOne + valuesData.valute.aUD.value

    when(currentValueOne.value) {
        currentValueOne.value[0].toString() -> println("!!!Zero")
        currentValueOne.value[1].toString() -> println("!!!One")
//        listOf(2) -> println("!!!Two")
        else -> println("Other number")
    }
    println("!!!Start")


    val listСurrencyTow = listOf("USD", "EUR", "JPY", "GBP", "AUD", "CHF", "RUB")
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
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Surface(modifier = Modifier.fillMaxSize()) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(Dimens._8)
                                    .padding(start = Dimens._20)
                                    .padding(end = Dimens._20),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                Row(modifier = Modifier.clickable {
                                    expandedOne.value = !expandedOne.value
                                }, verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = currentValueOne.value,
                                        fontSize = FontSizes._24,
                                        color = Color.Black
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.ArrowDropDown,
                                        contentDescription = null
                                    )
                                    DropdownMenu(expanded = expandedOne.value,
                                        onDismissRequest = { expandedOne.value = false }) {
                                        listСurrencyOne.forEach {
                                            DropdownMenuItem(text = { Text(text = it) },
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
                                        OutlinedTextField(value = textOne,
                                            onValueChange = { textOne = it },
                                            modifier = Modifier.width(Dimens._150),
                                            textStyle = androidx.compose.ui.text.TextStyle(
                                                fontSize = FontSizes._24
                                            ),
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
                                Box(modifier = Modifier.padding(top = 100.dp)) {
                                    Text(
                                        text = valuesData.valute.uSD.name,
                                        color = Color.Black,
                                    )
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
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Surface(modifier = Modifier.fillMaxSize(), color = Purple80) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(Dimens._8)
                                    .padding(start = Dimens._20)
                                    .padding(end = Dimens._20),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                Row(modifier = Modifier.clickable {
                                    expandedTow.value = !expandedTow.value
                                }, verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = currentValueTow.value,
                                        fontSize = FontSizes._24,
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
                                            })
                                        }
                                    }
                                    Box(
                                        contentAlignment = Alignment.CenterEnd,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        OutlinedTextField(value = textTow,
                                            onValueChange = {
                                                textTow = rezult
                                            },
                                            modifier = Modifier.width(Dimens._150),
                                            textStyle = androidx.compose.ui.text.TextStyle(fontSize = FontSizes._24),
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
                                Box(modifier = Modifier.padding(top = 100.dp)) {
                                    Text(
                                        text = "Австралийский доллар",
                                        color = Color.Black,
                                    )
                                }
                            }
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 36.dp),
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



