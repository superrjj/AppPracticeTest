package com.example.myapplication.Entities;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDAO {

    @Insert
    void insertUser(User user);
    @Query("select * from credentials") //Retrieve
    List<User> getAllUser();

}
