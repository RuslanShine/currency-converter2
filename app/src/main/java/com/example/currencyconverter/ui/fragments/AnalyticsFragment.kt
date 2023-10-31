package com.example.currencyconverter.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.viewModels
import com.example.currencyconverter.data.ItemAnalyticsModel
import com.example.currencyconverter.ui.viewModel.AnalyticsViewModel
import com.example.currencyconverter.databinding.FragmentAnalyticsBinding
import com.example.currencyconverter.domain.usecase.ParametersСurrency
import com.example.currencyconverter.ui.content.AnalyticsScreen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class AnalyticsFragment : Fragment() {

    private var _binding: FragmentAnalyticsBinding? = null
    private val binding: FragmentAnalyticsBinding get() = checkNotNull(_binding)
    private val viewModel by viewModels<AnalyticsViewModel>()
    private lateinit var scope: CoroutineScope

    private val cardCurrencies = arrayListOf<ItemAnalyticsModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentAnalyticsBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                viewModel.valuesData.collect { db ->

//                    var id = 0
//                    for (i in 1..41) {
//                        id++
//                        cardCurrencies.add(
//                            ItemAnalyticsModel(
//                                id = id,
//                                nameCurrency = db.find { it.id == id }?.name,
//                                codCurrency = db.find { it.id == id }?.charCode,
//                                exchangeRate = db.find { it.id == id }?.value,
//                                result = "123"
//                            )
//                        )
//                    }

                    withContext(Dispatchers.Main) {
                        binding.composViewAnalyticsFragment.apply {
                            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
                            setContent {
                                AnalyticsScreen(context, viewModel, db, cardCurrencies)
                            }
                        }
                    }
                }
            }
        }

    }

    override fun onStop() {
        super.onStop()
        scope.cancel()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}