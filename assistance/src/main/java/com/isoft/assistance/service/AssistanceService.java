package com.isoft.assistance.service;

import com.isoft.assistance.model.Role;
import com.isoft.assistance.repository.AssistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Service class for the Assistance-service
@Service
public class AssistanceService {

    @Autowired
    private AssistanceRepository assistanceRepository;

    //Get All the assistance
    public List<Role> getAllAssistance(){

        List<Role> assistance = new ArrayList<>();
        assistanceRepository.findAll()
                .forEach (assistance::add);

        return assistance;
    }

    //Add new assistance to the system
    public void addNewAssistance(Role assistance){
        assistanceRepository.save(assistance);
    }

    //Get an assistance by his nic
    public Optional<Role> getAssistance(String nic){
        return assistanceRepository.findById(nic);
    }

    //Update the assistance
    public void updateAssistance(String  nic , Role assistance){
        assistanceRepository.save(assistance);
    }

    //Delete the needed assistance.
    public void deleteAssistance(String nic){
        assistanceRepository.deleteById(nic);
    }

    //Get all the assistance according to an organization.
    public List<Role> getAssistanceByOrganization(String organization){
        return assistanceRepository.findByOrganization(organization);
    }

}
