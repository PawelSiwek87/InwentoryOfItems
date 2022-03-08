package com.example.inwentaryzacjakotlin;

public class Product {

    private int barcode;
    private String productName;

    public Product(int barcode, String productName) {
        this.barcode = barcode;
        this.productName = productName;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getBarcode() {
        return barcode;
    }

    public String getProductName() {
        return productName;
    }
}
