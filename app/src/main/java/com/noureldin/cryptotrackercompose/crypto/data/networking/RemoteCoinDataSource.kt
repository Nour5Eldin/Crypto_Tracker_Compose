package com.noureldin.cryptotrackercompose.crypto.data.networking

import com.noureldin.cryptotrackercompose.core.data.networking.constructUrl
import com.noureldin.cryptotrackercompose.core.data.networking.safeCall
import com.noureldin.cryptotrackercompose.core.domain.util.NetworkError
import com.noureldin.cryptotrackercompose.core.domain.util.Result
import com.noureldin.cryptotrackercompose.core.domain.util.map
import com.noureldin.cryptotrackercompose.crypto.data.mappers.toCoin
import com.noureldin.cryptotrackercompose.crypto.data.networking.dto.CoinResponseDto
import com.noureldin.cryptotrackercompose.crypto.domain.Coin
import com.noureldin.cryptotrackercompose.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource (private val httpClient: HttpClient): CoinDataSource{
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response->
            response.data.map { it.toCoin() }
        }
    }

}