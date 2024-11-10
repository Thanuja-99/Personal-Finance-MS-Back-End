package edu.example.controller;

import edu.example.model.Goal;
import edu.example.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/goal")
@CrossOrigin
public class GoalController {

    @Autowired
    final GoalService service;

    @GetMapping("/get-goal")
    public List<Goal> getgoal(){
        return service.getAll();
    }

    @PostMapping("/add-goal")
    public void addGoal(@RequestBody Goal goal){
        service.addGoal(goal);
    }

    @PutMapping("/update-goal")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateGoal(@RequestBody Goal goal){
        service.updateGoal(goal);
    }

    @DeleteMapping("/delete-goal/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteGoal( @PathVariable Integer id){
        service.deleteGoal(id);
    }
}
