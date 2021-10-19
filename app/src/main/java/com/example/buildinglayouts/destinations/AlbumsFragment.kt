package com.example.buildinglayouts.destinations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.buildinglayouts.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


/**
 * A simple [Fragment] subclass.
 * Use the [AlbumsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlbumsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_albums, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fab: FloatingActionButton = view.findViewById(R.id.add_fab)
        fab.setOnClickListener{
            //Toast.makeText(requireContext(), "I am a toast", Toast.LENGTH_LONG).show()
            Snackbar.make(view, "Internet not available", Snackbar.LENGTH_LONG)
                .setAction("Retry", {
                    Toast.makeText(requireContext(), "Internet is available", Toast.LENGTH_LONG).show()

                })


                .show()





        }
    }

}