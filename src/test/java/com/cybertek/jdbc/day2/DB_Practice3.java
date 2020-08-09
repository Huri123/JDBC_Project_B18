package com.cybertek.jdbc.day2;

import com.cybertek.jdbc.utility.DB_Utility;

import java.sql.*;
import java.util.*;

//getting the row as a map

/*
// we need to get column name of our columns to store them into the map as the key and the value.
// that's why we need to use ResultSetMetaData through which we get columnName using getColumnName() method
ResultSetMetaData rsmd = rs.getMetaData();
for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
    System.out.println( rsmd.getColumnName(i)  );
}
 */

public class DB_Practice3 {

    public static void main(String[] args) throws SQLException {


        DB_Utility.createConnection();
        ResultSet rs = DB_Utility.runQuery("SELECT * FROM COUNTRIES") ;
        rs.next();
        // STORE FIRST ROW DATA AS A MAP<String,String>
        // the key of the map is column name , value of the map is the column data
        Map<String,String> rowMap = new HashMap<>();
//        rowMap.put("REGION_ID", "1");
//        rowMap.put("REGION_NAME" ,"Europe" );

//        rowMap.put("REGION_ID",   rs.getString(1) );
//        rowMap.put("REGION_NAME" ,rs.getString(2) );

        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount();  i++) {
//            System.out.println( rsmd.getColumnName(i)   );
            String columnName = rsmd.getColumnName(i);
            String columnValue = rs.getString(i) ;
            rowMap.put(columnName ,  columnValue  );
        }
        System.out.println("rowMap = " + rowMap);

        System.out.println("Country name is " +  rowMap.get("COUNTRY_NAME")  );

        DB_Utility.destroy();

    }


}
/*
Akbar's Codes:

import oracle.ucp.routing.Chunk;

import java.sql.*;
import java.util.*;

public class DB_Practice3 {

    public static void main(String[] args) throws SQLException {


        DB_Utility.createConnection();
        ResultSet rs = DB_Utility.runQuery("SELECT * FROM COUNTRIES") ;
        rs.next();
        // STORE FIRST ROW DATA AS A MAP<String,String>
        // the key of the map is column name , value of the map is the column data
        Map<String,String> rowMap = new HashMap<>();
//        rowMap.put("REGION_ID", "1");
//        rowMap.put("REGION_NAME" ,"Europe" );

//        rowMap.put("REGION_ID",   rs.getString(1) );
//        rowMap.put("REGION_NAME" ,rs.getString(2) );

        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount();  i++) {
//            System.out.println( rsmd.getColumnName(i)   );
            String columnName = rsmd.getColumnName(i);
            String columnValue = rs.getString(i) ;
            rowMap.put(columnName ,  columnValue  );
        }
        System.out.println("rowMap = " + rowMap);

        System.out.println("Country name is " +  rowMap.get("COUNTRY_NAME")  );

        DB_Utility.destroy();

    }


} */