package com.astontech.dao;

import com.astontech.bo.Person;

import java.util.List;

/**
 * Created by Adrian.Flak on 5/24/2017.
 */
public interface PersonDAO {

    //region get method
    Person selectPersonById(int personId);
    List<Person> selectPersonList();
    //endregion

    //region execute method
    int insertPerson(Person person);
    boolean updatePerson(Person person);
    boolean deletePerson(int personId);
    //endregion

}
