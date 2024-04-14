package com.example.cleancrypto.presentation.coin_list

import com.example.cleancrypto.data.remote.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
