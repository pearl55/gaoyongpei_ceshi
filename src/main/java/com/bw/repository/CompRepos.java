package com.bw.repository;

import com.bw.bean.Comp;
import com.bw.bean.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 慕歌笑 on 2017/7/28.
 */
public interface CompRepos extends JpaRepository<Comp,Integer>{

    Comp findByCname(String cname);
}
