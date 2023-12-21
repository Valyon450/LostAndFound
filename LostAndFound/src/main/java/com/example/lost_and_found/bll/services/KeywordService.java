package com.example.lost_and_found.bll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lost_and_found.bll.services.interfaces.IKeywordService;
import com.example.lost_and_found.data.entities.Keyword;
import com.example.lost_and_found.data.repo.KeywordRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class KeywordService implements IKeywordService {
    @Autowired
    private final KeywordRepository _keywordRepository;

    public List<Keyword> readAll() {
        
        return _keywordRepository.findAll();
    }

    public Keyword read(Long id) {
        
        return _keywordRepository.findById(id).orElse(null);
    }
}
