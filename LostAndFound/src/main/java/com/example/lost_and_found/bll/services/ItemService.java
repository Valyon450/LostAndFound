package com.example.lost_and_found.bll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lost_and_found.bll.dto.ItemDTO;
import com.example.lost_and_found.bll.services.interfaces.IContactInfoService;
import com.example.lost_and_found.bll.services.interfaces.IItemService;
import com.example.lost_and_found.bll.services.interfaces.IKeywordService;
import com.example.lost_and_found.bll.services.interfaces.ILAFUserService;
import com.example.lost_and_found.bll.services.interfaces.ILocationService;
import com.example.lost_and_found.bll.services.interfaces.IStatusService;
import com.example.lost_and_found.data.entities.Item;
import com.example.lost_and_found.data.repo.ItemRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ItemService implements IItemService {
    @Autowired
    private final ItemRepository _itemRepository;
    private final IStatusService _statusService;
    private final IKeywordService _keywordService;
    private final IContactInfoService _contactInfoService;
    private final ILAFUserService _userService;
    private final ILocationService _locationService;

    @Transactional
    public Item create(ItemDTO dto)
    {  
        Item item = _itemRepository.save(Item.builder()
            .Name(dto.getName())
            .Note(dto.getNote())
            .status(_statusService.read(dto.getStatusId()))
            .keyword(_keywordService.read(dto.getKeywordId()))
            .location(_locationService.read(dto.getLocationId()))
            .contactInfo(_contactInfoService.read(dto.getContactInfoId()))
            .lafUser(_userService.read(dto.getUserId()))
            .build());

        return item;
    }

    public List<Item> readAll() {
        
        return _itemRepository.findAll();
    }

    public List<Item> readByStatusId(Long id) {
        
        return _itemRepository.findByStatusId(id);
    }

    public List<Item> readByKeywordId(Long id) {
        
        return _itemRepository.findByKeywordId(id);
    }

    public Item read(Long id) {
        
        return _itemRepository.findById(id).orElse(null);
    }

    public Item update(Item item) {
        
        return _itemRepository.save(item);
    }

    public void delete(Long id) {
        
        _itemRepository.deleteById(id);
    }
}
