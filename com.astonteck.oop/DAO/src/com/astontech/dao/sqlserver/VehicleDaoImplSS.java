package com.astontech.dao.sqlserver;


import com.astontech.bo.Vehicle;
import com.astontech.dao.VehicleDAO;
import common.helpers.SQLDateHelper;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class VehicleDaoImplSS extends SQLServer implements VehicleDAO {
    @Override
    public Vehicle selectVehicleId(int vehiclelId) {
        Connect();
        Vehicle vehicle = null; //null so if no records returned no memory used
        try {
            String sp = "{call usp_SelectVehicle(?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, vehiclelId);

            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            if(rs.next()) {
                vehicle = HydrateObject(rs);
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }
        return vehicle;
    }

    @Override
    public List<Vehicle> selectVehiclesAll() {
        Connect();
        List<Vehicle> vehicleList = new ArrayList<>();
        try {
            String sp = "{call usp_SelectVehiclesAll()}";
            CallableStatement cStmt = connection.prepareCall(sp);


            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            while (rs.next()) {

                vehicleList.add(HydrateObject(rs));
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return vehicleList;
    }

    @Override
    public int insertVehicle(Vehicle vehicle) {
        Connect();
        int id = 0;//if returns zero not successful

//        @Year,
//        @LicensePlate,
//        @VIN,
//        @Color,
//        @IsPurchase,
//        @PurchasePrice,
//        @PurchaseDate,
//        @VehicleModelid
//        @Vehicleid int OUTPUT

        try{
            String sp = SSProcedures.callInsertVehicle;
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, vehicle.getYear() );
            cStmt.setString(2, vehicle.getLicensePlate());
            cStmt.setString(3, vehicle.getVin());
            cStmt.setString(4, vehicle.getColor());
            cStmt.setInt(5, 1);
            cStmt.setInt(6,0);
            cStmt.setDate(7, null);
            cStmt.setInt(8, vehicle.getVehicleModelid());
            cStmt.setInt(9,0);


            ResultSet rs = cStmt.executeQuery();

            if (rs.next()){
                id = rs.getInt(1);
            }


        }catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return id;
    }

    @Override
    public boolean updateVehicle(Vehicle vehicle) {
        Connect();
        int id = 0;//if returns zero not successful

//               @Vehicleid int,
//                @Year int,
//              @LicensePlate varchar(10),
//                @VIN varchar(20),
//                @Color varchar(10),
//                @IsPurchase bit,
//                @PurchasePrice int,
//                 @PurchaseDate datetime,
//                 @VehicleModelid int
//

        try{
            String sp = SSProcedures.callUpdateVehicle;
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, vehicle.getVehicleid());
            cStmt.setInt(2, vehicle.getYear() );
            cStmt.setString(3, vehicle.getLicensePlate());
            cStmt.setString(4, vehicle.getVin());
            cStmt.setString(5, vehicle.getColor());
            cStmt.setInt(6, 1);
            cStmt.setInt(7,0);
            cStmt.setDate(8, null);
            cStmt.setInt(9, vehicle.getVehicleModelid());


            ResultSet rs = cStmt.executeQuery();



            if (rs.next()){
                id = rs.getInt(1);
            }


        }catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return id > 0;
    }

    @Override
    public boolean deleteVehicle(Vehicle vehicle) {
        Connect();
        int id = 0;//if returns zero not successful

        try{
            String sp = SSProcedures.callDeleteVehicle;
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, vehicle.getVehicleid());


            ResultSet rs = cStmt.executeQuery();



            if (rs.next()){
                id = rs.getInt(1);
            }


        }catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return id > 0;
    }

    private static Vehicle HydrateObject(ResultSet rs) throws SQLException {


        Vehicle phone = new Vehicle();
        phone.setVehicleid(rs.getInt(1));
        phone.setYear(rs.getInt(2));
        phone.setLicensePlate(rs.getString(3));
        phone.setVin(rs.getString(4));
        phone.setColor(rs.getString(5));
        phone.setIsPurchase(rs.getInt(6));
        phone.setPurchasePrice(rs.getInt(7));
        phone.setPurchaseDate(rs.getDate(8));
        phone.setVehicleModelid(rs.getInt(9));

        return phone;
    }
}