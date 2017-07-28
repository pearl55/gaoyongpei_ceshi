package com.bw.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 慕歌笑 on 2017/7/27.
 */
@Entity
@Data
public class Tree {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer pid;
    private String url;
    private String target;
}
