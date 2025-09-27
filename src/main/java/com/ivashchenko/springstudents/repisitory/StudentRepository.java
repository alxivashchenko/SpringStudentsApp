package com.ivashchenko.springstudents.repisitory;

import com.ivashchenko.springstudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteStudentByEmail(String email);

    Student findStudentByEmail(String email);
}
