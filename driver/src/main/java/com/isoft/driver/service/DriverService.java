package com.isoft.driver.service;

import com.isoft.driver.model.Role;
import com.isoft.driver.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Service class for the Driver - service
@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    //Get all the drivers
    public List<Role> getAllDrivers(){

        List<Role> drivers = new ArrayList<>();
        driverRepository.findAll()
        .forEach (drivers::add);

        return drivers;
    }

    //Add new driver to an Organization
    public void addNewDriver(Role driver){
        driverRepository.save(driver);
    }

    //Get the driver according to the nic
    public Optional<Role> getDriver(String  nic){
        return driverRepository.findById(nic);
    }

    //update the driver
    public void updateDriver(String  nic , Role driver){
        driverRepository.save(driver);
    }

    //Delete the driver
    public void deleteDriver(String nic){
        driverRepository.deleteById(nic);
    }

    //Get all the drivers according to an organization.
    public List<Role> getDriverByOrganization(String organization){
        return driverRepository.findByOrganization(organization);
    }

    //Get all the users.
    public List<Role> getAll(){
        return driverRepository.getAll();
    }
}
