package com.wzx.example.Flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {

    private static Vector<Connection> pool;

    private String url = "jdbc:mysql://local:3306/test";
    private String userName = "root";
    private String password = "root";
    private String driver = "com.mysql.jdbc.Driver";

    private static final int poolSize = 5;

    public ConnectionPool(){
        for(int i = 0; i < poolSize; i++){
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url, userName, password);
                pool.add(connection);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public synchronized Connection getConnection(){
        if (pool.size() > 0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }
        return null;
    }

    public synchronized void release(Connection conn){
        pool.add(conn);
    }
}
