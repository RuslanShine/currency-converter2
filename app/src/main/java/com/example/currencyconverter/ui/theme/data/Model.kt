package com.example.currencyconverter.ui.theme.data

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "ValCurs", strict = false)
data class ValCurs(
    @field:ElementList(entry = "Valute", inline = true, required = false)
    var valList: List<Currency>,
    @field:Attribute(name = "Date")
    var date: String,
    @field:Attribute(name = "name")
    var name: String
)

@Root(name="Valute", strict = false)
data class Currency(
    @field:Attribute(name = "ID", required = false)
    var id: String ,
    @field:Element(name = "NumCode", required = false)
    var numCode: String,
    @field:Element(name = "CharCode", required = false)
    var charCode: String,
    @field:Element(name = "Nominal", required = false)
    var nominal: String,
    @field:Element(name = "Name", required = false)
    var name: String,
    @field:Element(name = "Value", required = false)
    var value: String
)


