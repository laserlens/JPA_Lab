package com.astontech.dao.sqlserver;


import com.astontech.bo.Phone;
import com.astontech.dao.PhoneDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class PhoneDaoImplSS extends SQLServer implements PhoneDAO {
    @Override
    public Phone selectPhoneId(int phoneId) {
        Connect();
        Phone phone = null; //null so if no records returned no memory used
        try {
            String sp = "{call usp_SelectPhone(?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, phoneId);

            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            if(rs.next()) {
                phone = HydrateObject(rs);
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }
        return phone;
    }

    @Override
    public List<Phone> selectPhonesAll() {
        Connect();
        List<Phone> phoneList = new ArrayList<>();
        try {
            String sp = "{call usp_SelectPhonesAll()}";
            CallableStatement cStmt = connection.prepareCall(sp);


            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            while (rs.next()) {

                phoneList.add(HydrateObject(rs));
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return phoneList;
    }

    @Override
    public int insertPhone(Phone phone) {
        return 0;
    }

    @Override
    public boolean updatePhone(Phone phone) {
        return false;
    }

    @Override
    public boolean deletePhone(int phoneId) {
        return false;
    }

    private static Phone HydrateObject(ResultSet rs) throws SQLException {

        Phone phone = new Phone();
        phone.setPhoneid(rs.getInt(1));
        phone.setEntityid(rs.getInt(2));
        phone.setClientid(rs.getInt(3));
        phone.setPersonid(rs.getInt(4));
        phone.setAreaCode(rs.getInt(5));
        phone.setPhoneNumber(rs.getInt(6));
        phone.setPhoneNumberPost(rs.getInt(7));

        return phone;
    }
}