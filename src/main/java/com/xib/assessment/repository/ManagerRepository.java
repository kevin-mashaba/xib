package com.xib.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xib.assessment.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long>{

}
