package com.bw.repository;

import com.bw.bean.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 慕歌笑 on 2017/7/27.
 */
public interface AddressRepos extends JpaRepository<Address,Integer>{

    List<Address> findByDid(Integer did);
}
