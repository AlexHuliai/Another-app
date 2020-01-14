package com.claim.entity;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  //map to database
@Table(name="student")

public class Student {



@Column(name="first_name")
private String firstName;

@Column(name="last_name")
private String lastName;
@Id
@Column(name="email")
private String email;

@Column(name="age")
private int age;

@Column(name="telephone")
private String telephone;
@OneToOne
@JoinColumn(name="address_id")
private Address address;

public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getTelephone() {
return telephone;
}
public void setTelephone(String telephone) {
this.telephone = telephone;
}
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}

}