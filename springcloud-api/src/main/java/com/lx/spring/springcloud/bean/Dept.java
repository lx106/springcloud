package com.lx.spring.springcloud.bean;

import java.io.Serializable;

/**
 * Created with liuxun
 * Description:
 * Date: 2018-07-03-20:34
 */
public class Dept implements Serializable{

    private Long deptno; // 主键
    private String dname; // 部门名称
    private String dbSource; // 来自哪个数据库

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}

