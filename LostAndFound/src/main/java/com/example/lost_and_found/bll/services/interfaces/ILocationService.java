package com.example.lost_and_found.bll.services.interfaces;

import java.util.List;

import com.example.lost_and_found.data.entities.Location;

public interface ILocationService {

    List<Location> readAll();

    Location read(Long id);
}