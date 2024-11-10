package edu.example.service;

import edu.example.model.Income;

import java.util.List;

public interface IncomeService {

    List<Income>getAll();
    void addIncome(Income income);
    void updateIncome(Income income);
    void deleteIncome(Integer id);
}
