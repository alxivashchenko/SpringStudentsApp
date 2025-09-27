package com.ivashchenko.springstudents.service.Impl;

import com.ivashchenko.springstudents.model.Student;
import com.ivashchenko.springstudents.repisitory.StudentRepository;
import com.ivashchenko.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Transactional
    @Override
    public void deleteStudent(String email) {
        repository.deleteStudentByEmail(email);
    }
}
