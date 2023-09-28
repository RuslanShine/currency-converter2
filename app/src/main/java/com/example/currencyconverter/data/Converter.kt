//package com.example.currencyconverter.data
//
//import com.example.convertmy.data.Valute
//import com.example.currencyconverter.data.entity.Currencies
//
//object Converter {
//    fun convertApiListDtoList(list: Valute?): List<Currencies> {
//        val result = mutableListOf<Currencies>()
//
//
//        listOf(list).forEach {
//            if (it != null) {
//                result.add(
//                    Currencies(
//                        date =it.aED.name,
//                        previousDate = it.eUR.charCode ,
//                        timestamp = "sds",
//                        previousURL = "",
//                        aED = it.aED,
//                        aMD = it.aMD,
//                        aUD = it.aUD,
//                        aZN = it.aZN,
//                        bGN = it.bGN,
//                        bRL = it.bRL,
//                        bYN = it.bYN,
//                        cAD = it.cAD,
//                        cHF = it.cHF,
//                        cNY = it.cNY,
//                        cZK = it.cZK,
//                        dKK = it.dKK,
//                        eGP = it.eGP,
//                        eUR = it.eUR,
//                        gBP = it.gBP,
//                        gEL = it.gEL,
//                        hKD = it.hKD,
//                        hUF = it.hUF,
//                        iDR = it.iDR,
//                        iNR = it.iNR,
//                        jPY = it.jPY,
//                        kGS = it.kGS,
//                        kRW = it.kRW,
//                        kZT = it.kZT,
//                        mDL = it.mDL,
//                        nOK = it.nOK,
//                        nZD = it.nZD,
//                        pLN = it.pLN,
//                        qAR = it.qAR,
//                        rON = it.rON,
//                        rSD = it.rSD,
//                        sEK = it.sEK,
//                        sGD = it.sGD,
//                        tHB = it.tHB,
//                        tJS = it.tJS,
//                        tMT = it.tMT,
//                        tRY = it.tRY,
//                        uAH = it.uAH,
//                        uSD = it.uSD,
//                        uZS = it.uZS,
//                        vND = it.vND,
//                        xDR = it.xDR,
//                        zAR = it.zAR
//                    )
//                )
//            }
//
//        }
//        return result
//    }
//}
//
//
////listOf(list).forEach {
////    if (it != null) {
////        result.add(
////            Currencies(
////                date = it.eUR.name,
////                previousDate = it.previousDate,
////                timestamp = it.timestamp,
////                previousURL = it.previousURL,
////                valute = it.valute,
////                aED = it.aED.name,
////                aMD = it.aMD.,
////                aUD = it.valute.aUD,
////                aZN = it.valute.aZN,
////                bGN = it.valute.bGN,
////                bRL = it.valute.bRL,
////                bYN = it.valute.bYN,
////                cAD = it.valute.cAD,
////                cHF = it.valute.cHF,
////                cNY = it.valute.cNY,
////                cZK = it.valute.cZK,
////                dKK = it.valute.dKK,
////                eGP = it.valute.eGP,
////                eUR = it.valute.eUR,
////                gBP = it.valute.gBP,
////                gEL = it.valute.gEL,
////                hKD = it.valute.hKD,
////                hUF = it.valute.hUF,
////                iDR = it.valute.iDR,
////                iNR = it.valute.iNR,
////                jPY = it.valute.jPY,
////                kGS = it.valute.kGS,
////                kRW = it.valute.kRW,
////                kZT = it.valute.kZT,
////                mDL = it.valute.mDL,
////                nOK = it.valute.nOK,
////                nZD = it.valute.nZD,
////                pLN = it.valute.pLN,
////                qAR = it.valute.qAR,
////                rON = it.valute.rON,
////                rSD = it.valute.rSD,
////                sEK = it.valute.sEK,
////                sGD = it.valute.sGD,
////                tHB = it.valute.tHB,
////                tJS = it.valute.tJS,
////                tMT = it.valute.tMT,
////                tRY = it.valute.tRY,
////                uAH = it.valute.uAH,
////                uSD = it.valute.uSD,
////                uZS = it.valute.uZS,
////                vND = it.valute.vND,
////                xDR = it.valute.xDR,
////                zAR = it.valute.zAR
////            )
////        )
////    }
////}
////return result
////}