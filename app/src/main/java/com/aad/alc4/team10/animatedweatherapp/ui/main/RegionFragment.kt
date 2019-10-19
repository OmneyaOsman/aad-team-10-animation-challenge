package com.aad.alc4.team10.animatedweatherapp.ui.main

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.aad.alc4.team10.animatedweatherapp.R

import com.aad.alc4.team10.animatedweatherapp.ui.main.dummy.DummyContent
import com.aad.alc4.team10.animatedweatherapp.ui.main.dummy.DummyContent.DummyItem

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [RegionFragment.OnListFragmentInteractionListener] interface.
 */
class RegionFragment : Fragment() {
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    // TODO: Customize parameters
    private var columnCount = 1

    private var listener: CityFragment.OnListFragmentInteractionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_region_list, container, false)


    private fun RegionFragment.recycler(view: View?) {
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = MyRegionRecyclerViewAdapter(listOf()/*dummy*/) {}
            }
        }
    }
}
