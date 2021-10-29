package com.jbsousa.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbsousa.hrworker.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
	
}
