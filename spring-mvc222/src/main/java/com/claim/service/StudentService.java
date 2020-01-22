package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Student;
import com.claim.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;
public void saveStudent(Student student) {
	this.studentRepository.save(student);
	sendMail.sendEmail(student.getEmail(),"Whatever", "Whatever");
	
}
@Autowired
private SendMail sendMail;




}
