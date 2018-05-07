package com.example.jpa.api;

import com.example.jpa.domain.department.Department;
import com.example.jpa.domain.department.DepartmentRepository;
import com.example.jpa.domain.member.Member;
import com.example.jpa.domain.member.MemberRepository;
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
    private MemberRepository memberRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @RequestMapping(value = "/api/department", method = RequestMethod.GET)
    public List<Department> selectAllDepartment(){
        return departmentRepository.findAll();
    }

    @RequestMapping(value = "/api/member", method = RequestMethod.GET)
    public List<Member> selectAllMember(){
        return memberRepository.findAll();
    }

    @RequestMapping(value = "/api/department", method = RequestMethod.POST)
    public void insertDepartment(@RequestBody Department department){
        System.out.println(department.toString());
        departmentRepository.save(department);
    }

    @RequestMapping(value = "/api/member", method = RequestMethod.POST)
    public void insertMember(@RequestBody Member member){
        System.out.println(member.toString());
        memberRepository.save(member);
    }

    @RequestMapping(value = "/api/departmenht/{id}", method = RequestMethod.DELETE)
    public void deletedDepartment(@PathVariable Long id){
        departmentRepository.delete(id);
    }

    @RequestMapping(value = "/api/member/{id}", method = RequestMethod.DELETE)
    public void deletedMember(@PathVariable Long id){
        memberRepository.delete(id);
    }

    @RequestMapping(value = "/api/department/{id}", method = RequestMethod.GET)
    public Department selectByDepartmentId(@PathVariable Long id){
        return departmentRepository.findOne(id);
    }

    @RequestMapping(value = "/api/member/{id}", method = RequestMethod.GET)
    public Member selectByMemberId(@PathVariable Long id){
        return memberRepository.findOne(id);
    }
}
