package com.example.appmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

data class Album(val nombre: String, val artista: String, val año: String)

class pantallaAlbumes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_albumes)
        val albumes = listOf(
            Album("Dark Side of the Moon", "Pink Floyd", "1973"),
            Album("Thriller", "Michael Jackson", "1982"),
            Album("Abbey Road", "The Beatles", "1969"),
            Album("The Wall", "Pink Floyd", "1979"),
            Album("Back in Black", "AC/DC", "1980"),
            Album("Rumours", "Fleetwood Mac", "1977"),
            Album("Led Zeppelin IV", "Led Zeppelin", "1971"),
            Album("Hotel California", "Eagles", "1976"),
            Album("The Joshua Tree", "U2", "1987"),
            Album("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", "1967"),
            Album("Purple Haze", "Jimi Hendrix", "1970"),
            Album("The Dark Side of the Moon", "Pink Floyd", "1973"),
            Album("Like a Virgin", "Madonna", "1984"),
            Album("Bridge Over Troubled Water", "Simon & Garfunkel", "1970"),
            Album("Born to Run", "Bruce Springsteen", "1975"),
            Album("A Night at the Opera", "Queen", "1975"),
            Album("Sticky Fingers", "The Rolling Stones", "1971"),
            Album("Bad", "Michael Jackson", "1987"),
            Album("Purple Rain", "Prince", "1984"),
            Album("Physical Graffiti", "Led Zeppelin", "1975")
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, albumes.map { it.nombre })
        val listView: ListView = findViewById(R.id.listView)  // Asegúrate de cambiar "listView" al ID correcto en tu archivo XML

        listView.adapter = adapter
    }
}