package com.example.lost_and_found.bll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lost_and_found.bll.dto.ContactInfoDTO;
import com.example.lost_and_found.bll.services.interfaces.IContactInfoService;
import com.example.lost_and_found.data.entities.ContactInfo;
import com.example.lost_and_found.data.repo.ContactInfoRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ContactInfoService implements IContactInfoService {
    @Autowired
    private final ContactInfoRepository _contactInfoRepository;

    @Transactional
    public ContactInfo create(ContactInfoDTO dto)
    {  
        ContactInfo contactInfo = _contactInfoRepository.save(ContactInfo.builder()
            .FirstName(dto.getFirstName())
            .LastName(dto.getLastName())
            .Email(dto.getEmail())
            .PhoneNumber(dto.getPhoneNumber())
            .build());

        return contactInfo;
    }

    public List<ContactInfo> readAll() {
        
        return _contactInfoRepository.findAll();
    }

    public ContactInfo read(Long id) {
        
        return _contactInfoRepository.findById(id).orElse(null);
    }

    public ContactInfo update(ContactInfo contactInfo) {
        
        return _contactInfoRepository.save(contactInfo);
    }

    public void delete(Long id) {
        
        _contactInfoRepository.deleteById(id);
    }
}
