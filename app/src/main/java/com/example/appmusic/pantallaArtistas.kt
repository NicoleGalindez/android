package com.example.appmusic

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

data class Artista(val nombre: String, val genero: String)

class pantallaArtistas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_artistas)

        val listaArtistas = listOf(
            Artista("Artista 1", "1 cancion"),
            Artista("Artista 2", "1 cancion"),
            Artista("Artista 3", "1 cancion"),
            Artista("Artista 4", "1 cancion"),
            Artista("Artista 5", "1 cancion"),
            Artista("Artista 6", "1 cancion"),
            Artista("Artista 7", "1 cancion"),
            Artista("Artista 8", "1 cancion"),
            Artista("Artista 9", "1 cancion"),
            Artista("Artista 10", "1 cancion"),
            Artista("Artista 11", "1 cancion"),
            Artista("Artista 12", "1 cancion"),
            Artista("Artista 13", "1 cancion"),
            Artista("Artista 14", "1 cancion"),
            Artista("Artista 15", "1 cancion"),
            Artista("Artista 16", "1 cancion"),
            Artista("Artista 17", "1 cancion"),
            Artista("Artista 18", "1 cancion"),
            // Agrega más artistas según sea necesario
        )

        val listView: ListView = findViewById(R.id.listView)

        // Crea un adaptador personalizado para la lista de artistas
        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, listaArtistas.map { it.nombre + "\n" + it.genero })

        // Asigna el adaptador a la ListView
        listView.adapter = adaptador
    }
}
