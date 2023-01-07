package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DbDAO {

    @Insert
    void insert (Dbase db);

    @Update
    void update (Dbase db);

    @Delete
    void delete (Dbase db);

    @Query("DELETE FROM d_base")
    void deleteAll();

    @Query("SELECT * FROM d_base")
    LiveData<List<Dbase>> getAll();

}
