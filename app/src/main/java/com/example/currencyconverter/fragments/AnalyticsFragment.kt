package com.example.currencyconverter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.viewModels
import com.example.currencyconverter.viewModel.AnalyticsViewModel
import com.example.currencyconverter.databinding.FragmentAnalyticsBinding
import com.example.currencyconverter.ui.theme.AnalyticsScreen
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentAnalyticsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        scope = CoroutineScope(Dispatchers.IO).also { scope->
            scope.launch {
                viewModel.valuesData.collect{db->
                    withContext(Dispatchers.Main){
                        binding.composViewAnalyticsFragment.apply {
                        setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
                            setContent {
                                AnalyticsScreen(context,viewModel,db)
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