package com.example.mvvmhomework2.ui.fragment

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.mvvmhomework2.R
import com.example.mvvmhomework2.data.model.Car
import com.example.mvvmhomework2.databinding.FragmentAddElementBinding
import com.example.mvvmhomework2.ui.models.Car3ViewModel

class AddElementFragment : Fragment() {

    private var _binding: FragmentAddElementBinding? = null
    private val binding get() = _binding!!
    private val viewModel by activityViewModels<Car3ViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddElementBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goBack()
    }

    private fun goBack()  = with(binding) {
            btnElement.setOnClickListener {
                progressbarTwo.isVisible = true
                Handler().postDelayed({
                    progressbarTwo.isVisible = false
                    viewModel.addBleach(
                        Car(
                            image = R.drawable.shtorm,
                            name =  etName.text.toString().trim(),
                            riderNumber = etNumber.text.toString().trim()
                        )
                    )
                    findNavController().navigateUp()
                }, 2000)
            }
        }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
