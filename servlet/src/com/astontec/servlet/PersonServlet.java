package com.astontec.servlet;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.astontech.bo.Person;
import com.astontech.dao.PersonDAO;

import com.astontech.dao.sqlserver.PersonDAOImplForSQLServer;
import common.helpers.SQLDateHelper;
import common.helpers.ServletHelper;
import org.apache.log4j.Logger;
import java.io.IOException;



/**
 * Created by Adrian.Flak on 6/13/2017.
 */
public class PersonServlet extends javax.servlet.http.HttpServlet {

    //region Parameters
    final static Logger logger = Logger.getLogger(PersonServlet.class);
    private static PersonDAO personDAO = new PersonDAOImplForSQLServer();
    //endregion

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        switch (request.getParameter("formName")){
            case "choosePerson":
                choosePerson(request);
                break;
            case "updatePerson":
                updatePerson(request);
                break;
            default:
                break;
        }

        request.setAttribute("personList", personDAO.selectPersonList());
        request.getRequestDispatcher("./person.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setAttribute("personList", personDAO.selectPersonList());
        request.setAttribute("selectPerson",personSelectorGenerator(0));
        request.getRequestDispatcher("./person.jsp").forward(request, response);

    }

    private static void choosePerson(HttpServletRequest request){
        logger.info("Form #1  form Name =" + request.getParameter("formName"));
        ServletHelper.logRequestParams(request);

        //everything comes back as a string from request
        String selectedPersonId = request.getParameter("selectPerson");

        Person selectedPerson = personDAO.selectPersonById(Integer.parseInt(selectedPersonId));

        logger.info("selected person info: " + selectedPerson.GetFullName());

        personToRequest(request, selectedPerson);

        request.setAttribute("selectPerson", personSelectorGenerator(selectedPerson.getPersonid()));

    }

    private static void updatePerson(HttpServletRequest request){
        logger.info("Form #2  form Name =" + request.getParameter("formName"));
        ServletHelper.logRequestParams(request);

        Person updatePerson = new Person();
        requestToPerson(request,updatePerson);

        if (personDAO.updatePerson(updatePerson)){
            request.setAttribute("updateSuccessful", "Person Updated Successfully");
        } else {
            request.setAttribute("updateSuccessful", "Person Updated FailedS");
        }



        updatePerson = personDAO.selectPersonById(updatePerson.getPersonid());
        personToRequest(request, updatePerson);

        request.setAttribute("selectPerson", personSelectorGenerator(Integer.parseInt(request.getParameter("personId"))));

    }

    private static String personSelectorGenerator(int selectedPersonId){
     StringBuilder strBld = new StringBuilder();
        strBld.append("<select name='selectPerson'>");
        strBld.append("<option value='0'>{Select Person}</option>");
        for (Person person : personDAO.selectPersonList()){
            if (person.getPersonid()==selectedPersonId){
                strBld.append("<option selected value='").append(person.getPersonid()).append("'>")
                        .append(person.getFirstName()).append(" ").append(person.getLastName()).append("</option>");
            } else {
                strBld.append("<option value='").append(person.getPersonid()).append("'>")
                        .append(person.getFirstName()).append(" ").append(person.getLastName()).append("</option>");
            }
        }

        strBld.append("</select>");

        return strBld.toString();
    }

    private static void requestToPerson(HttpServletRequest request, Person person){

        person.setPersonid(Integer.parseInt(request.getParameter("personId")));
        person.setTitle(request.getParameter("title"));
        person.setFirstName(request.getParameter("firstName"));
        person.setLastName(request.getParameter("lastName"));
        person.setBirthDate(SQLDateHelper.stringToDate(request.getParameter("birthDate"), "yyyy-MM-dd"));

    }

    private static void personToRequest(HttpServletRequest request, Person person){
        request.setAttribute("personId",person.getPersonid());
        request.setAttribute("title",person.getTitle());
        request.setAttribute("firstName",person.getFirstName());
        request.setAttribute("lastName",person.getLastName());
        request.setAttribute("birthDate",person.getBirthDate());
    }
}
