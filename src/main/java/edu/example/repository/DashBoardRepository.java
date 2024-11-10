package edu.example.repository;

import edu.example.entity.DashBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashBoardRepository extends JpaRepository<DashBoardEntity,Integer> {
}
