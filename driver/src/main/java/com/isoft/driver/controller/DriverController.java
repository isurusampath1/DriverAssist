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

    // Method to get all
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Role> getAllUsers(){
        return driverService.getAll();
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
    public void deleteDriver(@PathVariable String nic){
        driverService.deleteDriver(nic);
    }

    //Get the the drivers according to their organization
    @RequestMapping(value = "/driver/organization/{organization}")
    public List<Role> getDriverByOrganization(@PathVariable String  organization){
        return driverService.getDriverByOrganization(organization);
    }


}
