package com.example.jack.tourismapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jack on 17-10-2016.
 */

public class DB extends SQLiteOpenHelper {
    public DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(id_usuario integer primary key autoincrement, Email text, Nickname text, Name_user text, Password text)");
        db.execSQL("insert into usuarios() values('admin','admin','admin','admin')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table usuarios(id_usuario integer primary key autoincrement, Email text, Nickname text, Name_user text, Password text)");
        db.execSQL("insert into usuarios() values('admin','admin','admin','admin')");
    }
}
