package edu.example.service.Impl;

import edu.example.entity.IncomeEntity;
import edu.example.model.Income;
import edu.example.repository.IncomeRepository;
import edu.example.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    private final IncomeRepository incomeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<Income> getAll() {
        List<Income> incomeList = new ArrayList<>();
        incomeRepository.findAll().forEach(incomeEntity ->
                incomeList.add(modelMapper.map(incomeEntity, Income.class)));
        return incomeList;
    }

    @Override
    public void addIncome(Income income) {
        incomeRepository.save(modelMapper.map(income, IncomeEntity.class));
    }

    @Override
    public void updateIncome(Income income) {
        incomeRepository.save(modelMapper.map(income, IncomeEntity.class));
    }

    @Override
    public void deleteIncome(Integer id) {
        incomeRepository.deleteById(id);
    }
}
