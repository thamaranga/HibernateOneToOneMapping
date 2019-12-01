package com.hasitha.dao;

import com.hasitha.entity.Laptop;
import org.hibernate.HibernateException;

public interface LaptopDAO {

    int addLaptop(Laptop laptop) throws HibernateException;

}
