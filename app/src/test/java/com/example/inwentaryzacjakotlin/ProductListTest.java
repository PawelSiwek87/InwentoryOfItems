package com.example.inwentaryzacjakotlin;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProductListTest {

    Product product;

    ArrayList<Product> products;

    ProductList productList;

    @Test
    public void ShouldGetProductByName() {

        product = new Product(22,"oo");
        products = new ArrayList<Product>();
        products.add(product);
        productList = new ProductList(products);

        assertEquals(product, productList.getBuildingByName("oo"));

    }

    @Test
    public void ShouldGetProductByBarcode() {

        product = new Product(22,"oo");
        products = new ArrayList<Product>();
        products.add(product);
        productList = new ProductList(products);

        assertEquals(productList.getProductByBarcode(22), product);

    }

    @Test
    public void getChosenProduct() {
    }

    @Test
    public void setChosenProduct() {
    }

    @Test
    public void getNextId() {
    }
}