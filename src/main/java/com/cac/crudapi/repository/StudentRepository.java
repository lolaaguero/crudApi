package com.cac.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cac.crudapi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}