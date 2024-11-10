package edu.example.service.Impl;

import edu.example.entity.GoalEntity;
import edu.example.model.Goal;
import edu.example.repository.GoalRepository;
import edu.example.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class GoalServiceImpl implements GoalService {
    @Autowired
    private final GoalRepository goalRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<Goal> getAll() {
        ArrayList<Goal> goalArrayList = new ArrayList<>();
        goalRepository.findAll().forEach(entity ->
                goalArrayList.add(modelMapper.map(entity,Goal.class)));
        return goalArrayList;
    }

    @Override
    public void addGoal(Goal goal) {
      goalRepository.save(modelMapper.map(goal, GoalEntity.class));
    }

    @Override
    public void updateGoal(Goal goal) {
        goalRepository.save(modelMapper.map(goal, GoalEntity.class));
    }

    @Override
    public void deleteGoal(Integer id) {
        goalRepository.deleteById(id);
    }
}
