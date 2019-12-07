package com.hasitha.onetoone.service;


import com.hasitha.onetoone.entity.Laptop;
import org.hibernate.HibernateException;

public interface LaptopService {

    int addLaptop(Laptop laptop) throws HibernateException;

}
