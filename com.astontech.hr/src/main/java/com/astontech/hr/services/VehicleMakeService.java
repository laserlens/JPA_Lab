package com.astontech.hr.services;

import com.astontech.hr.domain.VehicleMake;

import java.util.List;

/**
 * Created by Adrian.Flak on 7/11/2017.
 */
public interface VehicleMakeService {

    Iterable<VehicleMake> listAllVehicleMakes();

    VehicleMake getVehicleMakeById(Integer id);

    VehicleMake saveVehicleMake(VehicleMake vehicleMake);

    Iterable<VehicleMake> saveVehicleMakeList(Iterable<VehicleMake> vehicleMakeList);

    void deleteVehicleMakeById(Integer id);

    List<VehicleMake> findAll();
}
