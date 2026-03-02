package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
@Autowired

	private StudentRepository sr;

	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		
		
	}

//	@Override
//	public Student update() {
//		// TODO Auto-generated method stub	
//			s.setRoll(id);
//			
//		
//		return sr.save(s);
//		
//	}

	@Override
	public Student update(Student s, Integer id) {
		// TODO Auto-generated method stub
		s.setRoll(id);
		return sr.save(s);
	}

}
