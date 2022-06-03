package com.example.finalwork

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase

class TabelasBD {
    abstract class TabelaBD (val db: SQLiteDatabase, val nome: String) {
        abstract fun cria()

        fun insert(values: ContentValues) =
            db.insert(nome, null, values)
        fun udpate(values: ContentValues, whereClause: String, whereArgs: Array<String>) =
            db.update(nome, values, whereClause, whereArgs)
        fun delete(whereClause: String, whereArgs: Array<String>) =
            db.delete(nome, whereClause, whereArgs)
        fun query(columns: Array<String>, selection: String, selectionArgs: Array<String>, groupBy: String, having: String, orderBy: String) =
            db.query(nome, columns, selection, selectionArgs, groupBy, having, orderBy)
    }
}