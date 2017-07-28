package com.bw.repository;

import com.bw.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 慕歌笑 on 2017/7/27.
 */
public interface UserRepos extends JpaRepository<User,Integer>{


    User findByUname(String uname);

}
