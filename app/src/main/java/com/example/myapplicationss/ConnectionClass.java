package com.example.myapplicationss;


import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class ConnectionClass {

    protected static String DB = ""; //kayo mag kakabit dito
    protected static String IP = "192.168.100.155"; //kayo mag kakabit dito

    protected static String PORT = "3306";

    protected static String USER = ""; //kayo mag kakabit dito

    protected static String PASS = ""; //kayo mag kakabit dito

    public Connection CONN() {
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectiongString = "jdbc:mysql://"+IP+":"+PORT+"/"+DB;
            conn = DriverManager.getConnection(connectiongString,USER,PASS);
        }catch (Exception e) {
            Log.e("ERROR", Objects.requireNonNull(e.getMessage()));
        }
        return conn;
    }
}
