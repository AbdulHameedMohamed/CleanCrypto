package com.example.cleancrypto.data.repository

import com.example.cleancrypto.data.remote.model.Coin
import com.example.cleancrypto.data.remote.model.CoinDetail
import com.plcoding.cryptocurrencyappyt.common.Resource
import kotlinx.coroutines.flow.Flow

interface CoinRepository {
    suspend fun getCoins(): Flow<Resource<List<Coin>>>
    suspend fun getCoinById(coinId: String): Flow<Resource<CoinDetail>>
}