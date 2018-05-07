package com.example.mybatis.domain.member;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 5. 7
 * Time: 오후 2:59
 */
@Mapper
public interface MemberMapper {

    List<Member> selectAll();

    void insert(Member member);

    void deleted(Long id);

    Member selectById(Long id);

}
