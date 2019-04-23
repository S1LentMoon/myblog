package com.myblog.dao;

import org.springframework.stereotype.Repository;

import com.myblog.entity.Staff;

@Repository
public interface StaffDao {
    public Staff findOne(String id);
}
