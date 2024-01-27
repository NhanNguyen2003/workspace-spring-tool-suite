package com.ebookshop.admin.user;

import org.springframework.data.repository.CrudRepository;

import com.ebookshop.common.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
