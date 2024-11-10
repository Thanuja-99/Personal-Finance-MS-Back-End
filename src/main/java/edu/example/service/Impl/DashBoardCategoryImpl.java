package edu.example.service.Impl;

import edu.example.entity.DashBoardCategoryEntity;
import edu.example.entity.DashBoardEntity;
import edu.example.model.DashBoard;
import edu.example.model.DashBoardCategory;
import edu.example.repository.DashBoardCategoryRepository;
import edu.example.repository.DashBoardRepository;
import edu.example.service.DashBoardCategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DashBoardCategoryImpl implements DashBoardCategoryService {
    @Autowired
    private final DashBoardCategoryRepository dashBoardCategoryRepository;
    private final ModelMapper modelMapper;

    @Override
    public void adddata(DashBoardCategory dashBoardCategory) {
        dashBoardCategoryRepository.save(modelMapper.map(dashBoardCategory, DashBoardCategoryEntity.class));
    }

    @Override
    public List<DashBoardCategory> getAll() {
        List<DashBoardCategory> dashBoardCategoryList = new ArrayList<>();
        dashBoardCategoryRepository.findAll().forEach(DashBoardCategoryEntity ->
                dashBoardCategoryList.add(modelMapper.map(DashBoardCategoryEntity , DashBoardCategory.class)));
        return dashBoardCategoryList;
    }

    @Override
    public void updatedata(DashBoardCategory dashBoardCategory) {
        dashBoardCategoryRepository.save(modelMapper.map(dashBoardCategory, DashBoardCategoryEntity.class));
    }

}
