package com.enriqueizel.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExchangeRateResult(
    val from: String,
    val to: String,
    @SerialName("exchange_rate")
    val exchangeRate: Double,
)

val exchangeRatesTable: Map<String, Map<String, Double>> = mapOf(
    "USD" to mapOf(
        "USD" to 1.0000,
        "EUR" to 0.8925,
        "JPY" to 158.5350,
        "GBP" to 0.7552,
        "CNY" to 6.6922,
        "BRL" to 4.9908,
        "CHF" to 0.8297
    ),
    "EUR" to mapOf(
        "USD" to 1.1204,
        "EUR" to 1.0000,
        "JPY" to 177.6302,
        "GBP" to 0.8462,
        "CNY" to 7.4983,
        "BRL" to 5.5919,
        "CHF" to 0.9296
    ),
    "JPY" to mapOf(
        "USD" to 0.0063,
        "EUR" to 0.0056,
        "JPY" to 1.0000,
        "GBP" to 0.0048,
        "CNY" to 0.0422,
        "BRL" to 0.0315,
        "CHF" to 0.0052
    ),
    "GBP" to mapOf(
        "USD" to 1.3242,
        "EUR" to 1.1818,
        "JPY" to 209.9245,
        "GBP" to 1.0000,
        "CNY" to 8.8615,
        "BRL" to 6.6086,
        "CHF" to 1.0986
    ),
    "CNY" to mapOf(
        "USD" to 0.1494,
        "EUR" to 0.1334,
        "JPY" to 23.6897,
        "GBP" to 0.1128,
        "CNY" to 1.0000,
        "BRL" to 0.7458,
        "CHF" to 0.1240
    ),
    "BRL" to mapOf(
        "USD" to 0.2004,
        "EUR" to 0.1788,
        "JPY" to 31.7654,
        "GBP" to 0.1513,
        "CNY" to 1.3409,
        "BRL" to 1.0000,
        "CHF" to 0.1662
    ),
    "CHF" to mapOf(
        "USD" to 1.2053,
        "EUR" to 1.0757,
        "JPY" to 191.0833,
        "GBP" to 0.9103,
        "CNY" to 8.0658,
        "BRL" to 6.0154,
        "CHF" to 1.0000
    )
)
