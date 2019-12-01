package com.hasitha.service.impl;

import com.hasitha.dao.impl.LaptopDAOImpl;
import com.hasitha.entity.Laptop;
import com.hasitha.service.LaptopService;
import org.hibernate.HibernateException;

public class LaptopServiceImpl implements LaptopService {
    @Override
    public int addLaptop(Laptop laptop) throws HibernateException {
        return new LaptopDAOImpl().addLaptop(laptop);
    }


}
