package com.claim.repository;

import com.claim.entity.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
	@Query("Select S from Student S where S.email= :email AND S.password = :password")
	Student login(@Param("email")String userName,@Param("password")String password);
	
	@Query("Select S from Student S where S.firstName = :fName")
	List<Student> findByFirstName(@Param("fName")String firstName);
}
