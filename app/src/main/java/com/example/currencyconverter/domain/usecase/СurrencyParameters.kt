package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies

enum class ParametersСurrency() : СalculationRUB {

    AED_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.aED.value * db.aED.nominal
        }
    },

    AMD_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.aMD.value * db.aMD.nominal
        }
    },

    AUD_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.aUD.value * db.aUD.nominal
        }
    },

    AZN_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.aZN.value * db.aZN.nominal
        }
    },

    BGN_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.bGN.value * db.bGN.nominal
        }
    },

    BRL_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.bRL.value * db.bRL.nominal
        }
    },

    BYN_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.bYN.value * db.bYN.nominal
        }
    },

    CAD_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.cAD.value * db.cAD.nominal
        }
    },

    CHF_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.cHF.value * db.cHF.nominal
        }
    },

    CNY_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.cNY.value * db.cNY.nominal
        }
    },

    CZK_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.cZK.value * db.cZK.nominal
        }
    },

    DKK_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.dKK.value * db.dKK.nominal
        }
    },

    EGP_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.eGP.value * db.eGP.nominal
        }
    },

    EUR_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.eUR.value * db.eUR.nominal
        }
    },

    GEL_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.gEL.value * db.gEL.nominal
        }
    },

    HKD_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.hKD.value * db.hKD.nominal
        }
    },

    HUF_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.hUF.value * db.hUF.nominal
        }
    },

    IDR_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.iDR.value * db.iDR.nominal
        }
    },

    INR_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.iNR.value * db.iNR.nominal
        }
    },

    JPY_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.jPY.value * db.jPY.nominal
        }
    },

    KGS_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.kGS.value * db.kGS.nominal
        }
    },

    KRW_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.kRW.value * db.kRW.nominal
        }
    },

    KZT_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.kZT.value * db.kZT.nominal
        }
    },

    MDL_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.mDL.value * db.mDL.nominal
        }
    },

    NOK_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.nOK.value * db.nOK.nominal
        }
    },

    NZD_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.nZD.value * db.nZD.nominal
        }
    },

    PLN_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.pLN.value * db.pLN.nominal
        }
    },

    QAR_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.qAR.value * db.qAR.nominal
        }
    },

    RON_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.rON.value * db.rON.nominal
        }
    },

    RSD_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.rSD.value * db.rSD.nominal
        }
    },

    SEK_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.sEK.value * db.sEK.nominal
        }
    },

    SGD_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.sGD.value * db.sGD.nominal
        }
    },

    THB_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.tHB.value * db.tHB.nominal
        }
    },

    TJS_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.tJS.value * db.tJS.nominal
        }
    },

    TMT_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.tMT.value * db.tMT.nominal
        }
    },

    TRY_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.tRY.value * db.tRY.nominal
        }
    },

    UAH_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.uAH.value * db.uAH.nominal
        }
    },

    USD_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.uSD.value * db.uSD.nominal
        }
    },

    UZS_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.uZS.value * db.uZS.nominal
        }
    },

    VND_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.vND.value * db.vND.nominal
        }
    },

    ZAR_VALUE {
        override fun getValueRUB(db: Currencies, userParamsConvert: Double): Double {
            return userParamsConvert / db.zAR.value * db.zAR.nominal
        }
    },
}

interface СalculationRUB {
    fun getValueRUB(db: Currencies, userParamsConvert: Double): Double
}
