package com.isoft.driver.controller;

import com.isoft.driver.model.Role;
import com.isoft.driver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;


    @RequestMapping(value = "/drivers", method = RequestMethod.GET)
    public List<Role> getAllDrivers(){
        return driverService.getAllDrivers();
    }


    @RequestMapping(value = "/driver/{nic}")
    public Optional<Role> getDriver(@PathVariable String  nic){
        return driverService.getDriver(nic);
    }

    @RequestMapping(value = "/driver" , method = RequestMethod.POST)
    public void addDriver(@RequestBody Role driver){
        driverService.addNewDriver(driver);
    }

    @RequestMapping(value = "/driver/{nic}" , method = RequestMethod.PUT)
    public void updateDriver(@PathVariable String nic , @RequestBody Role driver){
        driverService.updateDriver(nic,driver);
    }

    @RequestMapping(value = "/driver/{nic}" , method = RequestMethod.DELETE)
    public void deleteDriver(String nic){
        driverService.deleteDriver(nic);
    }

}
