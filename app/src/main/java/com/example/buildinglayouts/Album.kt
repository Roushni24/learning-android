package com.example.buildinglayouts

data class Album(
    val nameOfTheAlbum: String
) {

    companion object {

        fun albumsData(): List<Album> {

            val albumsList = listOf(
                Album("Ultraviolence"),
                Album("Born to Die"),
                Album("Rebel heart"),
                Album("Positions"),
                Album("2012"),
                Album("fearless"),
                Album("Speak Now"),
                Album("Blue Banisters"),
                Album("Pink"),
                Album("Paradise"),
                Album("Ultraviolence"),
                Album("Born to Die"),
                Album("Rebel heart"),
                Album("Positions"),
                Album("2012"),
                Album("fearless"),
                Album("Speak Now"),
                Album("Blue Banisters"),
                Album("Pink"),
                Album("Paradise"),
            )

            return albumsList
        }
    }
}
