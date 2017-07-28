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
public class User implements Serializable {

    @Id
    @GeneratedValue()
    private Integer id;
    private String uname;
    private Integer passwd;
    private Integer did;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getPasswd() {
        return passwd;
    }

    public void setPasswd(Integer passwd) {
        this.passwd = passwd;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
