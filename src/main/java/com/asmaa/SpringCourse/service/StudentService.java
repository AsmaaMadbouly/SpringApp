package com.asmaa.SpringCourse.service;

import com.asmaa.SpringCourse.dao.StudentDAO;
import com.asmaa.SpringCourse.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
//  why we did not use FakeStudentImpl instead of StudentDao?
   private final StudentDAO studentDAO;
    @Autowired
    public StudentService(@Qualifier("mongoDB") StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    public int PersistNewStudent(UUID studentId, Student student)
    {
        UUID studentUid= studentId==null ? UUID.randomUUID() : studentId;
        return studentDAO.insertNewStudent(studentUid,student);
    }
    public Student getStudentById(UUID studentId)
    {
     return studentDAO.selectStudentById(studentId);
    }
    public List<Student> getAllStudents()
    {
        return studentDAO.selectAllStudents();
    }
    public int updateStudentById(UUID studentId, Student updateStudent)
    {
        return studentDAO.updateStudentById(studentId,updateStudent);
    }
    public int deleteStudentById(UUID studentId)
    {
//        Student student=getStudentById(studentId);
//        if(student==null)
//            throw new IllegalStateException();
        return studentDAO.deleteStudentById(studentId);
    }
}
