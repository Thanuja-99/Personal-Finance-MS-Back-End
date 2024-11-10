package edu.example.service;

import edu.example.model.DashBoard;
import edu.example.model.DashBoardCategory;

import java.util.List;

public interface DashBoardCategoryService {

    void adddata(DashBoardCategory dashBoardCategory);
    List<DashBoardCategory> getAll();
    void updatedata(DashBoardCategory dashBoardCategory);

//    void updateshopping(DashBoardCategory shopping);
//    void updatefood(DashBoardCategory food);
//    void updatebill(DashBoardCategory bill);
//    void updatetravel(DashBoardCategory travel);
//    void updatemedicine(DashBoardCategory medicine);
//    void updatedonation(DashBoardCategory donation);
}
