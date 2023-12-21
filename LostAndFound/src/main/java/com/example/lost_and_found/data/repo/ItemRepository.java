package com.example.lost_and_found.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lost_and_found.data.entities.Item;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByKeywordId(Long id);

    List<Item> findByStatusId(Long id);
}