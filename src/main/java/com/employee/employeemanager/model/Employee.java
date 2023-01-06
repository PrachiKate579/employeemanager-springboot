package com.employee.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
   @Id
   @GeneratedValue (strategy = GenerationType.AUTO)
   @Column(nullable = false, updatable = false)
    private Long id;

    public Employee() {
    }

    public Employee(Long id, String name, String jobTitle, String email, String phone, String imageUrl, String employeeCode) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    private String name;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    private String jobTitle;
    private String email;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

}
