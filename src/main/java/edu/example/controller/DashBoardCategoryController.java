package edu.example.controller;

import edu.example.model.DashBoardCategory;
import edu.example.service.DashBoardCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dashboardcategory")
@CrossOrigin
public class DashBoardCategoryController {
    @Autowired
    final DashBoardCategoryService service;

    @GetMapping("/get-dashboardcategory")
    public List<DashBoardCategory> getAll() {
        return service.getAll();
    }

    @PostMapping("/add-dashboardcategory")
    public void adddata(@RequestBody DashBoardCategory dashBoardCategory) {
        service.adddata(dashBoardCategory);
    }

    @PutMapping("/update-dashboardcategory")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatedata(@RequestBody DashBoardCategory dashBoardCategory) {
        service.updatedata(dashBoardCategory);
    }
}





