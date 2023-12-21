package com.example.lost_and_found.bll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lost_and_found.bll.dto.LAFUserDTO;
import com.example.lost_and_found.bll.services.interfaces.ILAFUserService;
import com.example.lost_and_found.data.entities.LAFUser;
import com.example.lost_and_found.data.repo.LAFUserRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LAFUserService implements ILAFUserService {

    @Autowired
    private final LAFUserRepository _userRepository;

    @Transactional
    public LAFUser create(LAFUserDTO dto)
    {  
        LAFUser user = _userRepository.save(LAFUser.builder()
            .Login(dto.getLogin())
            .Password(dto.getPassword())
            .build());

        return user;
    }

    public List<LAFUser> readAll() {
        
        return _userRepository.findAll();
    }

    public LAFUser read(Long id) {
        
        return _userRepository.findById(id).orElse(null);
    }

    public LAFUser update(LAFUser user) {
        
        return _userRepository.save(user);
    }

    public void delete(Long id) {
        
        _userRepository.deleteById(id);
    }
}
