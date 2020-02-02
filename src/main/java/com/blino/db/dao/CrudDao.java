package com.blino.db.dao;

import com.blino.db.models.User;

import java.util.List;
import java.util.Optional;

/**
 * 02.02.2020
 * CrudDao
 *
 * @author RombyGuIde (Home Software Engineering Platform)
 * @version v1.0
 */

public interface CrudDao<T> {
    Optional<User> find(Integer id);
    void save(T model);
    void update(T model);
    void delete(Integer id);

    List<T> findAll();
}
