package com.bw.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 慕歌笑 on 2017/7/9.
 */
@Entity
@Data
public class Comp implements Serializable {

    @Id
    @GeneratedValue()
    private Integer cid;
    private String cname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "did")
    private Dept dept;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
