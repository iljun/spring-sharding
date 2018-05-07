package com.example.jpa.domain.department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 5. 7
 * Time: 오후 3:56
 */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Long departmentId;
    private String name;
}
