package com.example.finalwork

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaPlaylist( val db: SQLiteDatabase) : TabelasBD(db, TabelaArtista.NOME) {


    override fun cria(){
        (        db.execSQL("CREATE TABLE $nome  (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,  $PNAME TEXT NOT NULL, $CREATION INTEGER NOT NULL, $DURATION INTEGER NOT NULL, $DESC TEXT NOT NULL"
                )
                )
    }

    companion object{
        const val PNAME = "Playlist Name"
        const val CREATION = "Creation Date"
        const val DURATION = "Duration"
        const val DESC = "Description"
    }
}