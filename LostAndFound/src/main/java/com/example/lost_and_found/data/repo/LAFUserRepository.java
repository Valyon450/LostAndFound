package com.example.lost_and_found.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lost_and_found.data.entities.LAFUser;

@Repository
public interface LAFUserRepository extends JpaRepository<LAFUser, Long> {

    
}