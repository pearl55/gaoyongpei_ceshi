package com.bw.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 慕歌笑 on 2017/7/9.
 */
@Entity
@Data
public class Teacher implements Serializable {

    @Id
    @GeneratedValue()
    private Integer tid;
    private String tname;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Student> stu  = new ArrayList<Student>();

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Student> getStu() {
        return stu;
    }

    public void setStu(List<Student> stu) {
        this.stu = stu;
    }
}
