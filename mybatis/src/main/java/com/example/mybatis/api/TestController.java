package com.example.mybatis.api;

import com.example.mybatis.domain.department.Department;
import com.example.mybatis.domain.department.DepartmentMapper;
import com.example.mybatis.domain.member.Member;
import com.example.mybatis.domain.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 5. 7
 * Time: 오전 11:47
 */
@RestController
public class TestController {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping(value = "/api/department", method = RequestMethod.GET)
    public List<Department> selectAllDepartment() {
        return departmentMapper.selectAll();
    }

    @RequestMapping(value = "/api/member", method = RequestMethod.GET)
    public List<Member> selectAllMember() {
        return memberMapper.selectAll();
    }

    @RequestMapping(value = "/api/department", method = RequestMethod.POST)
    public void insertDepartment(@RequestBody Department department) {
        System.out.println(department.toString());
        departmentMapper.insert(department);
    }

    @RequestMapping(value = "/api/member", method = RequestMethod.POST)
    public void insertMember(@RequestBody Member member) {
        System.out.println(member.toString());
        memberMapper.insert(member);
    }

    @RequestMapping(value = "/api/department/{id}", method = RequestMethod.DELETE)
    public void deletedDepartment(@PathVariable Long id) {
        departmentMapper.deleted(id);
    }

    @RequestMapping(value = "/api/member/{id}", method = RequestMethod.DELETE)
    public void deletedMember(@PathVariable Long id) {
        memberMapper.deleted(id);
    }

    @RequestMapping(value = "/api/department/{id}", method = RequestMethod.GET)
    public Department selectByDepartmentId(@PathVariable Long id) {
        return departmentMapper.selectById(id);
    }

    @RequestMapping(value = "/api/member/{id}", method = RequestMethod.GET)
    public Member selectByMemberId(@PathVariable Long id) {
        return memberMapper.selectById(id);
    }
}
