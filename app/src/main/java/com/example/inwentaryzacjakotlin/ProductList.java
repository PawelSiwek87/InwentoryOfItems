package com.example.inwentaryzacjakotlin;

import java.util.ArrayList;

public class ProductList {

    public ArrayList<Product> products;
    public ArrayList<String> productsStringArray;
    private Product chosenProduct;

    public ProductList(ArrayList<Product> products) {
        this.products = products;
        updateStringArray();
    }

    private void updateStringArray() {
        productsStringArray = new ArrayList<>();
        for (Product b : products) productsStringArray.add(b.getProductName());
        //(need upgrade) productsStringArray.sort(String::compareToIgnoreCase);
        productsStringArray.add(0, "Wszystkie");
    }

    public Product getBuildingByName(String buildingName) {
        Product match = null;

        for (int i = 0; i < products.size() && match == null; i++)
            if (products.get(i).getProductName().equals(buildingName))
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
            if (b.getBarcode() > nextId) nextId = b.getBarcode();
        }
        return nextId + 1;
    }

}
