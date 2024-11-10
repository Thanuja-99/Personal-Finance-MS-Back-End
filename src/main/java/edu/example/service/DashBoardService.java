package edu.example.service;

import edu.example.model.DashBoard;
import edu.example.model.DashBoardCategory;
import edu.example.model.Income;

import java.util.List;

public interface DashBoardService {
    List<DashBoard> getAll();
    void addDashBoard(DashBoard dashBoard);
    void updateDashBoard(DashBoard dashBoard);
    void deleteDashBoard(Integer id);


}
