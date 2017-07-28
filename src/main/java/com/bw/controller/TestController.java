package com.bw.controller;

import com.bw.bean.*;
import com.bw.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 慕歌笑 on 2017/7/27.
 */
@RestController
public class TestController {
    @Autowired
    private UserRepos userRepos;
    @Autowired
    private AddressRepos addressRepos;
    @Autowired
    private TeacherRepos teacherRepos;
    @Autowired
    private CompRepos compRepos;

    @RequestMapping("/")
    public  List<User> getUser(){
       List<User> list = userRepos.findAll();
       return  list;
    }
    @RequestMapping("finduname")
    public List<Address> getUser(@RequestParam String uname){
        User user = userRepos.findByUname(uname);

        List<Address> byDid = addressRepos.findByDid(user.getDid());
        return  byDid;
    }
    @RequestMapping("findteacher")
    public List<Student> getTeacher(@RequestParam String tname){

        Teacher tea = teacherRepos.findByTname(tname);
        List<Student> stu = tea.getStu();

        return  stu;
    }
    @RequestMapping("findcomp")
    public Dept getComp(@RequestParam String cname){

        Comp cn = compRepos.findByCname(cname);
        Dept dept = cn.getDept();
        return  dept;
    }

}
