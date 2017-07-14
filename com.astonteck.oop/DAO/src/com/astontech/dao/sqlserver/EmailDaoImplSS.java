package com.astontech.dao.sqlserver;

import com.astontech.bo.Email;
import com.astontech.dao.EmailDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class  EmailDaoImplSS extends SQLServer implements EmailDAO {
    @Override
    public Email selectEmailId(int emailId) {
        Connect();
        Email email = null; //null so if no records returned no memory used
        try {
            String sp = "{call usp_SelectEmail(?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, emailId);

            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            if(rs.next()) {
                email = HydrateObject(rs);
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }
        return email;
    }

    @Override
    public List<Email> selectEmailsAll() {
        Connect();
        List<Email> emailList = new ArrayList<>();
        try {
            String sp = "{call usp_SelectEmailsAll()}";
            CallableStatement cStmt = connection.prepareCall(sp);


            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            while (rs.next()) {

                emailList.add(HydrateObject(rs));
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return emailList;
    }


    @Override
    public int insertEmail(Email email) {
        return 0;
    }

    @Override
    public boolean updateEmail(Email email) {
        return false;
    }

    @Override
    public boolean deleteEmail(int emailId) {
        return false;
    }

    private static Email HydrateObject(ResultSet rs) throws SQLException {

        Email email = new Email();
        email.setEmailid(rs.getInt(1));
        email.setEmailAddress(rs.getString(2));
        email.setEntityid(rs.getInt(3));
        email.setPersonid(rs.getInt(4));
        email.setEmployeeid(rs.getInt(5));
        email.setClientid(rs.getInt(6));
        return email;
    }
}