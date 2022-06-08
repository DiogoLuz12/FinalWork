package com.example.finalwork

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaArtista( val db: SQLiteDatabase) : TabelasBD(db, NOME)  {

    override fun cria(){
        (        db.execSQL("CREATE TABLE $Artist_ID  (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,,$NOME TEXT NOT NULL,  $BDY INTERGER NOT NULL, $GENRE TEXT NOT NULL, $BIO TEXT NOT NULL)"))

    }

    companion object{
        const val NOME = "Name"
        const val BDY = "Birthay"
        const val GENRE = "Genre"
        const val BIO = "Biography"
    }
}