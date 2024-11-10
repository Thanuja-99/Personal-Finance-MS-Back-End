package edu.example.service.Impl;

import edu.example.entity.AchievementEntity;
import edu.example.entity.GoalEntity;
import edu.example.model.Achievement;
import edu.example.repository.AchievementRepository;
import edu.example.repository.GoalRepository;
import edu.example.service.AchievementService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private final AchievementRepository achievementRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addAchievement(Achievement achievement) {
        achievementRepository.save(modelMapper.map(achievement, AchievementEntity.class));
    }
}
