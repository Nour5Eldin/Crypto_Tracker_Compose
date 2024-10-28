package com.noureldin.cryptotrackercompose.crypto.presentation.coin_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.noureldin.cryptotrackercompose.R
import com.noureldin.cryptotrackercompose.crypto.presentation.coin_list.components.CoinListItem
import com.noureldin.cryptotrackercompose.crypto.presentation.coin_list.components.previewCoin
import com.noureldin.cryptotrackercompose.ui.theme.CryptoTrackerComposeTheme

@Composable
fun CoinListScreen(
    modifier: Modifier = Modifier,
    state: CoinListState
) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.crypto))
    if (state.isLoading){
        Box (
            modifier= modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            LottieAnimation(
                modifier = Modifier.size(65.dp),
                composition= composition)
            //Loading
            CircularProgressIndicator()
        }
    } else {
        LazyColumn (
            modifier =  modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ){
            items(state.coins){ coinUi ->
                CoinListItem(coinUi = coinUi,
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                )
                HorizontalDivider()
            }

        }
    }

}

@PreviewLightDark
@Composable
private fun CoinListScreenPreview() {
    CryptoTrackerComposeTheme {
        CoinListScreen(state = CoinListState(
            coins = (1..100).map {
                previewCoin.copy(id = it.toString())
            }
        ),
            modifier = Modifier.background(MaterialTheme.colorScheme.background)
        )
    }
    
}