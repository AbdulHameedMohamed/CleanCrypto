package com.example.cleancrypto.presentation.coin_detail

import com.example.cleancrypto.data.remote.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
