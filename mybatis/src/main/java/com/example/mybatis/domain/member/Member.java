package com.example.mybatis.domain.member;

import lombok.Data;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 5. 7
 * Time: 오후 2:58
 */
public class Member {
    private Long id;
    private String name;
    private String status;
    private Long departmentId;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

    public void setDepartmentId(Long departmentId){
        this.departmentId = departmentId;
    }

    public Long getDepartmentId(){
        return this.departmentId;
    }
}
