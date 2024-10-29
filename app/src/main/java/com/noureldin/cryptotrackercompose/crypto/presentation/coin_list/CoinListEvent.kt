package com.noureldin.cryptotrackercompose.crypto.presentation.coin_list

import com.noureldin.cryptotrackercompose.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}