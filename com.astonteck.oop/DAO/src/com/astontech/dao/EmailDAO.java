package com.astontech.dao;

import com.astontech.bo.Email;

import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public interface EmailDAO {

    //region select methods
    Email selectEmailId(int emailId);
    List<Email> selectEmailsAll();
    //endregion

    //region insert,update,delete methods
    int insertEmail(Email email);
    boolean updateEmail(Email email);
    boolean deleteEmail(int emailId);
    //endregion

}
