package org.niroshan.applepc_store.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long employee_id;
 private String lname;
 private String fname;
 private String email;

 public Employee(Long employee_id, String lname, String fname, String email) {
  this.employee_id = employee_id;
  this.lname = lname;
  this.fname = fname;
  this.email = email;
 }

 public Employee() {
 }

 public Long getEmployee_id() {
  return this.employee_id;
 }

 public String getLname() {
  return this.lname;
 }

 public String getFname() {
  return this.fname;
 }

 public String getEmail() {
  return this.email;
 }

 public void setEmployee_id(Long employee_id) {
  this.employee_id = employee_id;
 }

 public void setLname(String lname) {
  this.lname = lname;
 }

 public void setFname(String fname) {
  this.fname = fname;
 }

 public void setEmail(String email) {
  this.email = email;
 }

}
