package com.xib.assessment.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.xib.assessment.entity.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

	@Query(value = "SELECT * FROM agent",nativeQuery = true,countQuery = "SELECT count(*) FROM agent")
	Page<Agent> findAll(Pageable pageable);

}
