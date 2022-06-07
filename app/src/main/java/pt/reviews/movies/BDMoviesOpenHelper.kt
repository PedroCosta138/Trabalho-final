package pt.reviews.movies

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BDMoviesOpenHelper(context: Context?) : SQLiteOpenHelper(context, NOME, null, VERSAO) {

    override fun onCreate(db: SQLiteDatabase?) {
        requireNotNull(db)

        TabelaBDActors(db).cria()
        TabelaBDMovies(db).cria()
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    companion object {
        const val NOME = "movies.db"
        private const val VERSAO = 1
    }
}