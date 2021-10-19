package com.example.buildinglayouts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AlbumsAdapter : RecyclerView.Adapter<AlbumsAdapter.AlbumsViewHolder>() {

    private val albumsListData: List<Album> = Album.albumsData()

    class AlbumsViewHolder(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {

        fun bind(
            album: Album
        ) {
            val albumsTextView: TextView = view.findViewById(R.id.item_album_name)
            albumsTextView.text = album.nameOfTheAlbum
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AlbumsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_album, parent, false)
        return AlbumsViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumsViewHolder, position: Int) {
        // 1 -> Album("Album name")
        val currentAlbum: Album = albumsListData[position]
        holder.bind(currentAlbum)
    }

    override fun getItemCount(): Int {
        return albumsListData.size
    }
}