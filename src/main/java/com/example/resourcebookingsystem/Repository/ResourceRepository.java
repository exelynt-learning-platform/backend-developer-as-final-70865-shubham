package com.example.resourcebookingsystem.Repository;

 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.resourcebookingsystem.Entity.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}