package com.astontech.dao.sqlserver;


import com.astontech.bo.Employee;
import com.astontech.dao.EmployeeDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class EmployeeDaoImplSS extends SQLServer implements EmployeeDAO {
    @Override
    public Employee selectEmployeebyId(int employeeId) {
        Connect();
        Employee employee = null; //null so if no records returned no memory used
        try {
            String sp = "{call usp_SelectEmployee(?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, employeeId);

            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            if(rs.next()) {
                employee = HydrateObject(rs);
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }
        return employee;
    }

    @Override
    public List<Employee> selectEmployeesAll() {
        Connect();
        List<Employee> employeeList = new ArrayList<Employee>();
        try {
            String sp = "{call usp_SelectEmployeesAll()}";
            CallableStatement cStmt = connection.prepareCall(sp);


            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            while (rs.next()) {

                employeeList.add(HydrateObject(rs));
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return employeeList;
    }

    @Override
    public int insertEmployee(Employee employee) {
        return 0;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteEmployee(int employeeId) {
        return false;
    }

    private static Employee HydrateObject(ResultSet rs) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeid(rs.getInt(13));
        employee.setTitle(rs.getString(1));
        employee.setFirstName(rs.getString(2));
        employee.setLastName(rs.getString(3));
        employee.setHireDate(rs.getDate(5));
        employee.setTermdate(rs.getDate(9));
        employee.setBirthDate(rs.getDate(10));
        employee.setCreateDate(rs.getDate(11));
        employee.setPersonid(rs.getInt(12));
        return employee;
    }
}