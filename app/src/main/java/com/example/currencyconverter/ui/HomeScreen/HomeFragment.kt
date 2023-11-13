package com.example.currencyconverter.ui.HomeScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.viewModels
import com.example.currencyconverter.databinding.FragmentHomeBinding
import com.example.currencyconverter.ui.HomeScreen.content.MainScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext



class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = checkNotNull(_binding)
    private lateinit var scope: CoroutineScope
    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                viewModel.valuesData.collect {
                    withContext(Dispatchers.Main) {
                        binding.composView.apply {
                            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
                            setContent {
                                MainScreen(context, viewModel)
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