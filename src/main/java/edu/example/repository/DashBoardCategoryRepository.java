package edu.example.repository;

import edu.example.entity.DashBoardCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashBoardCategoryRepository extends JpaRepository<DashBoardCategoryEntity,Integer> {
}
