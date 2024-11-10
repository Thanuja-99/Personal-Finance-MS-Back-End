package edu.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class DashBoardCategory {

    private Integer id;
    private double balance;
    private double shopping;
    private double food;
    private double biil;
    private double travel;
    private double medicine;
    private double donate;
}
