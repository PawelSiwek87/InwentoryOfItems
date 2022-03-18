package com.example.inwentaryzacjakotlin;

import java.util.ArrayList;

public class ProductList {

    public ArrayList<Product> products;
    public ArrayList<String> productsStringArray;
    private Product chosenProduct;

    public ProductList(ArrayList<Product> products) {
        this.products = products;
    }



    public Product getProductByName(String productName) {
        Product match = null;

        for (int i = 0; i < products.size() && match == null; i++)
            if (products.get(i).getProductName().equals(productName))
                match = products.get(i);

        return match;
    }
    public Product getProductByBarcode(int productBarcode) {
        Product match = null;

        for (int i = 0; i < products.size() && match == null; i++)
            if (productBarcode == products.get(i).getBarcode())
                match = products.get(i);

        return match;
    }

    public Product getChosenProduct() {
        return chosenProduct;
    }

    public void setChosenProduct(Product chosenProduct) {
        this.chosenProduct = chosenProduct;
    }

    public int getNextId(){
        int nextId = 0;

        for (Product b : products) {
            if (b.getBarcode() > nextId)
                nextId = b.getBarcode();
        }
        return nextId + 1;
    }

}
