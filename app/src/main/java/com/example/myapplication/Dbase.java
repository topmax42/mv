package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "d_base")
public class Dbase {
     @PrimaryKey (autoGenerate = true)
    int pk;

    private  String t;
    private  String d;

    public Dbase(String t, String d, int i) {
        this.t = t;
        this.d = d;
        this.i = i;
    }

    private  int i;

    public int getPk() {
        return pk;
    }

    public String getT() {
        return t;
    }

    public String getD() {
        return d;
    }

    public int getI() {
        return i;
    }
}
