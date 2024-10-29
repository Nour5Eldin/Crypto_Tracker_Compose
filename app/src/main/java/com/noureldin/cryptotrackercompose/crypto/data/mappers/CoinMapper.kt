package com.noureldin.cryptotrackercompose.crypto.data.mappers

import com.noureldin.cryptotrackercompose.crypto.data.networking.dto.CoinDto
import com.noureldin.cryptotrackercompose.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id= id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}