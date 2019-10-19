package com.aad.alc4.team10.animatedweatherapp.ui.main

import android.provider.ContactsContract
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.aad.alc4.team10.animatedweatherapp.R


import com.aad.alc4.team10.animatedweatherapp.ui.main.RegionFragment.OnListFragmentInteractionListener
import com.aad.alc4.team10.animatedweatherapp.ui.main.dummy.DummyContent.DummyItem

import kotlinx.android.synthetic.main.fragment_region.view.*

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */

data class Region(
    val name: String?,
    val photoResource: Int?,
    val id: Long?
)

class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    private val regionPhoto by lazy {
        view.findViewById<ImageView>(R.id.region_photo_image_view)
    }

    private val regionName by lazy {
        view.findViewById<TextView>(R.id.region_name_text_view)
    }

    fun bind(region: Region) = with(region) {
        regionPhoto.setImageResource(photoResource ?: R.drawable.place_holder_region)
        regionName.text = region.name ?: "-------"
    }
}

class MyRegionRecyclerViewAdapter(
    private val regions: List<Region>,
    private val onItemClicked: (Long?) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_region, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = regions[position]
        .also { holder.bind(it) }
        .let { region -> holder.view.setOnClickListener { onItemClicked(region.id) } }

    override fun getItemCount(): Int = regions.size
}