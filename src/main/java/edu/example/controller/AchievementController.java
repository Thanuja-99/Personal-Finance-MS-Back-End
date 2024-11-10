package edu.example.controller;

import edu.example.model.Achievement;
import edu.example.model.Goal;
import edu.example.service.AchievementService;
import edu.example.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/achievement")
@CrossOrigin
public class AchievementController {

    @Autowired
    final AchievementService service;

    @PostMapping("/add-achievement")
    public void addGoal(@RequestBody Achievement achievement){
        service.addAchievement(achievement);
    }
}
