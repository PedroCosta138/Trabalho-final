package pt.reviews.movies

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteQueryBuilder
import android.provider.BaseColumns

class TabelaBDReviews (db: SQLiteDatabase) : TabelaBD(db, NOME) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,$CAMPO_RATE INT NOT NULL, $CAMPO_TITULO TEXT NOT NULL, $CAMPO_REVIEW TEXT NOT NULL)")
    }



    companion object {
        const val NOME = "reviews"

        const val CAMPO_ID = "$NOME.${BaseColumns._ID}"
        const val CAMPO_RATE= "rate"
        const val CAMPO_TITULO = "titulo"
        const val CAMPO_REVIEW = "review"


        val TODAS_COLUNAS = arrayOf(CAMPO_ID,CAMPO_RATE ,CAMPO_TITULO, CAMPO_REVIEW)
    }
}