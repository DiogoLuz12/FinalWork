package com.example.finalwork

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaMusic( val db: SQLiteDatabase) : TabelasBD(db, TabelaArtista.NOME) {


    override fun cria(){

        (        db.execSQL("CREATE TABLE $Music_ID  (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,  $CAT TEXT NOT NULL, $MUSICN TEXT NOT NULL, $LSongs INTEGER NOT NULL" ))
    }

    companion object{
        const val CAT = "Categories"
        const val MUSICN = "Music Name"
        const val LSongs = "Liked Songs"

    }
}