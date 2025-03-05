package com.example.myapplication.Entities;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class RoomDB extends RoomDatabase {

    public abstract UserDAO getUserDAO();

}
