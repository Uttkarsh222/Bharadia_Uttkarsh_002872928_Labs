/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author uttkarsh
 */
public class Order {
    
    ArrayList<OrderItem> orderItemlist;
    
    public Order() {
        this.orderItemlist = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemlist() {
        return orderItemlist;
    }

    public void setOrderItemlist(ArrayList<OrderItem> orderItemlist) {
        this.orderItemlist = orderItemlist;
    }
    
    public void addNeworderItem(Product product, double price, int quantity){
        OrderItem orderItem = new OrderItem(product, price, quantity);
        orderItemlist.add (orderItem);
    }
    
     public void deleteItem(OrderItem item){
         orderItemlist.remove(item);
    }

    public OrderItem findProduct(Product product) {
    for (OrderItem orderItem : orderItemlist) {
        if (orderItem.getProduct().equals(product)) {
            return orderItem; // Return the found OrderItem
        }
    }
    return null; // Return null if the product is not found in the order
}
}
