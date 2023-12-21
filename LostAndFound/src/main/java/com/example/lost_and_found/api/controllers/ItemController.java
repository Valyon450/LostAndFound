package com.example.lost_and_found.api.controllers;

import com.example.lost_and_found.bll.dto.ItemDTO;
import com.example.lost_and_found.bll.services.interfaces.IItemService;
import com.example.lost_and_found.data.entities.Item;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/items")
public class ItemController {

    private final IItemService _itemService;

    @PostMapping
    public ResponseEntity<Item> create(@RequestBody ItemDTO dto) {
        return new ResponseEntity<>(_itemService.create(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Item>> readAll() {
        return new ResponseEntity<>(_itemService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<List<Item>> readByStatus(@PathVariable Long id) {
        return new ResponseEntity<>(_itemService.readByStatusId(id), HttpStatus.OK);
    }

    @GetMapping("/keyword/{id}")
    public ResponseEntity<List<Item>> readByKeywordsIn(@PathVariable Long id) {
        
        return new ResponseEntity<>(_itemService.readByKeywordId(id), HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Item> read(@PathVariable Long id) {
        return new ResponseEntity<>(_itemService.read(id), HttpStatus.OK);
    } 

    @PutMapping
    public ResponseEntity<Item> update(@RequestBody Item item) {
        return new ResponseEntity<>(_itemService.update(item), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        _itemService.delete(id);
        return HttpStatus.NO_CONTENT;
    }
}