package com.myblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myblog.dao.StaffDao;
import com.myblog.entity.Staff;

@Service
public class StaffService  {
    @Autowired
    private StaffDao staffDao;

    public Staff findOne(String id){
        return staffDao.findOne(id);
    }
}
