package com.example.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBType dbType, ReportType reportType, String table) {
        Connection con = null;
        switch (dbType) {
            case MYSQL:
                con = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(table, con);
                        break;
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(table, con);
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case PDF:
                        oracleHelper.generateOraclePDFReport(table, con);
                        break;
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(table, con);
                        break;
                }
                break;
        }
    }

    public enum DBType {
        MYSQL, ORACLE
    }

    public enum ReportType {
        PDF, HTML
    }
}
