package edu.example.controller;

import edu.example.model.Income;
import edu.example.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/income")
@CrossOrigin
public class IncomeController {

    @Autowired
    final IncomeService service;

    @GetMapping("/get-income")
    public List<Income>getAll(){
        return  service.getAll();
    }

    @PostMapping("/add-income")
    public void addIncome(@RequestBody Income income){
        service.addIncome(income);
    }
    @PutMapping("/update-income")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateIncome(@RequestBody Income income){
        service.updateIncome(income);
    }
    @DeleteMapping("/delete-income/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteIncome(@PathVariable Integer id){
        service.deleteIncome(id);
    }
}
