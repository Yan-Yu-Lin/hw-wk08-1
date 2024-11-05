package com.example.lab5

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ThirdFragment : Fragment() {

    // Called when the fragment is attached to its host activity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("ThirdFragment", "onAttach called")
    }

    // Called when the fragment is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("ThirdFragment", "onCreate called")
    }

    // Called to create the view hierarchy associated with the fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("ThirdFragment", "onCreateView called")
        // Inflate the fragment's layout and return the View object
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    // Called immediately after `onCreateView` has been executed
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("ThirdFragment", "onViewCreated called")
    }

    // Called when the fragment becomes visible to the user
    override fun onStart() {
        super.onStart()
        Log.e("ThirdFragment", "onStart called")
    }

    // Called when the fragment becomes actively visible and ready for user interaction
    override fun onResume() {
        super.onResume()
        Log.e("ThirdFragment", "onResume called")
    }

    // Called when the fragment is partially obscured (e.g., another activity comes into focus)
    override fun onPause() {
        super.onPause()
        Log.e("ThirdFragment", "onPause called")
    }

    // Called when the fragment is no longer visible to the user
    override fun onStop() {
        super.onStop()
        Log.e("ThirdFragment", "onStop called")
    }

    // Called when the view associated with the fragment is being destroyed
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("ThirdFragment", "onDestroyView called")
    }

    // Called when the fragment is being destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.e("ThirdFragment", "onDestroy called")
    }

    // Called when the fragment is detached from the activity
    override fun onDetach() {
        super.onDetach()
        Log.e("ThirdFragment", "onDetach called")
    }
}
