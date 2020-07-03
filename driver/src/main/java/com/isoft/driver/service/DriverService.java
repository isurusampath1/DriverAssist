package com.isoft.driver.service;

import com.isoft.driver.model.Role;
import com.isoft.driver.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public List<Role> getAllDrivers(){

        List<Role> drivers = new ArrayList<>();
        driverRepository.findAll()
        .forEach (drivers::add);

        return drivers;
    }

    public void addNewDriver(Role driver){
        driverRepository.save(driver);
    }

    public Optional<Role> getDriver(String  nic){
        return driverRepository.findById(nic);
    }

    public void updateDriver(String  nic , Role driver){
        driverRepository.save(driver);
    }

    public void deleteDriver(String nic){
        driverRepository.deleteById(nic);
    }

}
