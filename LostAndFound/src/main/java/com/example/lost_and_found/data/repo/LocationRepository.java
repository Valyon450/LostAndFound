package com.example.lost_and_found.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lost_and_found.data.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    
}
