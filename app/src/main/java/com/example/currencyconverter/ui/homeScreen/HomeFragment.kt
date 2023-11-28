package com.example.currencyconverter.ui.homeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.currencyconverter.app.App
import com.example.currencyconverter.databinding.FragmentHomeBinding
import com.example.currencyconverter.di.AppComponent
import com.example.currencyconverter.ui.homeScreen.content.MainScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = checkNotNull(_binding)
    private lateinit var scope: CoroutineScope

//    private val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

    private val viewModel: HomeViewModel by viewModels {
        Factory {
            (requireContext() as App).appComponent.homeViewModel()
        }
    }


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

    fun Fragment.getAppComponent(): AppComponent =
        (requireContext() as App).appComponent

    override fun onStop() {
        super.onStop()
        scope.cancel()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        class Factory<T : ViewModel>(private val create: () -> T) : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return create.invoke() as T
            }

        }
    }
}
