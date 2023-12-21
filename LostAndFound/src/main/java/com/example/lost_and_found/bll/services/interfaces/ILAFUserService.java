package com.example.lost_and_found.bll.services.interfaces;

import java.util.List;

import com.example.lost_and_found.bll.dto.LAFUserDTO;
import com.example.lost_and_found.data.entities.LAFUser;

public interface ILAFUserService {

    LAFUser create(LAFUserDTO dto);

    List<LAFUser> readAll();

    LAFUser read(Long id);

    LAFUser update(LAFUser item);

    void delete(Long id);
}