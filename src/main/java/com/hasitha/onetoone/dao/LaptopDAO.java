package com.hasitha.onetoone.dao;

import com.hasitha.onetoone.entity.Laptop;
import org.hibernate.HibernateException;

public interface LaptopDAO {

    int addLaptop(Laptop laptop) throws HibernateException;

}
