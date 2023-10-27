package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies

enum class ParametersСurrency(val nameCurrency: String) {

    AED_VALUE("Дирхам ОАЭ"),
    AMD_VALUE("Армянских драмов"),
    AUD_VALUE("Австралийский доллар"),
    AZN_VALUE("Азербайджанский манат"),
    BGN_VALUE("Болгарский лев"),
    BRL_VALUE("Бразильский реал"),
    BYN_VALUE("Белорусский рубль"),
    CAD_VALUE("Канадский доллар"),
    CHF_VALUE("Швейцарский франк"),
    CNY_VALUE("Китайский юань"),
    CZK_VALUE("Чешских крон"),
    DKK_VALUE("Датская крона"),
    EGP_VALUE("Египетских фунтов"),
    EUR_VALUE("Евро"),
    GEL_VALUE("Грузинский лари"),
    HKD_VALUE("Гонконгский доллар"),
    HUF_VALUE("Венгерских форинтов"),
    IDR_VALUE("Индонезийских рупий"),
    INR_VALUE("Индийских рупий"),
    JPY_VALUE("Японских иен"),
    KGS_VALUE("Киргизских сомов"),
    KRW_VALUE("Вон Республики Корея"),
    KZT_VALUE("Казахстанских тенге"),
    MDL_VALUE("Молдавских леев"),
    NOK_VALUE("Норвежских крон"),
    NZD_VALUE("Новозеландский доллар"),
    PLN_VALUE("Польский злотый"),
    QAR_VALUE("Катарский риал"),
    RON_VALUE("Румынский лей"),
    RSD_VALUE("Сербских динаров"),
    SEK_VALUE("Шведских крон"),
    SGD_VALUE("Сингапурский доллар"),
    THB_VALUE("Таиландских батов"),
    TJS_VALUE("Таджикских сомони"),
    TMT_VALUE("Новый туркменский манат"),
    TRY_VALUE("Турецких лир"),
    UAH_VALUE("Украинских гривен"),
    USD_VALUE("Доллар США"),
    UZS_VALUE("Узбекских сумов"),
    VND_VALUE("Вьетнамских донгов"),
    ZAR_VALUE("Южноафриканских рэндов");

    fun rubleСonversion(db: List<Currencies>, userParamsConvert: Double): Double {
        return userParamsConvert / db.find { it.name == nameCurrency }?.value!! * db.find { it.name == nameCurrency }?.nominal!!
    }
}

