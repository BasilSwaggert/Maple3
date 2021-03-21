package com.Helpdesk.Maple3.services;

import com.Helpdesk.Maple3.entities.Category;

public interface CategoryService {

    public Iterable<Category> findAll();

    public Category find(int id);

    public Category save(Category category);

    public void delete(int id);
}
