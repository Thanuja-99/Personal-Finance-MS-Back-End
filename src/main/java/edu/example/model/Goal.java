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
public class Goal {
    private Integer id;
    private String  goal;
    private LocalDate start_date;
    private LocalDate expect_date;
}
