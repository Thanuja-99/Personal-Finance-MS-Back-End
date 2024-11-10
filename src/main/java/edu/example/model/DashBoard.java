package edu.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DashBoard {
    private Integer id;
    private String purpose;
    private String category;
    private LocalDate date;
    private double cost;
}
