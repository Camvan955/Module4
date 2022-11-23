package com.codegym.reponsitory;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductReponsitory implements IProductReponsitory {
    private static Map<Integer, Product> productList = new LinkedHashMap<>();

    static {
        productList.put(1, new Product(1, "Máy tính Dell", "TQ", 16000000d));
        productList.put(2, new Product(2, "Điện thoại IP 12 Promax", "USA", 20000000d));
        productList.put(3, new Product(3, "Điện thoại IP 13", "USA", 22000000d));
        productList.put(4, new Product(4, "Điện thoại IP 14 Promax", "USA", 40000000d));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id, product);

    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        if (productList.size() == 0){
            return  products;
        }

        for (Product product : productList.values()){
            if(product.getName().contains(name)){
               products.add(product);
            }
        }
        return products;
    }


}
