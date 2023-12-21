package com.example.lost_and_found.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.lost_and_found.bll.dto.LAFUserDTO;
import com.example.lost_and_found.bll.services.interfaces.ILAFUserService;
import com.example.lost_and_found.data.entities.LAFUser;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final ILAFUserService _userService;

    @PostMapping
    public ResponseEntity<LAFUser> create(@RequestBody LAFUserDTO dto) {
        return new ResponseEntity<>(_userService.create(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<LAFUser>> readAll() {
        return new ResponseEntity<>(_userService.readAll(), HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<LAFUser> read(@PathVariable Long id) {
        return new ResponseEntity<>(_userService.read(id), HttpStatus.OK);
    } 

    @PutMapping
    public ResponseEntity<LAFUser> update(@RequestBody LAFUser contactInfo) {
        return new ResponseEntity<>(_userService.update(contactInfo), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        _userService.delete(id);
        return HttpStatus.NO_CONTENT;
    }
}
