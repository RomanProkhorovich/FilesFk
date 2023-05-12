package com.example.Store.Repos;

import com.example.Store.Model.Record;
import com.example.Store.config.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Repository<T extends Record> {
    private final Class<T> cl;
    public Repository(Class<T> clazz) {
        cl = clazz;
    }
    public T findById(int id) {
        return (T) HibernateSessionFactoryUtil.getSessionFactory()
                .openSession()
                .get(cl, id);
    }

    public void save(T record) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(record);
        tx1.commit();
        session.close();
    }

    public void update(T record) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(record);
        tx1.commit();
        session.close();
    }

    public void delete(T record) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(record);
        tx1.commit();
        session.close();
    }

}
