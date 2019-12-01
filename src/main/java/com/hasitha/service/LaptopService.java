package com.hasitha.service;


import com.hasitha.entity.Laptop;
import org.hibernate.HibernateException;

public interface LaptopService {

    int addLaptop(Laptop laptop) throws HibernateException;

}
