package com.isoft.assistance.controller;

import com.isoft.assistance.model.Role;
import com.isoft.assistance.service.AssistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AssistanceController {

    @Autowired
    private AssistanceService assistanceService;

    @RequestMapping(value = "/assistance", method = RequestMethod.GET)
    public List<Role> getAllAssistance(){
        return assistanceService.getAllAssistance();
    }


    @RequestMapping(value = "/assistance/{nic}")
    public Optional<Role> getAssistance(@PathVariable String  nic){
        return assistanceService.getAssistance(nic);
    }

    @RequestMapping(value = "/assistance" , method = RequestMethod.POST)
    public void addDriver(@RequestBody Role assistance){
        assistanceService.addNewAssistance(assistance);
    }

    @RequestMapping(value = "/assistance/{nic}" , method = RequestMethod.PUT)
    public void updateAssistance(@PathVariable String nic , @RequestBody Role assistance){
        assistanceService.updateAssistance(nic, assistance);
    }

    @RequestMapping(value = "/assistance/{nic}" , method = RequestMethod.DELETE)
    public void deleteAssistance(String nic){
        assistanceService.deleteAssistance(nic);
    }
}
