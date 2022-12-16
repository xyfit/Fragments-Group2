package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible


class Fragment_1 : Fragment() {

    var imgPosition = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().findViewById<Button>(R.id.img_btn).setOnClickListener {
            imgPosition = !imgPosition
            requireActivity().findViewById<ImageView>(R.id.fr1_imageView).visibility =
                if (imgPosition){
                    View.VISIBLE
                }else{
                    View.INVISIBLE
                }
        }
    }


}