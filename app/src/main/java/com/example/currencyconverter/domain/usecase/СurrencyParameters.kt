package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies

enum class ParametersСurrency() : СalculationRUB {


    AED_VALUE() {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "AED" }?.value!! * db.find { it.charCode == "AED" }?.nominal!!
        }
    },

    AMD_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "AMD" }?.value!! * db.find { it.charCode == "AMD" }?.nominal!!
        }
    },

    AUD_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "AUD" }?.value!! * db.find { it.charCode == "AUD" }?.nominal!!
        }
    },

    AZN_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "AZN" }?.value!! * db.find { it.charCode == "AZN" }?.nominal!!
        }
    },

    BGN_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "BGN" }?.value!! * db.find { it.charCode == "BGN" }?.nominal!!
        }
    },

    BRL_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "BRL" }?.value!! * db.find { it.charCode == "BRL" }?.nominal!!
        }
    },

    BYN_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "BYN" }?.value!! * db.find { it.charCode == "BYN" }?.nominal!!
        }
    },

    CAD_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "CAD" }?.value!! * db.find { it.charCode == "CAD" }?.nominal!!
        }
    },

    CHF_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "CHF" }?.value!! * db.find { it.charCode == "CHF" }?.nominal!!
        }
    },

    CNY_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "CNY" }?.value!! * db.find { it.charCode == "CNY" }?.nominal!!
        }
    },

    CZK_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "CZK" }?.value!! * db.find { it.charCode == "CZK" }?.nominal!!
        }
    },

    DKK_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "DKK" }?.value!! * db.find { it.charCode == "DKK" }?.nominal!!
        }
    },

    EGP_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "EGP" }?.value!! * db.find { it.charCode == "EGP" }?.nominal!!
        }
    },

    EUR_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "EUR" }?.value!! * db.find { it.charCode == "EUR" }?.nominal!!
        }
    },

    GEL_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "GEL" }?.value!! * db.find { it.charCode == "GEL" }?.nominal!!
        }
    },

    HKD_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "HKD" }?.value!! * db.find { it.charCode == "HKD" }?.nominal!!
        }
    },

    HUF_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "HUF" }?.value!! * db.find { it.charCode == "HUF" }?.nominal!!
        }
    },

    IDR_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "IDR" }?.value!! * db.find { it.charCode == "IDR" }?.nominal!!
        }
    },

    INR_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "INR" }?.value!! * db.find { it.charCode == "INR" }?.nominal!!
        }
    },

    JPY_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "JPY" }?.value!! * db.find { it.charCode == "JPY" }?.nominal!!
        }
    },

    KGS_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "KGS" }?.value!! * db.find { it.charCode == "KGS" }?.nominal!!
        }
    },

    KRW_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "KRW" }?.value!! * db.find { it.charCode == "KRW" }?.nominal!!
        }
    },

    KZT_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "KZT" }?.value!! * db.find { it.charCode == "KZT" }?.nominal!!
        }
    },

    MDL_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "MDL" }?.value!! * db.find { it.charCode == "MDL" }?.nominal!!
        }
    },

    NOK_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "NOK" }?.value!! * db.find { it.charCode == "NOK" }?.nominal!!
        }
    },

    NZD_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "NZD" }?.value!! * db.find { it.charCode == "NZD" }?.nominal!!
        }
    },

    PLN_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "PLN" }?.value!! * db.find { it.charCode == "PLN" }?.nominal!!
        }
    },

    QAR_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "QAR" }?.value!! * db.find { it.charCode == "QAR" }?.nominal!!
        }
    },

    RON_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "RON" }?.value!! * db.find { it.charCode == "RON" }?.nominal!!
        }
    },

    RSD_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "RSD" }?.value!! * db.find { it.charCode == "RSD" }?.nominal!!
        }
    },

    SEK_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "SEK" }?.value!! * db.find { it.charCode == "SEK" }?.nominal!!
        }
    },

    SGD_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "SGD" }?.value!! * db.find { it.charCode == "SGD" }?.nominal!!
        }
    },

    THB_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "THB" }?.value!! * db.find { it.charCode == "THB" }?.nominal!!
        }
    },

    TJS_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "TJS" }?.value!! * db.find { it.charCode == "TJS" }?.nominal!!
        }
    },

    TMT_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "TMT" }?.value!! * db.find { it.charCode == "TMT" }?.nominal!!
        }
    },

    TRY_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "TRY" }?.value!! * db.find { it.charCode == "TRY" }?.nominal!!
        }
    },

    UAH_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "UAH" }?.value!! * db.find { it.charCode == "UAH" }?.nominal!!
        }
    },

    USD_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "USD" }?.value!! * db.find { it.charCode == "USD" }?.nominal!!
        }
    },

    UZS_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "UZS" }?.value!! * db.find { it.charCode == "UZS" }?.nominal!!
        }
    },

    VND_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "VND" }?.value!! * db.find { it.charCode == "VND" }?.nominal!!
        }
    },

    ZAR_VALUE {
        override fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double {
            return userParamsConvert / db.find { it.charCode == "ZAR" }?.value!! * db.find { it.charCode == "ZAR" }?.nominal!!
        }
    },
}

interface СalculationRUB {
    fun getValueRUB(db: List<Currencies>, userParamsConvert: Double): Double
}
