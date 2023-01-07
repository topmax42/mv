package com.example.myapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Dbase.class , version = 1)
public abstract class DbDatabase extends RoomDatabase {

    //creating global instance of the abstract class
    private  static  DbDatabase dbinst;

    public  abstract DbDAO dao();
    public static synchronized DbDatabase getInstance(Context c)
    {
        if(dbinst == null)
        {
            dbinst = Room.databaseBuilder(c.getApplicationContext(),DbDatabase.class, "d_base")
                    .fallbackToDestructiveMigration().build();
        }
        return dbinst;
    }

}
