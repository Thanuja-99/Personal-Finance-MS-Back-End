package edu.example.service;

import edu.example.model.Goal;

import java.util.List;

public interface GoalService {

    List<Goal>getAll();
    void addGoal(Goal goal);
    void updateGoal(Goal goal);
    void deleteGoal(Integer id);
}
