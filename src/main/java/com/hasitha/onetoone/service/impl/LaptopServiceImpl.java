package com.hasitha.onetoone.service.impl;

import com.hasitha.onetoone.dao.impl.LaptopDAOImpl;
import com.hasitha.onetoone.entity.Laptop;
import com.hasitha.onetoone.service.LaptopService;
import org.hibernate.HibernateException;

public class LaptopServiceImpl implements LaptopService {
    @Override
    public int addLaptop(Laptop laptop) throws HibernateException {
        return new LaptopDAOImpl().addLaptop(laptop);
    }


}
