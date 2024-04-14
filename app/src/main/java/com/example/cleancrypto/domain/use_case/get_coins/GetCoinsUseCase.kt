package com.example.cleancrypto.domain.use_case.get_coins

import com.example.cleancrypto.data.remote.model.Coin
import com.example.cleancrypto.data.repository.CoinRepository
import com.plcoding.cryptocurrencyappyt.common.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    suspend operator fun invoke(): Flow<Resource<List<Coin>>> {
        return repository.getCoins()
    }
}