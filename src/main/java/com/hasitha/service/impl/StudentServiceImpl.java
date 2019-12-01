package com.hasitha.service.impl;

import com.hasitha.dao.impl.StudentDAOImpl;
import com.hasitha.entity.Student;
import com.hasitha.service.StudentService;
import org.hibernate.HibernateException;

public class StudentServiceImpl implements StudentService {
    @Override
    public int addStudent(Student student) throws HibernateException {
        return new StudentDAOImpl().addStudent(student);
    }


}
