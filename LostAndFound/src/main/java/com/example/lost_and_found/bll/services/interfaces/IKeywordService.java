package com.example.lost_and_found.bll.services.interfaces;

import java.util.List;

import com.example.lost_and_found.data.entities.Keyword;

public interface IKeywordService {

    List<Keyword> readAll();

    Keyword read(Long id);
}
