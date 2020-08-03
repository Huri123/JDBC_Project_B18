package com.cybertek.jdbc.day1;

import java.sql.*;

public class IteratingResultSet {

    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@100.26.232.158:1521:XE";
        String username = "hr" ;
        String password = "hr" ;
        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;
        Statement stmnt = conn.createStatement();
        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM REGIONS") ;


        // as long as rs.next() return true I know I have next row to print the data
        // we will keep looping as long as rs.next() return true

        while (rs.next() == true ){

            System.out.println( rs.getString("REGION_ID") + " " + rs.getString("REGION_NAME") );

        }

//
//        rs.next(); // currently we are at the first row
//        System.out.println( rs.getString("REGION_ID") + " " + rs.getString("REGION_NAME") );
//
//        rs.next();// currently we are at the second row
//        System.out.println( rs.getString(1) + " " + rs.getString(2) );
//
//        rs.next(); // currently we are at the third row
//        System.out.println( rs.getString("REGION_ID") + " " + rs.getString("REGION_NAME") );
//
////        rs.next();// currently we are at the forth row
////        System.out.println( rs.getString(1) + " " + rs.getString(2) );
//
//        System.out.println(  rs.next()   );         ;// currently we are at the forth row //Artik daha row varmi diye ogrenmek icin yaptik. varsa true yoksa false.
//        //System.out.println( rs.getString(1) + " " + rs.getString(2) );



    }

}

/*
Akbar's Codes:

 */