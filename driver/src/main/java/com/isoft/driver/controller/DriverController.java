package com.isoft.driver.controller;

import com.isoft.driver.model.Role;
import com.isoft.driver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Controller class for the Diver-service
@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    // Method to get all the drivers
    @RequestMapping(value = "/drivers", method = RequestMethod.GET)
    public List<Role> getAllDrivers(){
        return driverService.getAllDrivers();
    }

    //Get a specific driver according to his NIC number
    @RequestMapping(value = "/driver/{nic}")
    public Optional<Role> getDriver(@PathVariable String  nic){
        return driverService.getDriver(nic);
    }

    //Add new driver to the organization
    @RequestMapping(value = "/driver" , method = RequestMethod.POST)
    public void addDriver(@RequestBody Role driver){
        driverService.addNewDriver(driver);
    }

    //Update the driver
    @RequestMapping(value = "/driver/{nic}" , method = RequestMethod.PUT)
    public void updateDriver(@PathVariable String nic , @RequestBody Role driver){
        driverService.updateDriver(nic,driver);
    }

    //Can delete the drivers
    @RequestMapping(value = "/driver/{nic}" , method = RequestMethod.DELETE)
    public void deleteDriver(String nic){
        driverService.deleteDriver(nic);
    }

    //Get the the drivers according to their organization
    @RequestMapping(value = "/driver/organization/{organization}")
    public List<Role> getDriverByOrganization(@PathVariable String  organization){
        return driverService.getDriverByOrganization(organization);
    }

    //get All
    @RequestMapping(value = "/driver/getall")
    public List<Role> getAll(){
        return driverService.getAll();
    }

}
