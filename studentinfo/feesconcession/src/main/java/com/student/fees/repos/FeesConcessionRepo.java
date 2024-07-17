package com.student.fees.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.fees.model.feesconcession;

@Repository
public interface FeesConcessionRepo extends JpaRepository<feesconcession, Long> {

	feesconcession findByconCode(String code);

}
