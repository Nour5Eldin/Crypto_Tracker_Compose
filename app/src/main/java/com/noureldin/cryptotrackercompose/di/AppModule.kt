package com.noureldin.cryptotrackercompose.di

import com.noureldin.cryptotrackercompose.core.data.networking.HttpClientFactory
import com.noureldin.cryptotrackercompose.crypto.data.networking.RemoteCoinDataSource
import com.noureldin.cryptotrackercompose.crypto.domain.CoinDataSource
import com.noureldin.cryptotrackercompose.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)

}