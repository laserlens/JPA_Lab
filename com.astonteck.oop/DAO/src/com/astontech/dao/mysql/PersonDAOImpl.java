package com.astontech.dao.mysql;

import com.astontech.bo.Person;
import com.astontech.dao.PersonDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class PersonDAOImpl extends MySQL implements PersonDAO{

    @Override
    public Person selectPersonById(int personId) {
        Connect();
        Person person = null; //null so if no records returned no memory used
        try {
            String sp = "{call getPerson(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, personId);

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
            String sp = "{call getPerson(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 0);

            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            while(rs.next()) {
                personList.add( HydrateObject(rs));
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return personList;
    }

    @Override
    public int insertPerson(Person person) {
        return 0;
    }

    @Override
    public boolean updatePerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(int personId) {
        return false;
    }

    private static Person HydrateObject(ResultSet rs) throws SQLException {

        Person person = new Person();
        person.setPersonid(rs.getInt(1));
        person.setFirstName(rs.getString(3));
        person.setLastName(rs.getString(4));

        return person;
    }
}
