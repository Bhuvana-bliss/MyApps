package com.studentinfo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentinfo.model.studentinfo;

public interface StudentRepo extends JpaRepository<studentinfo, Long> {

}
