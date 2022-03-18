package com.example.inwentaryzacjakotlin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProductListTest {

    Product product;
    Product product1;
    ArrayList<Product> products;
    ProductList productList;

    @Before
    public void onStart() {
        product = new Product(22, "oo");
        product1 = new Product(33, "zz");
        products = new ArrayList<Product>();
        products.add(product);
        products.add(product1);
        productList = new ProductList(products);
    }

    @Test
    public void ShouldGetProductByName() {

        assertEquals(product, productList.getProductByName("oo"));
    }

    @Test
    public void ShouldGetProductByBarcode() {

        assertEquals(productList.getProductByBarcode(22), product);
    }

    @Test
    public void ShouldUpdate() {
        System.out.println(product.getBarcode());
        //assertEquals(product., (int)1);
    }
}