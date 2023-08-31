package com.example.facade;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleDBConnection(){
        // Get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String table, Connection con){
        // Get data from table and generate PDF report
    }

    public void generateOracleHTMLReport(String table, Connection con){
        // Get data from table and generate HTML report
    }
}
