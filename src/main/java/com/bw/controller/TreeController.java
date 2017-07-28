package com.bw.controller;

import com.bw.bean.Tree;
import com.bw.repository.TreeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 慕歌笑 on 2017/7/27.
 */
@RestController
public class TreeController {

    @Autowired
    private TreeRepos treeRepos;

    @RequestMapping("tree")
    @ResponseBody
    public List<Tree> getTree(){
        List<Tree> list = treeRepos.findAll();
        return  list;
    }

}
