package com.eLearning.eLearning.repository;

import com.eLearning.eLearning.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>{

}
