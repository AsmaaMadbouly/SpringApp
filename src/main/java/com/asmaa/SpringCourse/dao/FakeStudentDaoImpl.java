package com.asmaa.SpringCourse.dao;

import com.asmaa.SpringCourse.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDao")
public class FakeStudentDaoImpl implements StudentDAO{
    private final Map<UUID,Student> database;

    public FakeStudentDaoImpl() {
        database = new HashMap<>();
        UUID studentId=UUID.randomUUID();
        database.put(studentId,
                new Student(studentId,25,"Asmaa","Madbouly","Spring Boot")

        );
    }


    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        student.setId(studentId);
       database.put(studentId,student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentById(UUID studentId, Student updateStudent) {
        database.put(studentId,updateStudent);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
