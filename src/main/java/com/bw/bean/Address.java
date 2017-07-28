package com.bw.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by 慕歌笑 on 2017/7/9.
 */
@Entity
@Data
public class Address implements Serializable {

    @Id
    @GeneratedValue()
    private Integer did;
    private String dname;




}
