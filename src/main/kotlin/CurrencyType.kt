package com.enriqueizel

import io.ktor.util.StringValues
import kotlinx.serialization.Serializable

@Serializable
data class CurrencyType(
    val name: String,
    val acronym: String,
    val symbol: String,
    val countryFlagImageUrl: String
)

@Serializable
data class CurrencyTypesResult(
    val values: List<CurrencyType>
)

val currencyTypes = listOf(
    CurrencyType(
        acronym = "BRL",
        name = "Real Brasileiro",
        symbol = "R$",
        countryFlagImageUrl = "https://flagcdn.com/br.svg"
    ),
    CurrencyType(
        acronym = "USD",
        name = "Dólar Americano",
        symbol = "$",
        countryFlagImageUrl = "https://flagcdn.com/us.svg"
    ),
    CurrencyType(
        acronym = "EUR",
        name = "Euro",
        symbol = "€",
        countryFlagImageUrl = "https://flagcdn.com/eu.svg"
    ),
    CurrencyType(
        acronym = "GBP",
        name = "Libra Esterlina",
        symbol = "£",
        countryFlagImageUrl = "https://flagcdn.com/gb.svg"
    ),
    CurrencyType(
        acronym = "JPY",
        name = "Iene Japonês",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/jp.svg"
    ),
    CurrencyType(
        acronym = "CHF",
        name = "Franco Suíço",
        symbol = "CHF",
        countryFlagImageUrl = "https://flagcdn.com/ch.svg"
    ),
    CurrencyType(
        acronym = "CNY",
        name = "Yuan Chinês",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/cn.svg"
    )
)