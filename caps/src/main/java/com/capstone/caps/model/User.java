package com.capstone.caps.model;

import javax.persistence.*;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="newusers")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="lastname")
	private String lname;
	@Column(name="firstname")
	private String fname;
	@Column(name="telephone")
	private String phone;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Transient
	private String pass2;
	private String role;
	@Transient
	MultipartFile file;
	private String image;
	
	
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPass2() {
		return pass2;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", lname=" + lname + ", fname=" + fname + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + ", pass2=" + pass2 + "]";
	}
	
	
	
	
}
