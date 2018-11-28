package com.eLearning.eLearning.repository;

import com.eLearning.eLearning.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed
 */


@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
    

}
