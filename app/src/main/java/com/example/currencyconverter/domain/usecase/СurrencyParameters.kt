package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies

enum class ParametersСurrency(val nameCurrency: String) {

    AED("Дирхам ОАЭ"),
    AMD("Армянских драмов"),
    AUD("Австралийский доллар"),
    AZN("Азербайджанский манат"),
    BGN("Болгарский лев"),
    BRL("Бразильский реал"),
    BYN("Белорусский рубль"),
    CAD("Канадский доллар"),
    CHF("Швейцарский франк"),
    CNY("Китайский юань"),
    CZK("Чешских крон"),
    DKK("Датская крона"),
    EGP("Египетских фунтов"),
    EUR("Евро"),
    GEL("Грузинский лари"),
    HKD("Гонконгский доллар"),
    HUF("Венгерских форинтов"),
    IDR("Индонезийских рупий"),
    INR("Индийских рупий"),
    JPY("Японских иен"),
    KGS("Киргизских сомов"),
    KRW("Вон Республики Корея"),
    KZT("Казахстанских тенге"),
    MDL("Молдавских леев"),
    NOK("Норвежских крон"),
    NZD("Новозеландский доллар"),
    PLN("Польский злотый"),
    QAR("Катарский риал"),
    RON("Румынский лей"),
    RSD("Сербских динаров"),
    SEK("Шведских крон"),
    SGD("Сингапурский доллар"),
    THB("Таиландских батов"),
    TJS("Таджикских сомони"),
    TMT("Новый туркменский манат"),
    TRY("Турецких лир"),
    UAH("Украинских гривен"),
    USD("Доллар США"),
    UZS("Узбекских сумов"),
    VND("Вьетнамских донгов"),
    ZAR("Южноафриканских рэндов"),
    OTHER("");

    companion object{
        fun getBayIndex(index:String): ParametersСurrency= values().find { it.nameCurrency == index }?: OTHER
    }


    fun rubleСonversion(db: List<Currencies>, userParamsConvert: Double): Double {
        return userParamsConvert / db.find { it.name == nameCurrency }?.value!! * db.find { it.name == nameCurrency }?.nominal!!
    }
}

