package com.noureldin.cryptotrackercompose.core.data.networking

import com.noureldin.cryptotrackercompose.BuildConfig


fun constructUrl(url: String): String{
    return when{
        url.contains(BuildConfig.BASE_URL) -> url
            url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1)
        else -> BuildConfig.BASE_URL + url
    }
}