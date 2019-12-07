package com.hasitha.onetoone.service.impl;

import com.hasitha.onetoone.dao.impl.StudentDAOImpl;
import com.hasitha.onetoone.entity.Student;
import com.hasitha.onetoone.service.StudentService;
import org.hibernate.HibernateException;

public class StudentServiceImpl implements StudentService {
    @Override
    public int addStudent(Student student) throws HibernateException {
        return new StudentDAOImpl().addStudent(student);
    }


}
