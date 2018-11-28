package com.eLearning.eLearning.repository;

import com.eLearning.eLearning.model.Former;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormerRepository extends JpaRepository<Former, Long>{
}
