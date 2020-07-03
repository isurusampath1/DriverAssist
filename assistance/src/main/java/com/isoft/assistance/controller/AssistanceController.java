package com.isoft.assistance.controller;

import com.isoft.assistance.model.Role;
import com.isoft.assistance.service.AssistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Controller class for the Assistance - service
@RestController
public class AssistanceController {

    @Autowired
    private AssistanceService assistanceService;

    //Get all the assistance
    @RequestMapping(value = "/assistance", method = RequestMethod.GET)
    public List<Role> getAllAssistance(){
        return assistanceService.getAllAssistance();
    }

    //Get a particular assistance by nic
    @RequestMapping(value = "/assistance/{nic}")
    public Optional<Role> getAssistance(@PathVariable String  nic){
        return assistanceService.getAssistance(nic);
    }

    //Add new assistance
    @RequestMapping(value = "/assistance" , method = RequestMethod.POST)
    public void addNewAssistance(@RequestBody Role assistance){
        assistanceService.addNewAssistance(assistance);
    }

    //Update an assistance
    @RequestMapping(value = "/assistance/{nic}" , method = RequestMethod.PUT)
    public void updateAssistance(@PathVariable String nic , @RequestBody Role assistance){
        assistanceService.updateAssistance(nic, assistance);
    }

    //Delete an assistance
    @RequestMapping(value = "/assistance/{nic}" , method = RequestMethod.DELETE)
    public void deleteAssistance(String nic){
        assistanceService.deleteAssistance(nic);
    }

    //Get the the assistance according to their organization
    @RequestMapping(value = "/assistance/organization/{organization}")
    public List<Role> getAssistanceByOrganization(@PathVariable String  organization){
        return assistanceService.getAssistanceByOrganization(organization);
    }
}
