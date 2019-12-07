package com.hasitha.onetoone.service;


import com.hasitha.onetoone.entity.Student;
import org.hibernate.HibernateException;

public interface StudentService {

    int addStudent(Student student) throws HibernateException;

}
