package com.example.cleancrypto.domain.use_case.get_coin

import com.example.cleancrypto.data.remote.model.CoinDetail
import com.example.cleancrypto.data.repository.CoinRepository
import com.plcoding.cryptocurrencyappyt.common.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> {
        return repository.getCoinById(coinId)
    }
}