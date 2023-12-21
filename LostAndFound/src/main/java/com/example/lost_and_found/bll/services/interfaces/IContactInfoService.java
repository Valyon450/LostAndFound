package com.example.lost_and_found.bll.services.interfaces;

import java.util.List;

import com.example.lost_and_found.bll.dto.ContactInfoDTO;
import com.example.lost_and_found.data.entities.ContactInfo;

public interface IContactInfoService {

    ContactInfo create(ContactInfoDTO dto);   

    List<ContactInfo> readAll();

    ContactInfo read(Long id);

    ContactInfo update(ContactInfo item);

    void delete(Long id);
}