package com.astontech.dao;

import com.astontech.bo.Employee;

import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public interface EmployeeDAO {

    //region select methods
    Employee selectEmployeebyId(int employeeId);
    List<Employee> selectEmployeesAll();
    //endregion

    //region insert,update,delete methods
    int insertEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(int employeeId);
    //endregion

}
