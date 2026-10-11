package com.enriqueizel.model

fun String.orUnknown() : String =
    if (this in exchangeRatesTable.keys) this else "Desconhecido"