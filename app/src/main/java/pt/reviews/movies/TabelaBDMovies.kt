package pt.reviews.movies

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaBDMovies(db: SQLiteDatabase) : TabelaBD(db, NOME)  {

    override fun cria() {
        db.execSQL("CREATE TABLE $nome (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$CAMPO_TITULO TEXT NOT NULL, $CAMPO_REALIZADOR TEXT NOT NULL, $CAMPO_rDate TEXT NOT NULL,$CAMPO_DURACAO TEXT NOT NULL )")
    }

    companion object {
        const val NOME = "Movies"
        const val CAMPO_TITULO = "titulo"
        const val CAMPO_REALIZADOR = "Realizador"
        const val CAMPO_DURACAO = "Duração"
        const val CAMPO_rDate = "Data de estreia"

    }
}