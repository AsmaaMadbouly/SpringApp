package com.asmaa.SpringCourse.dao;

import com.asmaa.SpringCourse.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


public interface StudentDAO {
    int insertNewStudent(UUID studentId, Student student);
    Student selectStudentById(UUID studentId);
    List<Student> selectAllStudents();
    int updateStudentById(UUID studentId, Student updateStudent);
    int deleteStudentById(UUID studentId);
}
