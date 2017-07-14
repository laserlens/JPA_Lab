package com.astontec.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.astontech.bo.Vehicle;
import com.astontech.dao.VehicleDAO;
import com.astontech.bo.Vehiclemake;
import com.astontech.dao.VehicleMakeDAO;
import com.astontech.bo.Vehiclemodel;
import com.astontech.dao.VehicleModelDAO;


import com.astontech.dao.sqlserver.VehicleDaoImplSS;
import com.astontech.dao.sqlserver.VehicleMakeDaoImplSS;
import com.astontech.dao.sqlserver.VehicleModelDaoImplSS;

import common.helpers.ServletHelper;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Adrian.Flak on 6/15/2017.
 */
public class VehicleServlet extends javax.servlet.http.HttpServlet {

    //region Parameters
    final static Logger logger = Logger.getLogger(PersonServlet.class);
    private static VehicleDAO vehicleDAO = new VehicleDaoImplSS();
    private static  VehicleModelDAO vehicleModelDAO = new VehicleModelDaoImplSS();
    private static  VehicleMakeDAO vehicleMakeDAO = new VehicleMakeDaoImplSS();
    //endregion

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        switch (request.getParameter("formVehicle")) {
            case "addVehicle":
                addVehicle(request);
                break;
            default:
                updateDeleteVehicle(request);
                break;
        }

        //refreshPage(request,response);
        request.setAttribute("vehicleList", vehicleDAO.selectVehiclesAll());
        request.setAttribute("makeList", vehicleMakeDAO.selectVehicleMakesAll());
        request.setAttribute("makeListAdd", vehicleMakeDAO.selectVehicleMakesAll());
        request.setAttribute("modelList", vehicleModelDAO.selectVehicleModelsAll());
        request.getRequestDispatcher("./vehicle.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, IOException {

        refreshPage(request,response);


    }

    private static void addVehicle(HttpServletRequest request){
        logger.info("Add form Name = " + request.getParameter("formVehicle"));
        ServletHelper.logRequestParams(request);

        //everything comes back as a string from request
        //String selectedModelId = request.getParameter("selectModel");

        Object test = request.getParameter("addButton");
        logger.info("whats the addbutton = " + test);

        int makeId = Integer.parseInt(request.getParameter("selectMake"));
        request.setAttribute("makeId", makeId);

        request.setAttribute("sortedModelList", modelSorter(makeId));


        if (request.getParameter("addButton") != null){
            Vehicle addVehicle = new Vehicle();
            requestToVehicle(request, addVehicle);



            if (vehicleDAO.insertVehicle(addVehicle) > 0)
                request.setAttribute("addSuccessful", "Vehicle Added Successfully");
            else
                request.setAttribute("addSuccessful", "Vehicle Add Failed");

        }







    }

    private static void updateDeleteVehicle (HttpServletRequest request) {

        logger.info("update form Name = " + request.getParameter("formVehicle"));
        ServletHelper.logRequestParams(request);
        //int updateOrDelete = Integer.parseInt(request.getParameter("button"));
        //logger.info("what is updateOrDelete value = " + updateOrDelete);

        Vehicle vehicle = new Vehicle();
        requestToVehicle(request, vehicle);
        vehicle.setVehicleid(Integer.parseInt(request.getParameter("vehicleId")));

        //request.setAttribute("modelList", modelSorter(Integer.parseInt(request.getParameter("selectMake"))));

        //region If statement delete or update

        if (request.getParameter("button") != null){

            if (request.getParameter("button").equals("0")){

                if (vehicleDAO.deleteVehicle(vehicle))
                    request.setAttribute("successful", "Vehicle Deleted Successfully");
                else
                    request.setAttribute("successful", "Vehicle Delete Failed");
            }


            else if (request.getParameter("button").equals("1")){

                if (vehicleDAO.updateVehicle(vehicle))
                    request.setAttribute("successful", "Vehicle Updated Successfully");
                else
                    request.setAttribute("successful", "Vehicle Update Failed");

            }

        }



        //endregion


    }

    private static void requestToVehicle(HttpServletRequest request, Vehicle vehicle){

        vehicle.setLicensePlate(request.getParameter("licensePlate"));
        vehicle.setVin(request.getParameter("vin"));
        vehicle.setYear(Integer.parseInt(request.getParameter("year")));
        vehicle.setColor(request.getParameter("color"));
        vehicle.setVehicleModelid(Integer.parseInt(request.getParameter("selectModel")));



    }

    private static void refreshPage(HttpServletRequest request, HttpServletResponse response ) throws javax.servlet.ServletException, IOException  {

        request.setAttribute("vehicleList", vehicleDAO.selectVehiclesAll());
        request.setAttribute("makeList", vehicleMakeDAO.selectVehicleMakesAll());
        request.setAttribute("modelList", vehicleModelDAO.selectVehicleModelsAll());
        request.setAttribute("makeListAdd", vehicleMakeDAO.selectVehicleMakesAll());
        request.getRequestDispatcher("./vehicle.jsp").forward(request, response);
    }

    //attempt at using just Java for cascading select boxes
    private static List<Vehiclemodel> modelSorter (int makeId){
        //logger.info("request of selectMake" + request.getParameter("selectMake"));



        List<Vehiclemodel> modelList = new ArrayList<>();
        List<Vehiclemodel> vehiclemodel =  vehicleModelDAO.selectVehicleModelsAll();
        for (Vehiclemodel model : vehiclemodel  ) {
            if (makeId == model.getVehicleMakeid()){
                modelList.add(model);
            }
        }


        return modelList;

    }



}
