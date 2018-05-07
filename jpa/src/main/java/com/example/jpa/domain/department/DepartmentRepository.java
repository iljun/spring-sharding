package com.example.jpa.domain.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 5. 7
 * Time: 오후 3:56
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
