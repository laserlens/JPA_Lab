package com.astontech.hr.controllers;


import com.astontech.hr.domain.VO.VehicleVO;
import com.astontech.hr.domain.VehicleMake;
import com.astontech.hr.services.VehicleMakeService;
import com.sun.deploy.net.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Adrian.Flak on 7/11/2017.
 */
@Controller
public class VehicleController {

    @Autowired
    private VehicleMakeService vehicleMakeService;

    @RequestMapping(value = "/admin/vehicle/add" , method = RequestMethod.GET)
    public String adminVehicleAdd(Model model) {

        model.addAttribute("vehicleVO", new VehicleVO());
        model.addAttribute("makeListAdd",vehicleMakeService.listAllVehicleMakes());

        return "admin/vehicle/vehicle_add";
    }

    @RequestMapping(value = "/admin/vehicle/add" , method = RequestMethod.POST)
    public String adminVehiclePost(VehicleVO vehicleVO,Model model, HttpServletRequest request) {




        return "admin/vehicle/vehicle_add";
    }

    @RequestMapping(value = "/admin/vehicle/list", method = RequestMethod.POST)
    public String addminVehicleList(Model model) {




        return "admin/vehicle/vehicle_list";
    }


}