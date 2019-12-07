package com.hasitha.onetoone.dao.impl;

import com.hasitha.onetoone.dao.LaptopDAO;
import com.hasitha.onetoone.entity.Laptop;
import com.hasitha.onetoone.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopDAOImpl implements LaptopDAO {


    @Override
    public int addLaptop(Laptop laptop)  throws HibernateException{
        int result=-1;
        Transaction transaction=null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction=session.beginTransaction();
            result=(int)session.save(laptop);
            transaction.commit();
            System.out.println("Laptop is created  with Id::"+result);

        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("e "+e);
            throw e;
        }
        return result;
    }


}
