package com.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myblog.entity.Staff;
import com.myblog.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(value = "/{id}")
    public String findOne(@PathVariable("id") String id){
        Staff staff =  staffService.findOne(id);
        return staff.getId()+ "  "+staff.getName()+"  "+staff.getPassword();
    }


}
