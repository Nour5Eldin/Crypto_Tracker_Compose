package com.noureldin.cryptotrackercompose.crypto.presentation.models

import androidx.annotation.DrawableRes

data class CoinUi (
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    @DrawableRes val iconRes: Int
)
data class DisplayableNumber(
    val value: Double,
    val formatted: String
)