package com.bw.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 慕歌笑 on 2017/7/9.
 */
@Entity
@Data
public class Student implements Serializable {

    @Id
    @GeneratedValue()
    private Integer sid;
    private String sname;
    private String banji;




}
