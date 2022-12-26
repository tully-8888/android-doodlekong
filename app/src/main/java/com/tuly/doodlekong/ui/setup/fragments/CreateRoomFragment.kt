package com.tuly.doodlekong.ui.setup.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tuly.doodlekong.databinding.FragmentCreateRoomBinding
import com.tuly.doodlekong.databinding.FragmentSelectRoomBinding

class CreateRoomFragment: Fragment() {
    private var _binding: FragmentCreateRoomBinding? =null
    private val binding: FragmentCreateRoomBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentCreateRoomBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}