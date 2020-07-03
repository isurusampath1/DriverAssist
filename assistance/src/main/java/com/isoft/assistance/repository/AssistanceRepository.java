package com.isoft.assistance.repository;

import com.isoft.assistance.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssistanceRepository extends CrudRepository<Role,String > {

    //Custom query to filter assistance according to their organization
    @Query(value = "SELECT * FROM role WHERE organization = ?1 AND role_type = 'assistance'", nativeQuery = true)

    public List<Role> findByOrganization(String organization);
}
