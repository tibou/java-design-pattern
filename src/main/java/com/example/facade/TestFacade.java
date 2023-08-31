package com.example.facade;

import java.sql.Connection;

/*
    Structural design pattern

    Facade design pattern is used to help client applications to easily interact with the system.
    According to GoF Facade design pattern is:
        - Provide a unified interface to a set of interfaces in a subsystem.
        - Facade Pattern defines a higher-level interface that makes the subsystem easier to use.
    Suppose we have an application with set of interfaces to use MySql/Oracle database and to
    generate different types of reports, such as HTML report, PDF report etc. So we will have
    different set of interfaces to work with different types of database. Now a client
    application can use these interfaces to get the required database connection and generate
    reports. But when the complexity increases or the interface behavior names are confusing,
    client application will find it difficult to manage it. So we can apply Facade design
    pattern here and provide a wrapper interface on top of the existing interface to help
    client application.

    Facade Design Pattern Important Points
        - Facade design pattern is more like a helper for client applications, it doesn’t hide
            subsystem interfaces from the client. Whether to use Facade or not is completely
            dependent on client code.
        - Facade design pattern can be applied at any point of development, usually when the
            number of interfaces grow and system gets complex.
        - Subsystem interfaces are not aware of Facade and they shouldn’t have any reference
            of the Facade interface.
        - Facade design pattern should be applied for similar kind of interfaces, its purpose
            is to provide a single interface rather than multiple interfaces that does the
            similar kind of jobs.
        - We can use Factory pattern with Facade to provide better interface to client systems.



 */
public class TestFacade {
    public static void main(String[] args){
        String table="employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(table, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(table, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBType.MYSQL, HelperFacade.ReportType.HTML,table);
        HelperFacade.generateReport(HelperFacade.DBType.ORACLE, HelperFacade.ReportType.PDF, table);
    }
}
