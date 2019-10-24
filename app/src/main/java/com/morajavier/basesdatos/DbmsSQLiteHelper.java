package com.morajavier.basesdatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class DbmsSQLiteHelper extends SQLiteOpenHelper implements BaseColumns {

    String sqlCreate = "CREATE TABLE Contactos (_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT)";
    public DbmsSQLiteHelper(Context c, String s, SQLiteDatabase.CursorFactory cf, int v){
        super(c, s, cf, v);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(sqlCreate);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqld, int ov, int nv) {
        sqld.execSQL("DROP TABLE IF EXISTS Contactos");
        sqld.execSQL(sqlCreate);
    }

}
