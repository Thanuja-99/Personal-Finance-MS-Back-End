package edu.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Achievement {

    private Integer id;
    private Integer goal_id;
    private String name;
    private String status;
}
