package com.noureldin.cryptotrackercompose.crypto.presentation.coin_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import kotlinx.coroutines.delay

@Composable
fun CoinListScreen(
    modifier: Modifier = Modifier,
    onAction: (CoinListAction) -> Unit,
    state: CoinListState
) {
    var showList by remember { mutableStateOf(false) }
    LaunchedEffect(state.isLoading) {
        delay(3000)
        showList = true
    }
    if (state.isLoading && !showList){
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.cryptoloading))
        Box (
            modifier= modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            LottieAnimation(
                modifier = Modifier.size(265.dp),
                composition= composition)
        }
    } else {
        LazyColumn (
            modifier =  modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ){
            items(state.coins){ coinUi ->
                CoinListItem(coinUi = coinUi,
                    onClick = {onAction(CoinListAction.OnCoinClick(coinUi))},
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
            modifier = Modifier.background(MaterialTheme.colorScheme.background),
            onAction = {}
        )
    }
    
}