package com.isoft.assistance.service;

import com.isoft.assistance.model.Role;
import com.isoft.assistance.repository.AssistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssistanceService {

    @Autowired
    private AssistanceRepository assistanceRepository;

    public List<Role> getAllAssistance(){

        List<Role> assistance = new ArrayList<>();
        assistanceRepository.findAll()
                .forEach (assistance::add);

        return assistance;
    }

    public void addNewAssistance(Role assistance){
        assistanceRepository.save(assistance);
    }

    public Optional<Role> getAssistance(String nic){
        return assistanceRepository.findById(nic);
    }

    public void updateAssistance(String  nic , Role assistance){
        assistanceRepository.save(assistance);
    }

    public void deleteAssistance(String nic){
        assistanceRepository.deleteById(nic);
    }

}
