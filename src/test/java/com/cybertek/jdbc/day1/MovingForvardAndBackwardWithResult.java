package com.cybertek.jdbc.day1;

import java.sql.*;

public class MovingForvardAndBackwardWithResult {
    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@100.26.232.158:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");


        // as long as rs.next() return true I know I have next row to print the data
        // we will keep looping as long as rs.next() return true

        //once sql developerda manual(select * from countries;) yap.sonra ona gore code yaz.Karsilastir
        



    }
}
