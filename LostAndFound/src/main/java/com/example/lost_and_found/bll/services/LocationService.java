package com.example.lost_and_found.bll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lost_and_found.bll.services.interfaces.ILocationService;
import com.example.lost_and_found.data.entities.Location;
import com.example.lost_and_found.data.repo.LocationRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LocationService implements ILocationService {
    @Autowired
    private final LocationRepository _locationRepository;

    public List<Location> readAll() {
        
        return _locationRepository.findAll();
    }

    public Location read(Long id) {
        
        return _locationRepository.findById(id).orElse(null);
    }
}
