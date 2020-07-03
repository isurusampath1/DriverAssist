package com.isoft.driver.repository;

import com.isoft.driver.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DriverRepository extends CrudRepository<Role, String>{

    //Custom query to filter drivers according to their organization
    @Query(value = "SELECT * FROM role WHERE organization = ?1 AND role_type = 'driver'", nativeQuery = true)

    public List<Role> findByOrganization(String organization);


    //Custom query to filter drivers according to their organization
    @Query(value = "SELECT * FROM role ", nativeQuery = true)
    public List<Role> getAll();




}

