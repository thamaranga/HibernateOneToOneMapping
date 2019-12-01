package com.hasitha.service;


import com.hasitha.entity.Laptop;
import com.hasitha.entity.Student;
import org.hibernate.HibernateException;

public interface StudentService {

    int addStudent(Student student) throws HibernateException;

}
