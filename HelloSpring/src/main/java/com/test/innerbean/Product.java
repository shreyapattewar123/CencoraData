package com.test.innerbean;

public class Product {
    private String item;
    private String address;
    private String price;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", address='" + address + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
