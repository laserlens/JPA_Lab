package com.astontech.dao;

import com.astontech.bo.Phone;

import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public interface PhoneDAO {

    //region select methods
    Phone selectPhoneId(int phoneId);
    List<Phone> selectPhonesAll();
    //endregion

    //region insert,update,delete methods
    int insertPhone (Phone phone);
    boolean updatePhone (Phone phone);
    boolean deletePhone (int phoneId);
    //endregion

}
