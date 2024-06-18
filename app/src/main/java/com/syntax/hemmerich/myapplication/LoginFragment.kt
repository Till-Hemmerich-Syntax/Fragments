package com.syntax.hemmerich.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.syntax.hemmerich.myapplication.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // hier wird der View erstellt und von uns das ViewBinding übergeben
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflatet das ViewBinding und gibt dies als View zurück
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }
    // hier ist der View bereits erstellt ("created")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            // beim klicken des Buttons navigieren wir via der Navigations Directions zu unserem HomeFragment und übergeben denn Namen
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment2(binding.editTextText.text.toString()))
        }
    }

}