package edu.example.service.Impl;

import edu.example.entity.DashBoardEntity;
import edu.example.entity.IncomeEntity;
import edu.example.model.DashBoard;
import edu.example.model.Income;
import edu.example.repository.DashBoardRepository;
import edu.example.repository.IncomeRepository;
import edu.example.service.DashBoardService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class DashBoardServiceImpl implements DashBoardService {

    @Autowired
    private final DashBoardRepository dashBoardRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<DashBoard> getAll() {
        List<DashBoard> dashboarList = new ArrayList<>();
        dashBoardRepository.findAll().forEach(DashBoardEntity ->
                dashboarList.add(modelMapper.map(DashBoardEntity, DashBoard.class)));
        return dashboarList;
    }

    @Override
    public void addDashBoard(DashBoard dashBoard) {
        dashBoardRepository.save(modelMapper.map(dashBoard, DashBoardEntity.class));
    }

    @Override
    public void updateDashBoard(DashBoard dashBoard) {
        dashBoardRepository.save(modelMapper.map(dashBoard, DashBoardEntity.class));
    }

    @Override
    public void deleteDashBoard(Integer id) {
        dashBoardRepository.deleteById(id);
    }
}
