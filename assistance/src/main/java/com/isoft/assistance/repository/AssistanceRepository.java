package com.isoft.assistance.repository;

import com.isoft.assistance.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface AssistanceRepository extends CrudRepository<Role,String > {
}
