package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.reponsitory.IProductReponsitory;
import com.codegym.reponsitory.ProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductReponsitory productReponsitory;
    @Override
    public List<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public void save(Product product) {
        productReponsitory.save(product);
    }

    @Override
    public Product findById(int id) {
        return productReponsitory.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productReponsitory.update(id, product);
    }

    @Override
    public void remove(int id) {
        productReponsitory.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {

        return productReponsitory.findByName(name);
    }


}
