package com.astontech.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class MySQL {

    //region Parameters for db connection
    protected static String dbhost = "localhost";
    protected static String dbName = "master";
    protected static String dbUser = "consoleuser";
    protected static String dbPass = "consoleuser2317";
    protected static String useSSL = "false";
    protected static String procBod = "true";

    protected static final int GET_BY_ID = 10;
    protected static final int GET_COLLECTION = 20;
    protected static final int INSERT = 10;
    protected static final int UPDATE = 20;
    protected static final int DELETE = 30;
    //endregion

    protected static Connection connection = null;

    final static Logger logger = Logger.getLogger(MySQL.class);


    protected static void Connect(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            logger.error("MySQL Driver Not Found: " + ex);
        }

        logger.info("MySQL Driver Found");

        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + dbhost + ":3306/" + dbName + "?useSSL=" + useSSL + "&noAccessToProcedureBodies=" + procBod, dbUser, dbPass);
        } catch (SQLException ex) {
            logger.error("Connection to MySQL DataBase Failed: " + ex);
        }

        if(connection != null){
            logger.info("Success! Connected to MySQL DataBase");
        } else {
            logger.info("connection failed");
        }
    }



}
