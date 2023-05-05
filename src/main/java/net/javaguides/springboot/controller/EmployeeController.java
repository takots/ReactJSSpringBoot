package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Empolyee;
import net.javaguides.springboot.repository.EmpolyeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmpolyeeRepository empolyeeRepository;

    // get all employees
    @GetMapping("/employees")
    public List<Empolyee> getAllEmployees(){
        return empolyeeRepository.findAll();
    }

    // create employees rest api
    @PostMapping("/employees")
    public Empolyee createEmployee(@RequestBody Empolyee empolyee){
        return empolyeeRepository.save(empolyee);
    }
}
