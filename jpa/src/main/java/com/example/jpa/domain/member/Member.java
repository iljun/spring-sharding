package com.example.jpa.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 5. 7
 * Time: 오후 3:54
 */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private Long memberId;
    private String name;
    private Long age;
    private Long departmentId;
}
