package com.noureldin.cryptotrackercompose.crypto.domain

import java.time.ZonedDateTime

data class CoinPrice (
    val priceUsd: Double,
    val dateTime: ZonedDateTime
)