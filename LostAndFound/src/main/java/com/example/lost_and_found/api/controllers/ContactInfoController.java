package com.example.lost_and_found.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.lost_and_found.bll.dto.ContactInfoDTO;
import com.example.lost_and_found.bll.services.interfaces.IContactInfoService;
import com.example.lost_and_found.data.entities.ContactInfo;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/contacts")
public class ContactInfoController {
    private final IContactInfoService _contactInfoService;

    @PostMapping
    public ResponseEntity<ContactInfo> create(@RequestBody ContactInfoDTO dto) {
        return new ResponseEntity<>(_contactInfoService.create(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ContactInfo>> readAll() {
        return new ResponseEntity<>(_contactInfoService.readAll(), HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ContactInfo> read(@PathVariable Long id) {
        return new ResponseEntity<>(_contactInfoService.read(id), HttpStatus.OK);
    } 

    @PutMapping
    public ResponseEntity<ContactInfo> update(@RequestBody ContactInfo contactInfo) {
        return new ResponseEntity<>(_contactInfoService.update(contactInfo), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        _contactInfoService.delete(id);
        return HttpStatus.NO_CONTENT;
    }
}
