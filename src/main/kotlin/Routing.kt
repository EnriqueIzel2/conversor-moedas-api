package com.enriqueizel

import com.enriqueizel.model.CurrencyTypesResult
import com.enriqueizel.model.ExchangeRateResult
import com.enriqueizel.model.currencyTypes
import com.enriqueizel.model.exchangeRatesTable
import com.enriqueizel.model.orUnknown
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/currency_types") {
            call.respond(
                CurrencyTypesResult(values = currencyTypes)
            )
        }

        get("/exchange_rate/{from}/{to}") {
            val from = call.parameters["from"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Não foi possível obter o acrônimo da moeda atual"
            )

            val to = call.parameters["to"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Não foi possível obter o acrônimo da moeda alvo"
            )

            call.respond(
                ExchangeRateResult(
                    from = from.orUnknown(),
                    to = to.orUnknown(),
                    exchangeRate = exchangeRatesTable[from]?.get(to) ?: 0.0
                )
            )
        }
    }
}