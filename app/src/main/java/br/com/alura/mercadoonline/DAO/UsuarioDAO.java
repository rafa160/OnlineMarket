package br.com.alura.mercadoonline.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UsuarioDAO extends SQLiteOpenHelper {
    public UsuarioDAO(@androidx.annotation.Nullable Context context) {
        super(context, "Mercado", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Mercado (id INTEGER PRIMARY KEY, mercado TEXT NOT NULL, nome TEXT NOT NULL, email TEXT NOT NULL, telefone TEXT NOT NULL, senha TEXT NOT NULL);";
        db.execSQL(sql);

    }

    // usar quando for utilizar o BD, lembrar de sempre que atualizar mudar a versao do BD
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS mercado";
        db.execSQL(sql);
        onCreate(db);

    }
}
