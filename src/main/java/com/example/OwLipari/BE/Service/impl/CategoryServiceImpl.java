package com.example.OwLipari.BE.Service.impl;

import com.example.OwLipari.BE.Model.Category;
import com.example.OwLipari.BE.Repository.CategoryRepository;
import com.example.OwLipari.BE.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
}
