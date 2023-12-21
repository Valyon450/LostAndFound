package com.example.lost_and_found.bll.services.interfaces;

import java.util.List;

import com.example.lost_and_found.bll.dto.ItemDTO;
import com.example.lost_and_found.data.entities.Item;

public interface IItemService {
    
    Item create(ItemDTO dto);

    List<Item> readAll();

    List<Item> readByStatusId(Long id);

    List<Item> readByKeywordId(Long id);

    Item read(Long id);

    Item update(Item item);

    void delete(Long id);
}
