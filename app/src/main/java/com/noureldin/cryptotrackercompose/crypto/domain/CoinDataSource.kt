package com.noureldin.cryptotrackercompose.crypto.domain

import com.noureldin.cryptotrackercompose.core.domain.util.NetworkError
import com.noureldin.cryptotrackercompose.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}