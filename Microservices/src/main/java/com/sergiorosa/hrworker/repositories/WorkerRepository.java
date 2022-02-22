package com.sergiorosa.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
