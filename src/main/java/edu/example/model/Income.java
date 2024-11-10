package edu.example.model;

import lombok.*;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Income {
    private Integer id;
    private String description;
    private Double income;
    private LocalDate date;
    private Double savingRate;
    private  Double saving;
    private Double balance;

}
