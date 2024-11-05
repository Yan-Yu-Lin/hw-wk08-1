package com.example.lab5

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : Fragment() {

    // Called when the fragment is attached to its host activity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("SecondFragment", "onAttach called")
    }

    // Called to do initial creation of the fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("SecondFragment", "onCreate called")
    }

    // Called to create the view hierarchy associated with the fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("SecondFragment", "onCreateView called")
        // Inflate the layout for this fragment and return the View object
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    // Called immediately after `onCreateView` has been executed
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("SecondFragment", "onViewCreated called")
    }

    // Called when the fragment becomes visible
    override fun onStart() {
        super.onStart()
        Log.e("SecondFragment", "onStart called")
    }

    // Called when the fragment is visible and the user can interact with it
    override fun onResume() {
        super.onResume()
        Log.e("SecondFragment", "onResume called")
    }

    // Called when the fragment is no longer interacting with the user
    override fun onPause() {
        super.onPause()
        Log.e("SecondFragment", "onPause called")
    }

    // Called when the fragment is no longer visible to the user
    override fun onStop() {
        super.onStop()
        Log.e("SecondFragment", "onStop called")
    }

    // Called when the fragment's view is about to be destroyed
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("SecondFragment", "onDestroyView called")
    }

    // Called to clean up resources when the fragment is being destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.e("SecondFragment", "onDestroy called")
    }

    // Called when the fragment is detached from its host activity
    override fun onDetach() {
        super.onDetach()
        Log.e("SecondFragment", "onDetach called")
    }
}
