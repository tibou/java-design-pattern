package com.example.facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection(){
        // Get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String table, Connection con){
        // Get data from table and generate PDF report
    }

    public void generateMySqlHTMLReport(String table, Connection con){
        // Get data from table and generate HTML report
    }
}
