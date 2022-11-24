package com.codegym.reponsitory.impl;

import com.codegym.model.Product;
import com.codegym.reponsitory.IProductReponsitory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductReponsitory {

    @Override
    public List<Product> findAll() {
        Session session = null;
        List<Product> productList = null;
        try {
            session = ConnectionUtils.sessionFactory.openSession();
            productList = session.createQuery("from Product").getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return productList;
    }

    @Override
    public void save(Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtils.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.save(product);

            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Product findById(int id) {
        Session session = null;
        Product product = null;
        try {
            session = ConnectionUtils.sessionFactory.openSession();
            product = (Product) session.createQuery("from Product p where id = :id").setParameter("id", id).getSingleResult();


        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }

    @Override
    public void update(int id, Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtils.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.merge(product);

            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void remove(int id) {
        Session session = null;
        Product product = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtils.sessionFactory.openSession();
            transaction = session.beginTransaction();
            product = (Product) session.createQuery("from Product p where id = :id").setParameter("id", id).getSingleResult();

            session.remove(product);
            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Product> findByName(String name) {
        Session session = null;
        List<Product> productList = null;

        try {
            session = ConnectionUtils.sessionFactory.openSession();
            productList = session.createQuery("from Product where name like :name").setParameter("name", "%" + name + "%").getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return productList;
    }


}
