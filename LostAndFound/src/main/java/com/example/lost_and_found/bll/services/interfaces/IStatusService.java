package com.example.lost_and_found.bll.services.interfaces;

import java.util.List;

import com.example.lost_and_found.data.entities.Status;

public interface IStatusService {

    List<Status> readAll();

    Status read(Long id);
}
