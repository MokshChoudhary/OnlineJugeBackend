package com.futureworks.juge.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.futureworks.juge.bean.UserDetail;

@Repository
public interface UserDao extends JpaRepository<UserDetail,String>{
    
}