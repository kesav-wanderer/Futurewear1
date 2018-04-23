package com.example.kedu.futurewear;

/**
 * Created by saike on 17-04-2018.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DB_helper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "future_wear.db";
    private static final int DATABASE_VERSION = 1;

    // Database creation sql statement
    private static final String CREATE_TABLE_FILTER =
            "create table contact (_id integer primary key autoincrement, "
                    + "Main_Category text not null, Sub_Category text, ";
    String sql =
            "INSERT or replace INTO tbl_Contain(Main_Category,Sub_Category) VALUES('Social Impact','Fair Trade Sourcing')" ;

    public DB_helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(CREATE_TABLE_FILTER);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(DB_helper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");

        db.execSQL("DROP TABLE IF EXISTS contact");
        onCreate(db);
    }

}
