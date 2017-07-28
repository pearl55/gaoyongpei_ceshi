package com.bw.repository;

import com.bw.bean.Teacher;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.JavaMethod;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 慕歌笑 on 2017/7/28.
 */
public interface TeacherRepos extends JpaRepository<Teacher,Integer>{

    Teacher findByTname(String tname);
}
