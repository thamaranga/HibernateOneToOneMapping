package com.hasitha.dao;

import com.hasitha.entity.Laptop;
import com.hasitha.entity.Student;
import org.hibernate.HibernateException;

public interface StudentDAO {

    int addStudent(Student student) throws HibernateException;

}
