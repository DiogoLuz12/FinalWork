package com.example.finalwork

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaArtista(db: SQLiteDatabase) : TabelasBD(db, NOME)  {

    override fun cria(){
        (        db.execSQL("CREATE TABLE $nome  (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,  $CAMPO_TITULO TEXT NOT NULL, $CAMPO_AUTOR TEXT NOT NULL, $CAMPO_CATEGORIA_ID INTEGER NOT NULL, FOREIGN KEY ($CAMPO_CATEGORIA_ID) REFERENCES " +
                "${TabelaBDCategorias.NOME}(${BaseColumns._ID})ON DELETE RESTRICT)")
                )
    }

    companion object{
        const val NOME = "Name"
        const val BDY = "Birthay"
        const val GENRE = "Genre"
        const val BIO = "Biography"
    }
}