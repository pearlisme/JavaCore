package com.pearl.java.designpattern;

public class AdapterDemo {

    public static void main(String[] args) {

Zora zora = new Zora(10000, "iphone", 101, "mobile phone",100);

        System.out.println(zora);
Product product = new Product(zora);
        System.out.println(product);


    }


}


class Product{

    private int id;
    private String name;
    private int price;

    public Product(Zora zora) {

        this.id = zora.getSku();
        this.name = zora.getName();
        this.price = zora.getPrice();
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}



class Zora {

    private int sku;
    private String name;
    private int dept;
    private String decription;
    private int price;


    public Zora(int sku, String name, int dept, String decription, int price) {
        this.sku = sku;
        this.name = name;
        this.dept = dept;
        this.decription = decription;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Zora{" +
                "sku=" + sku +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", decription='" + decription + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}