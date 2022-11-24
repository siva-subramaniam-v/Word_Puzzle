package com.example.wordpuzzle.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wordpuzzle.databinding.FragmentGameBinding

class GameFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGameBinding.inflate(inflater)

        binding.apply {
            hintToggle.setOnClickListener {
                hintText.visibility = View.VISIBLE
            }
        }

        //TODO: Add snackBars when ->
        // submitted answer is correct (msg: Yay! you got that one)
        // submitted answer is wrong (msg: "try again")
        // answer field is empty (msg: "please type the answer")

        //TODO: Add result fragment with lotte animation
        // add splash screen
        // add home screen (if possible)

        return binding.root
    }
}