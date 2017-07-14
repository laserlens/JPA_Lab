package com.astontech.dao.sqlserver;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public abstract class SQLServer {

    //region Parameters for db connection
    protected static String url = "jdbc:sqlserver://localhost:1433;databaseName=master;integratedSecurity=true";
    //endregion

    protected static Connection connection = null;

    final static Logger logger = Logger.getLogger(SQLServer.class);

    protected static void Connect(){

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            logger.error("sqlserver Driver Not Found: " + ex);
        }

        logger.info("sqlserver Driver Found");


        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            logger.error("Connection to sqlserver DataBase Failed: " + ex);

        }

        if(connection != null){
            logger.info("Success! Connected to sqlserver DataBase");

        } else {
            logger.info("connection failed");

        }

    }



}
