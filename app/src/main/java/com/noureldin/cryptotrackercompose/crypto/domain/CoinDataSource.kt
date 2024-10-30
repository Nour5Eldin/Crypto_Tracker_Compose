package com.noureldin.cryptotrackercompose.crypto.domain

import com.noureldin.cryptotrackercompose.core.domain.util.NetworkError
import com.noureldin.cryptotrackercompose.core.domain.util.Result
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>,NetworkError>
}