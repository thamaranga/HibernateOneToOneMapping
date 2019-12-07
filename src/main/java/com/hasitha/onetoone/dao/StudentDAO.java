package com.hasitha.onetoone.dao;

import com.hasitha.onetoone.entity.Student;
import org.hibernate.HibernateException;

public interface StudentDAO {

    int addStudent(Student student) throws HibernateException;

}
