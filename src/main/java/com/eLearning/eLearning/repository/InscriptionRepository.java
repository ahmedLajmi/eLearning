package com.eLearning.eLearning.repository;

import com.eLearning.eLearning.model.Inscription;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Ahmed
 */


@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

    List<Inscription> findByFormationId(long formationId);
    List<Inscription> findByCandidateId(long CandidateId);
}
