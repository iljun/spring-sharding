package com.example.mybatis.domain.department;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 5. 7
 * Time: 오후 2:59
 */
@Mapper
public interface DepartmentMapper {

    List<Department> selectAll();

    void insert(Department department);

    void deleted(Long id);

    Department selectById(Long id);
}
