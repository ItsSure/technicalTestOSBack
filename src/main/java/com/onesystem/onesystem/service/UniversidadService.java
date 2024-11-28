package com.onesystem.onesystem.service;

import java.util.List;

public interface UniversidadService<T> {
    List<T> getAll();

    T getById(String id);

    T create(T entity);

    T update(String id, T entity);

    void delete(String id);
}
