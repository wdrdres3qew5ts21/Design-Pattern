/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observarpattern.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import observarpattern.model.subscribe.Subscribe;

/**
 *
 * @author Test
 */
public class Product{

    private String productName;

    private String brandName;

    private double price;

    private List<User> subsriberList = new ArrayList<>();

    public Product() {

    }

    public Product(String productName, String brandName, double price) {
        this.productName = productName;
        this.brandName = brandName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        String productNameBeforeChange = this.productName;
        this.productName = productName;
        this.notifyProductDetail("Product Name", productNameBeforeChange, productName);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        String brandNameBeforeChange = this.brandName;
        this.brandName = brandName;
        this.notifyProductDetail("Brand Name", brandNameBeforeChange, brandName);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double priceBeforeChange = this.price;
        this.price = price;
        this.notifyProductDetail("price", Double.toString(priceBeforeChange), Double.toString(this.price));
    }

    public List<User> getSubsriberList() {
        return getSubsriberList();
    }

    public void showSubscribeList() {
        System.out.println("--- Subscriber List ---");
        this.subsriberList.forEach(subsribe -> {
            System.out.println(subsribe.toString());
        });
    }

    public void addSubscriber(User subscriber) {
        this.subsriberList.add(subscriber);
    }

    public void notifyProductDetail(String changedAttribute, String attributeBeforeChange, String changedAttributeDetail) {
        this.subsriberList.forEach(subscribe -> {
            System.out.println("----- Subscribe User ------");
            System.out.println(subscribe.toString());
            System.out.println("Attribute That had Been change : " + changedAttribute);
            System.out.println(changedAttribute + "Before Change : " + attributeBeforeChange + " | " + changedAttribute + " After change : " + changedAttributeDetail);
            this.toString();
            System.out.println();
        });
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", brandName=" + brandName + ", price=" + price + '}';
    }

}
