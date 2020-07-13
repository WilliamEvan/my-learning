package com.wzx.example.Flyweight.pool;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        //...
        pool.release(conn);
    }
}
