package pt.reviews.movies

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaBDActors(db: SQLiteDatabase) : TabelaBD(db, NOME) {

    override fun cria() {
        db.execSQL(
            "CREATE TABLE $nome (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "$CAMPO_NOME TEXT NOT NULL, $CAMPO_TEMPO TEXT NOT NULL )"
        )
    }

    companion object {
        const val NOME = "Actors"
        const val CAMPO_NOME = "Nome"
        const val CAMPO_TEMPO = "Tempo de tela"

    }
}