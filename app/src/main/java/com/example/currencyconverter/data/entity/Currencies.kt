package com.example.currencyconverter.data.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.convertmy.data.AED
import com.example.convertmy.data.AMD
import com.example.convertmy.data.AUD
import com.example.convertmy.data.AZN
import com.example.convertmy.data.BGN
import com.example.convertmy.data.BRL
import com.example.convertmy.data.BYN
import com.example.convertmy.data.CAD
import com.example.convertmy.data.CHF
import com.example.convertmy.data.CNY
import com.example.convertmy.data.CZK
import com.example.convertmy.data.DKK
import com.example.convertmy.data.EGP
import com.example.convertmy.data.EUR
import com.example.convertmy.data.GBP
import com.example.convertmy.data.GEL
import com.example.convertmy.data.HKD
import com.example.convertmy.data.HUF
import com.example.convertmy.data.IDR
import com.example.convertmy.data.INR
import com.example.convertmy.data.JPY
import com.example.convertmy.data.KGS
import com.example.convertmy.data.KRW
import com.example.convertmy.data.KZT
import com.example.convertmy.data.MDL
import com.example.convertmy.data.NOK
import com.example.convertmy.data.NZD
import com.example.convertmy.data.PLN
import com.example.convertmy.data.QAR
import com.example.convertmy.data.RON
import com.example.convertmy.data.RSD
import com.example.convertmy.data.SEK
import com.example.convertmy.data.SGD
import com.example.convertmy.data.THB
import com.example.convertmy.data.TJS
import com.example.convertmy.data.TMT
import com.example.convertmy.data.TRY
import com.example.convertmy.data.UAH
import com.example.convertmy.data.USD
import com.example.convertmy.data.UZS
import com.example.convertmy.data.VND
import com.example.convertmy.data.Valute
import com.example.convertmy.data.XDR
import com.example.convertmy.data.ZAR

//@Entity(tableName = "cat_table")
//data class Cat(
//    @PrimaryKey(autoGenerate = true) val id: Int = 0,
//    @ColumnInfo(name = "cat_name") val catName: String,
//    @ColumnInfo(name = "cat_age") val catAge:Int,
//    @Embedded(prefix = "parent_") val catParent: CatParent
//)
//
//data class CatParent(
//    val cat_name: String,
//    val cat_age: String
//)

@Entity(tableName = "cached_currencies")
data class Currencies(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "previousDate") val previousDate: String,
    @ColumnInfo(name = "previousURL") val previousURL: String,
    @ColumnInfo(name = "timestamp") val timestamp: String,
//    @Embedded(prefix = "valute_") val valute: Valute,
    @Embedded(prefix = "valute_res_aED_") val aED: AED,
    @Embedded(prefix = "valute_res_aMD_") val aMD: AMD,
    @Embedded(prefix = "valute_res_aUD_") val aUD: AUD,
    @Embedded(prefix = "valute_res_aZN_") val aZN: AZN,
    @Embedded(prefix = "valute_res_bGN_") val bGN: BGN,
    @Embedded(prefix = "valute_res_bRL_") val bRL: BRL,
    @Embedded(prefix = "valute_res_bYN_") val bYN: BYN,
    @Embedded(prefix = "valute_res_cAD_") val cAD: CAD,
    @Embedded(prefix = "valute_res_cHF_") val cHF: CHF,
    @Embedded(prefix = "valute_res_cNY_") val cNY: CNY,
    @Embedded(prefix = "valute_res_cZK_") val cZK: CZK,
    @Embedded(prefix = "valute_res_dKK_") val dKK: DKK,
    @Embedded(prefix = "valute_res_eGP_") val eGP: EGP,
    @Embedded(prefix = "valute_res_eUR_") val eUR: EUR,
    @Embedded(prefix = "valute_res_gBP_") val gBP: GBP,
    @Embedded(prefix = "valute_res_gEL_") val gEL: GEL,
    @Embedded(prefix = "valute_res_hKD_") val hKD: HKD,
    @Embedded(prefix = "valute_res_hUF_") val hUF: HUF,
    @Embedded(prefix = "valute_res_iDR_") val iDR: IDR,
    @Embedded(prefix = "valute_res_iNR_") val iNR: INR,
    @Embedded(prefix = "valute_res_jPY_") val jPY: JPY,
    @Embedded(prefix = "valute_res_kGS_") val kGS: KGS,
    @Embedded(prefix = "valute_res_kRW_") val kRW: KRW,
    @Embedded(prefix = "valute_res_kZT_") val kZT: KZT,
    @Embedded(prefix = "valute_res_mDL_") val mDL: MDL,
    @Embedded(prefix = "valute_res_nOK_") val nOK: NOK,
    @Embedded(prefix = "valute_res_nZD_") val nZD: NZD,
    @Embedded(prefix = "valute_res_pLN_") val pLN: PLN,
    @Embedded(prefix = "valute_res_qAR_") val qAR: QAR,
    @Embedded(prefix = "valute_res_rON_") val rON: RON,
    @Embedded(prefix = "valute_res_rSD_") val rSD: RSD,
    @Embedded(prefix = "valute_res_sEK_") val sEK: SEK,
    @Embedded(prefix = "valute_res_sGD_") val sGD: SGD,
    @Embedded(prefix = "valute_res_tHB_") val tHB: THB,
    @Embedded(prefix = "valute_res_tJS_") val tJS: TJS,
    @Embedded(prefix = "valute_res_tMT_") val tMT: TMT,
    @Embedded(prefix = "valute_res_tRY_") val tRY: TRY,
    @Embedded(prefix = "valute_res_uAH_") val uAH: UAH,
    @Embedded(prefix = "valute_res_uSD_") val uSD: USD,
    @Embedded(prefix = "valute_res_uZS_") val uZS: UZS,
    @Embedded(prefix = "valute_res_vND_") val vND: VND,
    @Embedded(prefix = "valute_res_xDR_") val xDR: XDR,
    @Embedded(prefix = "valute_res_zAR_") val zAR: ZAR
    )

//data class Valute(
//    val aED: AED,
//    val aMD: AMD,
//    val aUD: AUD,
//    val aZN: AZN,
//    val bGN: BGN,
//    val bRL: BRL,
//    val bYN: BYN,
//    val cAD: CAD,
//    val cHF: CHF,
//    val cNY: CNY,
//    val cZK: CZK,
//    val dKK: DKK,
//    val eGP: EGP,
//    val eUR: EUR
//)
//
//    data class AED(
//    val charCode: String,
//    val iD: String,
//    val name: String,
//    val nominal: Int,
//    val numCode: String,
//    val previous: Double,
//    val value: Double
//)
////
//data class AMD(
//    val charCode: String,
//    val iD: String,
//    val name: String,
//    val nominal: Int,
//    val numCode: String,
//    val previous: Double,
//    val value: Double
//)



//@Entity(tableName = "cached_currencies")
//data class Currencies(
//    @PrimaryKey(autoGenerate = true) val id: Int = 0,
//    @Ignore val iD: String,
//    @ColumnInfo(name = "char_Code") val charCode: String,
//    @ColumnInfo(name = "name_") val name: String,
//    @ColumnInfo(name = "nominal_") val nominal: Int,
//    @ColumnInfo(name = "numCode_") val numCode: String,
//    @Ignore val previous: Double,
//    @ColumnInfo(name = "value_") val value: Double,
//)