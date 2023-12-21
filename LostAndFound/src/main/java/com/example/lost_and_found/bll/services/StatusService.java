package com.example.lost_and_found.bll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lost_and_found.bll.services.interfaces.IStatusService;
import com.example.lost_and_found.data.entities.Status;
import com.example.lost_and_found.data.repo.StatusRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StatusService implements IStatusService {
    @Autowired
    private final StatusRepository _statusRepository;

    public List<Status> readAll() {
        
        return _statusRepository.findAll();
    }

    public Status read(Long id) {
        
        return _statusRepository.findById(id).orElse(null);
    }
}