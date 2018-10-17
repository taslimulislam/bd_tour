package com.example.dell.bd_tour;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class datatabaseHelper  extends SQLiteOpenHelper{

    private static final String Tag = "DatabaseHelper";
    private static final String COL0 = "ID";
    private static final String COL1 = "name";
    private static final String TABLE_NAME = "users_data";




    public datatabaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String createTable = "CREATE TABLE "+TABLE_NAME+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT,"+
                COL1 +" TEXT)";

        sqLiteDatabase.execSQL(createTable);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(sqLiteDatabase);



    }

    public boolean addDATA(String name){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues content = new ContentValues();

        content.put(COL1,name);
        long result = sqLiteDatabase.insert(TABLE_NAME,null,content);
        if (result==-1){
            return false;
        }
        else {
            return true;
        }

    }

    public Cursor getdata(){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME ;
        Cursor data = sqLiteDatabase.rawQuery(query,null);
        return data;
    }

}
