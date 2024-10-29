package com.noureldin.cryptotrackercompose.crypto.presentation.coin_list

import com.noureldin.cryptotrackercompose.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}