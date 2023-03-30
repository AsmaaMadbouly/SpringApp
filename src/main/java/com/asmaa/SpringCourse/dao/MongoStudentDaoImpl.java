package com.asmaa.SpringCourse.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.asmaa.SpringCourse.model.Student;

@Repository("mongoDB")
public class MongoStudentDaoImpl implements StudentDAO
{

	//private final MongoDbTemplate mongoDBTemplate;
	@Override
	public int insertNewStudent(UUID studentId, Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student selectStudentById(UUID studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		students.add(new Student(UUID.randomUUID(), 54, "Mongo", "DB", "NoSQL DB"));
		
		return students;
	}

	@Override
	public int updateStudentById(UUID studentId, Student updateStudent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudentById(UUID studentId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
