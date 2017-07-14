package com.astontech.dao.sqlserver;

import com.astontech.bo.Person;
import com.astontech.dao.PersonDAO;
import common.helpers.SQLDateHelper;


import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class PersonDAOImplForSQLServer extends SQLServer implements PersonDAO{

        @Override
        public Person selectPersonById(int personId) {
            Connect();
            Person person = null; //null so if no records returned no memory used
            try {
                String sp = SSProcedures.callByIdPerson;
                CallableStatement cStmt = connection.prepareCall(sp);

                cStmt.setInt(1, personId);

                ResultSet rs = cStmt.executeQuery();

                //region Hydrating an Object
                if(rs.next()) {
                    person = HydrateObject(rs);
                }
                //endregion

            } catch (SQLException sqlEx) {
                logger.error(sqlEx);
            }

            return person;
        }

        @Override
        public List<Person> selectPersonList() {
            Connect();
            List<Person> personList = new ArrayList<Person>();
            try {
                String sp = SSProcedures.callALLPerson;
                CallableStatement cStmt = connection.prepareCall(sp);


                ResultSet rs = cStmt.executeQuery();

                //region Hydrating an Object
                while (rs.next()) {

                    personList.add(HydrateObject(rs));
                }
                //endregion

            } catch (SQLException sqlEx) {
                logger.error(sqlEx);
            }

            return personList;
        }

        @Override
        public int insertPerson(Person person) {
            Connect();
            int id = 0;//if returns zero not successful

//                    @Title varchar(10),
//                    @FirstName varchar(50),
//                    @LastName varchar(50),
//                    @BirthDate datetime,
//                    @DisplayFirstName varchar(50),
//                    @IsDelete bit,
//                    @Personid int OUTPUT
            try{
                String sp = SSProcedures.callInsertPerson;
                CallableStatement cStmt = connection.prepareCall(sp);

                cStmt.setString(1, person.getTitle());
                cStmt.setString(2, person.getFirstName());
                cStmt.setString(3, person.getLastName());
                cStmt.setDate(4, SQLDateHelper.utilToSQLDateConverter(person.getBirthDate()));
                cStmt.setString(5, person.getDisplayFirstName());
                cStmt.setInt(6,0);
                cStmt.setInt(7,0);

                ResultSet rs = cStmt.executeQuery();

                if (rs.next()){
                    id = rs.getInt(1);
                }


            }catch (SQLException sqlEx) {
                logger.error(sqlEx);
            }

            return id;
        }

        @Override
        public boolean updatePerson(Person person) {
        Connect();
        int id = 0;//if returns zero not successful

//                    @Personid int,
//                    @Title varchar(10),
//                    @FirstName varchar(50),
//                    @LastName varchar(50),
//                    @BirthDate datetime,
//                    @DisplayFirstName varchar(50),
//                    @IsDelete bit

        try{
            String sp = SSProcedures.callUpdatePerson;
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1,person.getPersonid());
            cStmt.setString(2, person.getTitle());
            cStmt.setString(3, person.getFirstName());
            cStmt.setString(4, person.getLastName());
            cStmt.setDate(5, SQLDateHelper.utilToSQLDateConverter(person.getBirthDate()));
            cStmt.setString(6, person.getDisplayFirstName());
            cStmt.setInt(7,0);


            ResultSet rs = cStmt.executeQuery();



            if (rs.next()){
                id = rs.getInt(1);
            }


        }catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return id > 0;
    }

    @Override
        public boolean deletePerson(int personId) {
        Connect();
        int id = 0;//if returns zero not successful

//                    @Personid int,
//                    @Title varchar(10),
//                    @FirstName varchar(50),
//                    @LastName varchar(50),
//                    @BirthDate datetime,
//                    @DisplayFirstName varchar(50),
//                    @IsDelete bit

        try{
            String sp = SSProcedures.callDeletePerson;
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1,personId);


            ResultSet rs = cStmt.executeQuery();



            if (rs.next()){
                id = rs.getInt(1);
            }


        }catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return id > 0;
        }

    private static Person HydrateObject(ResultSet rs) throws SQLException {

        Person person = new Person();
        person.setPersonid(rs.getInt(1));
        person.setTitle(rs.getString(2));
        person.setFirstName(rs.getString(3));
        person.setLastName(rs.getString(4));
        person.setBirthDate(rs.getDate(5));
        return person;
    }

}
