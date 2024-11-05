package com.example.lab5

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment : Fragment() {

    // Called when the fragment is first attached to its context
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("FirstFragment", "onAttach called")
    }

    // Called when the fragment is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FirstFragment", "onCreate called")
    }

    // Called when the fragment is about to create its view hierarchy
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("FirstFragment", "onCreateView called")
        // Inflate the fragment's layout and return the View object
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    // Called immediately after the view has been created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("FirstFragment", "onViewCreated called")
    }

    // Called when the fragment becomes visible
    override fun onStart() {
        super.onStart()
        Log.e("FirstFragment", "onStart called")
    }

    // Called when the fragment becomes active and visible (ready to interact)
    override fun onResume() {
        super.onResume()
        Log.e("FirstFragment", "onResume called")
    }

    // Called when the fragment is no longer in the foreground (but still visible)
    override fun onPause() {
        super.onPause()
        Log.e("FirstFragment", "onPause called")
    }

    // Called when the fragment is no longer visible (fully stopped)
    override fun onStop() {
        super.onStop()
        Log.e("FirstFragment", "onStop called")
    }

    // Called when the fragment's view is about to be destroyed
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FirstFragment", "onDestroyView called")
    }

    // Called when the fragment is being destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.e("FirstFragment", "onDestroy called")
    }

    // Called when the fragment is detached from its context
    override fun onDetach() {
        super.onDetach()
        Log.e("FirstFragment", "onDetach called")
    }
}
