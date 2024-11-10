package edu.example.controller;

import edu.example.model.DashBoard;
import edu.example.model.Income;
import edu.example.service.DashBoardService;
import edu.example.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/dashboard")
@CrossOrigin
public class DashBoardController {
    @Autowired
    final DashBoardService service;

    @GetMapping("/get-dashboard")
    public List<DashBoard> getAll(){
        return  service.getAll();
    }

    @PostMapping("/add-dashboard")
    public void addDashBoard(@RequestBody DashBoard dashBoard){
        service.addDashBoard(dashBoard);
    }
    @PutMapping("/update-dashboard")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateDashBoard(@RequestBody DashBoard dashBoard){
        service.updateDashBoard(dashBoard);
    }
    @DeleteMapping("/delete-dashboard/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteDashBoard(@PathVariable Integer id){
        service.deleteDashBoard(id);
    }
}
