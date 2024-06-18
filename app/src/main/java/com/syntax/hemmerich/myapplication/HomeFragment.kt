package com.syntax.hemmerich.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.syntax.hemmerich.myapplication.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    // Initialisiert das ViewBinding
    private lateinit var binding: FragmentHomeBinding
    // Initialisiert die Argumente von SaveArgs
    private val args : HomeFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    // hier wird der View erstellt und von uns das ViewBinding übergeben
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflatet das ViewBinding und gibt dies als View zurück
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }
    // hier ist der View bereits erstellt ("created")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView2.text = "Hallo "+args.name
    }



}