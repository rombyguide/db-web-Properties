package com.blino.db.dao;

import com.blino.db.models.User;

import java.util.List;

/**
 * 02.02.2020
 * UsersDao
 *
 * @author RombyGuIde 
 * @version v1.0
 */

public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
}
